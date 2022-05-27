package ref3g;

import java.util.Scanner;

public class RefRepetitivas {
    static Scanner leerT=new Scanner(System.in);

    //Pregunta 01 Reforzamiento
    public static void serieFibonaci() {
        int nI=0, nS=1, nT;
        System.out.println("Introduce el N numero:");
        int n=leerT.nextInt();
        System.out.println(nI);
        int cont=1;
        while (cont<n) {  
            System.out.println(nS);              
            nT=nS+nI;                        
            nI=nS;
            nS=nT;  
            cont=cont+1;       
        }        
    }

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
        System.out.println("el fibonaci de "+n+" es:"+nS);
    }


    public static void siNumeroPrimo() {
        System.out.println("Ingrese un numero:");
        int num=leerT.nextInt();
        int cont=1;
        int cantDiv=0;
        while (cont<=num) {
            if (num%cont==0) {
                cantDiv++;
            }
            cont++; 
        }        
        if (cantDiv==2) {
            System.out.println("El numero "+num+" es primo");
        } else {
            System.out.println("El numero "+num+" no es primo");
        }
    }

    public static void numerosPrimos() {
        System.out.println("Ingrese el limite maximo:");
        int num=leerT.nextInt();       
        int numX=1;//6
        while(numX<=num){
            int cantDiv=0;
            int cont=1;
            while (cont<=numX) {
                if (cantDiv>2) break;
                if (numX%cont==0) {
                    cantDiv++;//3
                }
                cont++;//4
            }        
            if (cantDiv==2) {
                System.out.println(numX);
            }
            numX=numX+1;
        }        
    }

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
        //serieFibonaci();
        //fibonaciN();
        pintarU();
    }    
}
