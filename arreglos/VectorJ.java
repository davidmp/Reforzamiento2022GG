package arreglos;

/**
 * VectorJ
 */
public class VectorJ {

    public static void ejercicio1() {
        int[] num=new int[12];
        num[0]=39;
        num[1]=-2;
        num[4]=0;
        num[6]=14;
        num[8]=5;
        num[9]=120;

        /*for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+"\t");
            }*/
        for (int elemento : num) {
            System.out.print(elemento+"\t");
        }        
    }
 
    public static void ejercicio2() {
        char[] simbolo={'a','x', ' ',' ', '@',' ',' ', '+', 'Q',' '};
        for (char c : simbolo) {
            System.out.print(c+"\t");
        }
    }
    public static void main(String[] args) {
        ejercicio2();
        
    }

}