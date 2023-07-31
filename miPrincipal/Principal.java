package miPrincipal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Areas a = new Areas();

        Scanner consola = new Scanner(System.in);

        System.out.println("Calculo de Areas");
        System.out.println("======================");

        System.out.print("Introduce la base:");
        b = consola.nextInt();
        
        System.out.print("Introduce la altura:");
        h = consola.nextInt();

        System.out.println("El área de un rectángulo con base de " + b + " y altura de " + h +  " es " + a.Rectangulo( b,b ));
        
        consola.close();
    }
}
