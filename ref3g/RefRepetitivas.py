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
fibonaciN()


