import cv2
import numpy as np
from PIL import Image
from matplotlib import pyplot as plt
from os import system
import os.path

def carregaImagem():
    system('cls')
    print("|         Escolha sua imagem         |")
    caminhoImg = input("Digite o caminho do arquivo ou o nome: ")
        

    while os.path.exists(caminhoImg) == False:
        system('cls')
        print("|         Escolha sua imagem         |")
        caminhoImg = input("Arquivo inválido, tente novamente: ")
        imagemOriginal = cv2.imread(caminhoImg)

    imagemOriginal = cv2.imread(caminhoImg)
    print("Imagem carregada com sucesso!!")
    return cv2.imread(caminhoImg)

def histEscalaCinza(img, titulo = ""):
    plt.hist(img.ravel(), 256, [0, 256], label ="Escala de Cinza")

    if(titulo != ""):
        plt.title(titulo)
    else:
        plt.title("Escala de Cinza")

    plt.show()

def salvarImagem(img):
    nome = input("Digite uma nome para o arquivo: ")
    cv2.imwrite(nome+".jpg", img)

def scalaImagem(img):
    scale_percent = int(input("Digite uma escala menor do que 100: "))

    while scale_percent >= 100:
        scale_percent = int(input("Escala Invalida, a escala deve ser menor do que 100: "))
    
    width = int(img.shape[1] * scale_percent / 100)
    height = int(img.shape[0] * scale_percent / 100)
    dim = (width, height)
    
    return cv2.resize(img, dim, interpolation = cv2.INTER_AREA)

def diminuirLargura(img):
    system('cls')
    widthOriginal = int(img.shape[1]) 
    height = int(img.shape[0])
    print("A largura atual é de: ", widthOriginal)
    width = int(input("Digite um valor menor que a largura: "))
    while width >= int(img.shape[1]):
        print("A largura atual é de: ", widthOriginal)
        width = int(input("Largura Invalida, digite um valor menor que a largura: "))
    
    dim = (width, height)
    
    return cv2.resize(img, dim, interpolation = cv2.INTER_AREA)

def diminuirAltura(img):
    system('cls')
    heightOriginal = int(img.shape[0]) 
    width = int(img.shape[1])
    print("A largura atual é de: ", heightOriginal)
    height = int(input("Digite um valor menor que a altura: "))

    while height >= int(img.shape[0]):
        print("A largura atual é de: ", heightOriginal)
        height = int(input("Altura Invalida, digite um valor menor que a altura: "))
    
    dim = (width, height)
    
    return cv2.resize(img, dim, interpolation = cv2.INTER_AREA)

def mostrarImagenseHistograma(imgOriginal, imgModificada):
    fig = plt.figure()
    
    plt1 = fig.add_subplot(2, 1, 1)
    plt2 = fig.add_subplot(2, 1, 2)

    plt1.hist(imgOriginal.ravel(), 256, [0, 256], label ="Escala de Cinza Original")
    plt1.set_title("Escala de Cinza Original")

    plt2.hist(imgModificada.ravel(), 256, [0, 256], label ="Escala de Cinza Modificada")
    plt2.set_title("Escala de Cinza Modificada")
    
    plt.show()

def reduzirColunaLinha(img):
    system('cls')
    print("|         Redução Coluna          |")
    print("\nSeleciona uma em cada N colunas, \ne para cada coluna uma a cada N linhas.\n")
    valor = int(input("Digite um valor para N: "))
    return img[::valor, ::valor]

def reduzirTons(img):
    r = 62
    img = np.uint8(img/r) * r
    return img

def main():
    print(' ------------------------------------------------- ')
    print('| 1) Carregar nova imagem                         |')
    print('| 2) Diminuir escala                              |')
    print('| 3) Diminuir largura                             |')
    print('| 4) Diminuir altura                              |')
    print('| 5) Reduzir por colunas e linhas                 |')
    print('| 6) Reduzir tons                                 |')
    print('| 7) ------------                                 |')
    print('| 8) Verificar imagens e seus histogramas         |')
    print('| 9) Salvar imagem modificada                     |')
    print('| 10) Sair                                        |')
    print(' ------------------------------------------------- ')
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
    system('cls')
    done = False
    imagemOriginal = []
    imagemModificada = []

    imagemModificada = carregaImagem()
    imagemOriginal = imagemModificada
    cv2.imshow('imageModificada', imagemModificada)
    histEscalaCinza(imagemModificada)
    cv2.waitKey(0)
    cv2.destroyAllWindows()
    while not done:
        system('cls')
        main()
        option = input("Selecione uma opção: ")

        if option == '1':
            imagemModificada= carregaImagem()
            imagemOriginal = imagemModificada 
            cv2.imshow('imageModificada', imagemModificada)
            histEscalaCinza(imagemModificada)
            cv2.waitKey(0)
            cv2.destroyAllWindows()
        #amplitude
        elif option == '2':  
            imagemModificada = scalaImagem(imagemModificada)
            cv2.imshow('Imagem em Escala', imagemModificada)
            histEscalaCinza(imagemModificada)
            cv2.waitKey(0)
            cv2.destroyAllWindows()

        elif option == '3': 
            imagemModificada = diminuirLargura(imagemModificada)
            cv2.imshow('Imagem com largura diminuida', imagemModificada)
            histEscalaCinza(imagemModificada)
            cv2.waitKey(0)
            cv2.destroyAllWindows()
        
        elif option == '4':
            imagemModificada = diminuirAltura(imagemModificada)
            cv2.imshow('Imagem com altura diminuida', imagemModificada)
            histEscalaCinza(imagemModificada)
            cv2.waitKey(0)
            cv2.destroyAllWindows()

        elif option == '5':
            n = 6
            imagemModificada = reduzirColunaLinha(imagemModificada)
            cv2.imshow('Imagem com altura diminuida', imagemModificada)
            histEscalaCinza(imagemModificada)
            cv2.waitKey(0)
            cv2.destroyAllWindows()

        
        elif option == '6':
            imagemModificada = reduzirTons(imagemModificada)
            cv2.imshow('Imagem com redução de tons', imagemModificada)
            histEscalaCinza(imagemModificada)
            cv2.waitKey(0)
            cv2.destroyAllWindows()
        
        elif option == '7':
            cv2.imshow('Imagem Original', imagemOriginal)
            cv2.imshow('Imagem Modificada', imagemModificada)
            mostrarImagenseHistograma(imagemOriginal, imagemModificada)
            cv2.waitKey(0)
            cv2.destroyAllWindows()

        elif option == '9':
            salvarImagem(imagemModificada)

        elif option == '10':
            done=True
            exit()