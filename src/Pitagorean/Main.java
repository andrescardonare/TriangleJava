package Pitagorean;

import static Pitagorean.Triangle.triangleList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // inicializa scanner
        // Triangulitos de prueba

        /*
        Triangle tri3 = new Triangle(3,3,3, "tri3");
        Triangle tri1 = new Triangle(1,1,1, "tri1");
        Triangle tri2 = new Triangle(2,2,2, "tri2");
        */

        System.out.print("Cuantos triangulos desea computar?: ");
        int n = scanner.nextInt();
        if (n <= 0){System.out.print("No..."); return;}

        // itera n veces la construcción de los triangulos en el listado estatico de la clase
        for (int i = 0; i < n; i++){
            buildTriangle();
        }

        // muestra los triangulos ordenados por su atributo de area
        System.out.println("\nLa lista de triangulos es: ");
        for (int i = 0; i < triangleList.size(); i++){
            System.out.print(triangleList.get(i).name + "   ");
            System.out.println(triangleList.get(i).area);
        }

        System.out.println("\nEl/Los triangulos de mayor area son: ");
        for (int i = 0; i < triangleList.size(); i++){
            if(triangleList.get(i).area == triangleList.get(triangleList.size() - 1).area){
                System.out.print(triangleList.get(i).name + "   ");
                System.out.println(triangleList.get(i).area);
            }
        }

        System.out.println("\nEl/Los triangulos de menor area son: ");
        for (int i = 0; i < triangleList.size(); i++){
            if(triangleList.get(i).area == triangleList.get(0).area){
                System.out.print(triangleList.get(i).name + "   ");
                System.out.println(triangleList.get(i).area);
            }
        }

        System.out.println("\nEl/Los triangulos de mayor a menor area son: ");
        for (int i = triangleList.size() - 1; i >= 0; i--){
            System.out.print(triangleList.get(i).name + "   ");
            System.out.println(triangleList.get(i).area);
        }



        scanner.close(); // cierra scanner
    }

    private static Triangle buildTriangle(){ //metodo privado para uso en main() construir triangulo por user input
        Scanner scanner1 = new Scanner(System.in); // inicializa scanner

        //pregunta y recopila respuestas
        System.out.print("Nombre su triangulo: ");
        String name = scanner1.nextLine();

        System.out.print("Digite el lado 1: ");
        float c1 = scanner1.nextFloat();

        System.out.print("Digite el lado 2: ");
        float c2 = scanner1.nextFloat();

        System.out.print("Digite el lado 3: ");
        float c3 = scanner1.nextFloat();

        return new Triangle(c1, c2, c3, name); //retorna triangulo
    }
}