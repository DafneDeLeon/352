package pkg3.pkg1.edadesyalturas.java;
import java.util.Scanner;
/**
 *
 * @author Dafne
 */
public class EdadesyAlturasJava {

    
    public static void main(String[] args) {
        //Declarar variables
        Scanner entrada = new Scanner(System.in);
        int edad, media edad, suma_edad, mayor_edad, mayor_175;
        double altura, media_altura, suma_altura;
        //Inicializar variables
        mayor_edad = 0; media_altura = 0; mayor_175 = 0; suma_edad = 0; sauma_altura = 0;
        
        //Proceso
        for (int i = 1; i < 5; i++){
            System.out.println("*****************");
            System.out.println("*Amuno No." + i + "  *");
            System.out.println("*Introdusca la edad:   *");
            edad = entrada.nextInt();
            System.out.println("* Introduzca la altura:  *");
            altura = entrada.nextDouble();
            if(edad >= 18){
                mayor_edad++;
            }
            if(altura>1.75){
                mayor_175++;
            }
            suma_edad = suma_edad+edad;
        }
    }
    
}
