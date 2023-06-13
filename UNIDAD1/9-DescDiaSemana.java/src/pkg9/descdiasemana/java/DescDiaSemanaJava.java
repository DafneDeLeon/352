package pkg9.descdiasemana.java;
import java.util.Scanner;

public class DescDiaSemanaJava {
    static double pago, monto, iva ;
    static String dia;
   
    public static void main(String[] args) {
        pedirDatos();
        compra(pago, monto, iva, dia);
    }
    
    public static void pedirDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el monto de la compra:");
        monto = entrada.nextInt();
        System.out.println("Escriba el dia de la compra:");
        dia = entrada.next();
        
    }
    
    public static void compra(double pago, double monto, double iva, String dia){
       double res;
        String dias = dia.toLowerCase();
        if ("martes".equals(dias) || "jueves".equals(dias)) {
            pago = (monto-(monto * 0.20));
             iva = pago * 0.16;
             res = pago + iva;
             System.out.println("Hoy es "+dias+" dia de descuento.");
             System.out.println(" El monto a pagar es = "+res);
        }else{
            System.out.println("Hoy no es dia de descuento...");
            System.out.println("El monto total a pagar es: "+monto);
        }
             
    }
}
