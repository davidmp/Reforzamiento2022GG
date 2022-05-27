print(f"Holas")
def serieFibonaci():
    nI=0
    nS=1
    n=int(input("Introduce el N numero:"))
    cont=1
    print(nI)
    while(cont<n):
        print(nS)
        nT=nS+nI
        nI=nS
        nS=nT
        cont=cont+1

def fibonaciN():
    nI=0
    nS=1
    n=int(input("Introduce el N numero:"))
    cont=1    
    if(n>1):        
        while(cont<n):
            nT=nS+nI
            nI=nS
            nS=nT
            cont=cont+1
    else:
        nS=n
    print(f"el fibonaci de {n} es {nS}")

#serieFibonaci()
#fibonaciN()

def siNumeroPrimo():
    num=int(input("Ingrese un numero:"))
    cont=1
    cantDiv=0
    while(cont<=num):
        if(num%cont==0):
            cantDiv=cantDiv+1
        cont=cont+1
    if(cantDiv==2):
        print(f"El numero {num} es primo")
    else:
        print(f"El numero {num} no es primo")

def numerosPrimos():
    num=int(input("Ingrese el limite maximo:"))
    numX=1
    while(numX<=num):
        cont=1
        cantDiv=0
        while(cont<=numX):
            if cantDiv>2:
                break
            if(numX%cont==0):
                cantDiv=cantDiv+1
            cont=cont+1
        if(cantDiv==2):
            print(f"{numX}")    
        numX=numX+1


numerosPrimos()

