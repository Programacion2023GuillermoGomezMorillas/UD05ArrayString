import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Principal principal = new Principal();
        Scanner sc = new Scanner(System.in);
        int opcion = menu();
        switch (opcion){
            case 1:
                principal.comprobarNotas();
            case 2:
                principal.mostrarNotas();
            case 3:
                principal.mostrarMedia();
        }
    }
    public static int menu(){
        Scanner sc = new Scanner(System.in);
        int opc;
        do {
            System.out.println("1- Leer Notas\n2-Mostrar Notas\n3-Mostrar la Media ");
            opc = sc.nextInt();
        }while(opc < 1 || opc > 6);
        return opc;
    }
    public void comprobarNotas(){
        Evaluacion evaluacion = new Evaluacion("Programación", new double[]{3, 2, 4, 6, 8, 3, 2, 5, 7, 10, 9, 6, 4});

    }
    }
