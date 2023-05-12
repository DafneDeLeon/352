/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplos;

import java.util.Scanner;
/**
 *
 * @author Dafne
 */
public class Multiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO");
        int num = sc.nextInt ();
        
            if(num % 3 == 0 && num % 5 == 0) {
                System.out.println("TriFiv");
            } else if(num % 3 == 0){
              System.out.println("Tri");
            } else if(num % 5 == 0) {             
              System.out.println("Friv");
            } else {
                System.out.println("El numero no es multiplo de 3 ni de 5");
            }
    }
}
    
