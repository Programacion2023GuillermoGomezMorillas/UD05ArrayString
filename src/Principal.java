import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Principal principal = new Principal();
        Scanner sc = new Scanner(System.in);
        int opcion = menu();
        switch (opcion) {
            case 1:
                principal.comprobarNotas();
            case 2:
                principal.mostrarNotas();
            case 3:
                principal.mostrarMedia();
            case 4:
                principal.mostrarMaximoMinimo();
            case 5:
                principal.suspensosAprobados();
        }
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        int opc;
        do {
            System.out.println("1- Leer Notas\n2-Mostrar Notas\n3-Mostrar la Median\n4-Mostrar Maximo y Minimo\n5-Mostrar suspensos y aprobados");
            opc = sc.nextInt();
        } while (opc < 1 || opc > 6);
        return opc;
    }

    public void comprobarNotas() {
        Evaluacion evaluacion = new Evaluacion("Programación", new double[]{3, 2, 4, 6, 8});
        evaluacion.leerNotas(5);
        evaluacion.toString();
    }

    public void mostrarNotas() {
        Evaluacion evaluacion = new Evaluacion("Programación", new double[]{5, 4, 3, 2, 1});
        evaluacion.toString();
    }

    public void mostrarMedia() {
        Evaluacion evaluacion = new Evaluacion("Programación", new double[]{10, 8, 7, 6, 5});
        System.out.println(evaluacion.media());
    }
    public void mostrarMaximoMinimo(){
        Evaluacion evaluacion = new Evaluacion("Programación", new double[]{10, 8, 7, 6, 5});
        System.out.println(evaluacion.maximo());
        System.out.println(evaluacion.minimo());

    }
    public void suspensosAprobados(){
        Evaluacion evaluacion = new Evaluacion("Programación", new double[]{10, 3, 4, 6, 5});
        System.out.println("Hay " + evaluacion.totalAprobados() + " aprobados");
        System.out.println("Hay " + evaluacion.totalSuspensos() + " suspendidos");
    }
}
