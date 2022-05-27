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

    public static void main(String[] args) {
        //serieFibonaci();
        fibonaciN();
    }    
}
