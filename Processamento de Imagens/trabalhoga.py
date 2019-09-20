import cv2
import numpy as np
from PIL import Image
from matplotlib import pyplot as plt
from os import system
import os.path

def carregaImagem():
    caminhoImg = input("Digite o caminho do arquivo ou o nome: ")
        

    while os.path.exists(caminhoImg) == False:
        system('cls')
        caminhoImg = input("Arquivo inválido, tente novamente: ")
        imagemOriginal = cv2.imread(caminhoImg)

    imagemOriginal = cv2.imread(caminhoImg)
    print("Imagem carregada com sucesso!!")
    return cv2.imread(caminhoImg)

def histEscalaCinza(img):
    plt.hist(img.ravel(), 256, [0, 256], label ="Escala de Cinza")
    plt.title("Escala de Cinza")
    plt.show()

def salvarImagem(nome, img):
    cv2.imwrite(nome, img)

def scalaImagem(scala, img):
    scale_percent = int(scala)
    width = int(img.shape[1] * scale_percent / 100)
    height = int(img.shape[0] * scale_percent / 100)
    dim = (width, height)
    
    return cv2.resize(img, dim, interpolation = cv2.INTER_AREA)

def diminuirLargura(tamanho, img):
    width = tamanho
    height = int(img.shape[0])
    dim = (width, height)
    
    return cv2.resize(img, dim, interpolation = cv2.INTER_AREA)

def diminuirAltura(tamanho, img):
    width = int(img.shape[0])
    height = tamanho
    dim = (width, height)
    
    return cv2.resize(img, dim, interpolation = cv2.INTER_AREA)


def main():
    print(' -------------------------------------------- ')
    print('| 1) Carregar Imagem                         |')
    print('| 2) Rotacionar Triangulo                    |')
    print('| 3) ------------                            |')
    print('| 4) ------------                            |')
    print('| 5) ------------                            |')
    print('| 6) ------------                            |')
    print('| 7) Sair                                    |')
    print(' -------------------------------------------- ')
    # caminhoImg = "flor.pgm"

    # # imgOriginal = carregaImagemPB(caminhoImg)
    # # salvarImagem("Escala.jpg", resized)
    
    # imgModificada = carregaImagemPB(caminhoImg)

    # resized = scalaImagem(20, imgModificada)

    # cv2.imshow('imageModificada', resized)

    # histEscalaCinza(resized)

    # cv2.waitKey(0)
    # cv2.destroyAllWindows()



if __name__ == "__main__":

    done = False
    imagemOriginal = []
    imagemModificada = []

    while not done:
        system('cls')
        main()
        option = input("Selecione uma opção: ")

        if option == '1':
            imagemModificada = carregaImagem()
            cv2.imshow('imageModificada', imagemModificada)
            histEscalaCinza(imagemModificada)
            cv2.waitKey(0)
            cv2.destroyAllWindows()
        # elif option == '2':  
            

        elif option == '7':
            done=True
            exit()