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

        System.out.println("El área de un cuadrado con un lado de " + b + "es " + a.Cuadrado( b ));
        System.out.println("El área de un cuadrado con un lado de " + h + "es " + a.Cuadrado( h ));
        
        System.out.println("El área de un rectángulo con base de " + b + " y altura de " + h +  " es " + a.Rectangulo( b,h ));
        System.out.println("El área de un triángulo con base de " + b + " y altura de " + h +  " es " + a.Triangulo( b,h ));
        System.out.println("El área de un romboide con base de " + b + " y altura de " + h +  " es " + a.Romboide( b,h ));
        
        consola.close();
    }
}
