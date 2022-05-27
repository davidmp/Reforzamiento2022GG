package refrepetitivas;

import java.util.Scanner;

public class RefRepetitivas {

    static Scanner leerT=new Scanner(System.in);
    //Pregunta 01 Reforzamiento
    public static void serieFibonaci() {
        int nI=0, nS=1, nT;
        System.out.println("Introduce el N numero:");
        int n=leerT.nextInt();
        System.out.println(nI);
        while (nS<n) {  
            System.out.println(nS);              
            nT=nS+nI;                        
            nI=nS;
            nS=nT;            
        }        
    }
    /* Los números de Fibonacci quedan definidos por las ecuaciones
    f(0)=0
    f(1)=1
    f(n)=f(n-1)+f(n+2)  
    
    f(2)=1
    f(3)=2

    f(8)=21
    */
    public static void fibonaciN() {
        int nI=0, nS=1, nT;
        System.out.println("Introduce el N numero:");
        int n=leerT.nextInt();
        int cont=1;
        if(n>1){
            while (cont<n) {
                nT=nS+nI;
                nI=nS;
                nS=nT;    
                cont++;            
            }
        }else{nS=n;}
        System.out.println("el factorial de "+n+" es:"+nS);
    }


    public static void main(String[] args) {
        System.out.println("Introduce Numero algoritmo:");
        int opc=leerT.nextInt();
        switch (opc) {
            case 1: serieFibonaci(); break;
            case 2: fibonaciN(); break;
        
            default:break;
        }
    }
    
}