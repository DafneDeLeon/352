package pkg2.pkg8.whilecuadrado.java;
import java.util.Scanner;
/**
 *
 * @author Dafne
 */
public class WhileCuadradoJava {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, cuadrado;
        
         System.out.println("Introdusca el numero");
         num = entrada.nextInt();
         while(num>0){
             cuadrado = num * num;
             System.out.println("El cuadrado de " + num +"es igual a " + cuadrado);
             
             System.out.println("");
             System.out.println("Introdusca otro numero: ");
             num = entrada.nextInt();
             
         }
    }
    
}
