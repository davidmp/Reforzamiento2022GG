package reforzamiento;

import java.util.Scanner;

/**
 * Ejercicios
 */
public class Ejercicios {

    public static void mostrarcursoDia() {
         //Definir Variable
         int diaSem;
         String mensaje;
         String primeraParteM="Ese dia toca el curso de: ";
         //Leer datos 
         Scanner leerT=new Scanner(System.in);
         System.out.println("Ingrese un dia de la semana:\n1=Dom"+
         "\n2=Lun\n3=Mar\n4=Mie\n5=Jue\n6=Vie\n7=Sab");
         diaSem=leerT.nextInt();
         //Proceso
         if (diaSem==1 || diaSem==7) {
            mensaje="No hay Clases";
         }else if(diaSem==2){
             mensaje=primeraParteM+"Matematica";
         }else if(diaSem==3 || diaSem==5){
            mensaje=primeraParteM+"Fundamentos de Programacion";
         }else if(diaSem==4){
             mensaje=primeraParteM+"Capacidades comunicativas";
         }else if(diaSem==6){
            mensaje=primeraParteM+"Introduccion a la Ingenieria de Sistemas";
         }else{
            mensaje="El dia que coloco no existe";
         }
         //datos de salida
         System.out.println(mensaje);
    }

    public static void main(String[] args) {
        mostrarcursoDia();
    }
    
}