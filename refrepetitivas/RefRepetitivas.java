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
        System.out.println("Introduce  un numero:");
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
    /*
    Pregunta 3
    */
    public static void siNumeroPrimo() {
        int n,i=1,band=0;
        System.out.println("Ingrese número: ");
        n=leerT.nextInt();
        while (i<=n) {
            if (n%i == 0) {
                band++;
            }
            i++;
            if (band>2) { break;}
        }

        if (band==2) {
            System.out.println("Es primo");
        }else{System.out.println("No es primo");}
    }

    /*
    Pregunta 6
    */
    public static void pintarPiramide() {
        System.out.println("Ingese Altura de la Letra:"); 
        int cantF=leerT.nextInt();
        System.out.println("Ingrese el Caracter:");
        char caracter=leerT.next().charAt(0);
        int medio=cantF+1;
         for (int f = 1; f <= cantF; f++) {
             for (int c = 1; c <= 2*cantF+1; c++) {
                 if (f==1 && medio==c) {
                     System.out.print(caracter);
                 }else if(c>=medio-f && f>1 && c<=medio+f ){
                     System.out.print(caracter);
                 }else if(f==cantF){
                     System.out.print(caracter);
                 }else{
                     System.out.print(" ");
                 }
             }
             System.out.print("\n");
         }
         System.out.println("");
    }    

 /*
    Pregunta 10
    */
    public static void pintarU() {
        System.out.println("Ingese Altura de la Letra:"); 
        int cantF=leerT.nextInt();
        System.out.println("Ingrese el Caracter:");
        char caracter=leerT.next().charAt(0);
        
         for (int f = 1; f <= cantF; f++) {
             for (int c = 1; c <= cantF; c++) {
                 if ((c==1 || c==cantF)  && f<cantF) {
                     System.out.print(caracter);
                 }else if(f==cantF && c>1 && c<=cantF-1 ){
                     System.out.print(caracter);
                 }else{
                     System.out.print(" ");
                 }
             }
             System.out.print("\n");
         }
         System.out.println("");
    }

    public static void main(String[] args) {
        System.out.println("Introduce Numero algoritmo:");
        int opc=leerT.nextInt();
        switch (opc) {
            case 1: serieFibonaci(); break;
            case 2: fibonaciN(); break;
            case 3: siNumeroPrimo(); break;
            case 4: pintarPiramide(); break;
            case 5: pintarU(); break;

        
            default:break;
        }
    }
    
}