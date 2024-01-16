import java.util.Scanner;

public class Principal3 {
    public static void main(String[] args) {
        Tarea3String dni = new Tarea3String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu NIF");
        String nif = sc.nextLine();
        dni.esCorrectoNIF(nif);

    }
}