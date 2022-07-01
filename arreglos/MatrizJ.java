import java.util.Scanner;

public class MatrizJ {
    static Scanner cs=new Scanner(System.in);
    public static void ejercicio2M() {
        int[][] matrizX=new int[5][6];
        int orden=1;
        for (int f = 0; f < matrizX.length-1; f++) {
            for (int c = 0; c < matrizX[0].length-1; c++) {
                System.out.println("Ingrese un numero en el orden "+orden+":");
                int valor=cs.nextInt();
                matrizX[f][c]=valor;
                matrizX[f][matrizX[0].length-1]+=valor;  
                matrizX[matrizX.length-1][matrizX[0].length-1]+=valor;  
                matrizX[matrizX.length-1][c]+=matrizX[f][c];
                orden++;
            }
        }
        imprimirMatriz(matrizX);
    }

    private static void imprimirMatriz(int[][] m) {
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[0].length; c++) {
                System.out.print(m[f][c]+"\t");                
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        ejercicio2M();
    }

}
