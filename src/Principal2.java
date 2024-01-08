import java.util.Scanner;

public class Principal2 {
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
            case 6:
                principal.mejorPeor();
            case 7:
                principal.cambiarNota();
            case 8:
                principal.dameAprobadosSuspendidos();
            case 9:
                principal.ordernarLista();
            case 10:
                principal.analizarGrupo();
            case 11:
            case 12:
            case 13:
                break;
        }
    }

    /**
     * Menu de navegacion
     * @return
     */
    public static int menu() {
        Scanner sc = new Scanner(System.in);
        int opc;
        do {
            System.out.println("1-Leer Notas\n2-Mostrar Notas\n3-Mostrar la Median\n4-Mostrar Maximo y Minimo\n5-Mostrar suspensos y aprobados\n6-Saber mejor y peor alumno\n7-Cambiar una nota de un alumno\n8-Todos los aprobados y suspendidos\n9-Ordena la lista de menor a mayor\n10-Analiza al grupo");
            opc = sc.nextInt();
        } while (opc < 1 || opc > 13);
        return opc;
    }

}

