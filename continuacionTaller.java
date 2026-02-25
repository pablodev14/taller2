import java.util.Scanner;

public class continuacionTaller {
    public static void main(String[] args) {
        try {

            double x = 0.0;
            double y = 0.0;

            int ecuacion = 0;

            Scanner sc = new Scanner(System.in);

            System.out.println("Hola usuario, en este programa podrá escoger 2 valores para dos variables X y Y, con las cuales podrá escoger " +
            "Entre 2 opciones distintas de ecuaciones para resolverlas");
            
            System.out.println("Perfecto, ahora, ingrese: 1 Para escoger la ecuacion uno | 2 para escoger la ecuacion dos | 3 Para salir del sistema:");
            ecuacion = sc.nextInt();
            sc.nextLine();
            
            
            switch (ecuacion) {
                case 1:
                    System.out.println("Hola mundo");
                    break;
            
                case 2:
                    System.out.println("Adios mundo");
                    break;

                case 3:
                    System.out.println("Saliendo del sistema....");
                    break;

                default:
            }

            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + " ");
        }
    }
}