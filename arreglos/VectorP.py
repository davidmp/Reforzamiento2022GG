
def ejercicio1():
    num=[39,-2,0,0,0,0,14,0,5,120,0,0]
    print(len(num))

    for i in range(len(num)):
        print(num[i], end=" \t")

    #for elemento in num:
    #    print(elemento, end=" \t")

def ejercicio2():
    simbolo=['a','x', ' ',' ', '@',' ',' ', '+', 'Q',' ']
    for i in range(len(simbolo)):
        print(simbolo[i], end=" \t")


import random,math
def ejercicio4():
    numero=[]
    cuadrado=[]
    cubo=[]
    #print(len(cuadrado))
    for i in range(0,20):
        numero.append(random.randint(0, 100))
        cuadrado.append(math.pow(numero[i],2))
        cubo.append(math.pow(numero[i],3))
    
    for i in range(len(numero)):
        print(f"{numero[i]}\t{cuadrado[i]}\t{cubo[i]}")

ejercicio4()
