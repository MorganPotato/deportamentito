
import java.util.Scanner;
public class Departamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        int edad;
        char genero;
        char esResidente;
        float altura;
        long telefono;

        System.out.println("\n\n\t\tIngrese el nombre y apellido del residente :");
        nombre = scanner.nextLine();

        System.out.println("\n\n\t\tIngrese la edad del visitante:");
        edad = scanner.nextInt();

        System.out.println("\n\n\t\tIngrese el genero del visitante  (M/F) solamente:");
        genero = scanner.next().charAt(0);

        System.out.println("\n\n\t\t¿Es residente? (SI o NO):");
        esResidente = scanner.next().charAt(0);

        System.out.println("\n\n\t\tIngrese la altura del visitante (en centimetros):");
        altura = scanner.nextFloat();

        System.out.println("\n\n\t\tIngrese el telefono del visitante (sin guiones) :");
        telefono = scanner.nextLong();


        System.out.println("\n\n\t\tInformacion del visitante:");
        System.out.println("\n\n\t\tNombre: " + nombre);
        System.out.println("\n\n\t\tEdad: " + edad);
        System.out.println("\n\n\t\tGenero del residente :"  + genero);
        System.out.println("\n\n\t\tEs residente: " + esResidente);
        System.out.println("\n\n\t\tAltura: " + altura);
        System.out.println("\n\n\t\tTelefono: " + telefono);

        scanner.close();
    }
}