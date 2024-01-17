import java.util.Scanner;

public class Principal3 {
    public static void main(String[] args) {
        Tarea3String dni = new Tarea3String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una frase" );
        String nif = sc.nextLine();
        System.out.println("Dime una palabra" );
        String palabra = sc.nextLine();
        System.out.println(dni.repeticiones(nif, palabra));
    }
}