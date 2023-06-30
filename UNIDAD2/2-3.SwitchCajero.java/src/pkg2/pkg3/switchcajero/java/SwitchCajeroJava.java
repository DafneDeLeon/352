package pkg2.pkg3.switchcajero.java;
import java.util.Scanner;
/**
 *
 * @author Dafne
 */
public class SwitchCajeroJava {

    
    public static void main(String[] args) {
        // Variables
        final int saldo_inicial=1000;
        int opcion;
        double ingreso,saldoActual,retiro;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("1. Ingresar dinero a la cuenta");
        System.out.println("2. Retirar dinero de la cuenta");
        System.out.println("3. Salir");
        
        System.out.print("Ingresa un numero: ");
        opcion = entrada.nextInt();
        
        switch(opcion){
            case 1 :
                System.out.println("Digite la cantidad que desea ingresar");
                ingreso = entrada.nextDouble();
                saldoActual = saldo_inicial+ingreso;
                System.out.println("El saldo Actual es: " + saldoActual);
                break;
            case 2 :
                System.out.println("Digite la cantidad que desea retirar");
                retiro = entrada.nextDouble();
                if(retiro<=saldo_inicial){
                     saldoActual = saldo_inicial-retiro;
                     System.out.println("Dinero en cuenta: ");
                }
        }
    }
    
}
