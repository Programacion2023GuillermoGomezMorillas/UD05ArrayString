import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        Principal2 principal = new Principal2();
        Scanner sc = new Scanner(System.in);
        int opcion = menu();
        switch (opcion) {
            case 1:
                principal.leerAlumnos();
                break;
            case 2:
                principal.mostrarNotas();
                break;
            case 3:
                principal.mostrarMedia();
                break;
            case 4:
                principal.mostrarMaximoMinimo();
                break;
            case 5:
                principal.suspensosAprobados();
                break;
            case 6:
                principal.mejorPeor();
                break;
            case 7:
                principal.cambiarNota();
                break;
            case 8:
                principal.dameAprobadosSuspendidos();
                break;
            case 9:
                principal.ordernarLista();
                break;
            case 10:
                principal.analizarGrupo();
                break;
            case 11:
                break;
            case 12:
                break;
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
    public void leerAlumnos(){
        Grupo grupo = new Grupo("DAM1k",3,2);
        Scanner sc = new Scanner(System.in);
        String grupoAlumnos;
        for (int i=0, k=1 ; i<grupo.totalAlumnos ; i++, k++) {
            System.out.println("Alumnos " + k);
            grupoAlumnos = sc.nextLine();
            grupo.alumnos[i] = grupoAlumnos;

        }
        Arrays.sort(grupo.alumnos);
    }
}

