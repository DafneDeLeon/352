package pkg2.pkg6.fortablas.java;

/**
 *
 * @author Dafne
 */
public class ForTablasJava {

    public static void main(String[] args) {
        // TODO code application logic here
        int i,j ;
        for(i=1; 1<=10; i++){
            System.out.println("Tabla del " +i);
            System.out.println("--------------");
            
            for(j=1; j<=10; j++){
                System.out.println(i + "x" + j + "=" + j * i);
            }
        }
    }
    
}
