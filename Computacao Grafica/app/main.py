import cv2
import numpy as np

# inverte o ponto y
def triangle_mirror(points):
    new_points = []
    for x, y in points:
        new_points.append((x, -y))

    return new_points

# verifica se é um triangulo ou uma quadrado e altera seus pontos para aplicar uma certa angulação
def rotate(points, angle):
    new_points = []
    count = 0
    if len(points) == 3:
        for x, y in points:
            count += 1
            if count == 1:
                new_points.append((int(x + (angle * 1.5)), y))
            elif count == 2:
                new_points.append((x + angle, y + angle))
            else:
                new_points.append((x + angle, int(y + (angle / 2))))
    else:
        for x, y in points:
            count += 1
            if count == 1:
                new_points.append((x, int(y + (angle / 3))))
            elif count == 2:
                new_points.append((x, int(y + ((2 * angle) / 3))))
            elif count == 3:
                new_points.append((x + angle, int(y + ((2 * angle) / 3))))
            else:
                new_points.append((x + angle, int(y + (angle / 3))))

    return new_points

# soma valores aos eixos x e y para movimentar o objeto
def translate(points, tx = 0, ty = 0):
    return [(x + tx, y + ty) for x, y in points]

border_color = (0, 255, 0)
border_2 = (0, 76, 153)
border_1 = (0, 255, 255)
border_px = 2
path = r'branco.png'
# Reading an image in default mode
image = cv2.imread(path)
# Window name in which image is displayed
window_name = 'Image'

# create a circle
radius = 50
center_coordinates = [(215, 140)]
square = [(10, 10), (80, 10), (80, 80), (10, 80)]
rectangle = [(120, 80), (130, 80), (130, 20), (120, 20)]
triangle = [(20, 30), (30, 10), (10, 10)]

cv2.drawContours(image, [np.array(translate(square, 245, 110))], 0, border_2, border_px)
cv2.drawContours(image, [np.array(translate(rectangle, 165, 150))], 0, border_2, border_px)
cv2.drawContours(image, [np.array(translate(triangle_mirror(triangle), 270, 240))], 0, border_2, border_px)
cv2.drawContours(image, [np.array(translate(triangle, 270, 137))], 0, border_2, border_px)
cv2.drawContours(image, [np.array(translate(triangle_mirror(triangle), 270, 172))], 0, border_2, border_px)

image = cv2.circle(image, center_coordinates[0], radius, border_color, border_px)
image = cv2.circle(image, translate(center_coordinates, 15, -40)[0], radius, border_color, border_px)
image = cv2.circle(image, translate(center_coordinates, 75, -50)[0], radius, border_color, border_px)
image = cv2.circle(image, translate(center_coordinates, 135, -40)[0], radius, border_color, border_px)
image = cv2.circle(image, translate(center_coordinates, 150, 0)[0], radius, border_color, border_px)



# Displaying the image
cv2.imshow(window_name, image)
cv2.waitKey(0)


