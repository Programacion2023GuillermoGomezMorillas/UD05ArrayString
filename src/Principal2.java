import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos alumnos son?");
        int alumnos = sc.nextInt();
        System.out.println("Cuantas asignaturas tienen?");
        int asignaturas = sc.nextInt();
        System.out.println("Como se llama el grupo?");
        String nombreGrupo = sc.nextLine();
        Grupo grupo = new Grupo(nombreGrupo, alumnos, asignaturas);
        int opcion = 1;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    grupo.leerAlumnos();
                    break;
                case 2:
                    grupo.leerAsignatura();
                    break;
                case 3:
                    System.out.println(grupo.toString());
                    break;
                case 4:
                    grupo.mostrarAsignaturas();
                    break;
                case 5:
                    System.out.println(grupo.mostrarMedia());
                    break;
                case 6:
                    System.out.println(grupo.dameAsignaturaMinima());
                    break;
                case 7:
                    System.out.println(grupo.dameAsignaturaMaxima());
                    break;
                case 8:
                    System.out.println("De qué asignatura quieres ver la media?");
                    int indice = sc.nextInt();
                    System.out.println(grupo.dameMediaAsignatura(indice));
                    break;
                case 9:
                    System.out.println(grupo.muestraMediaAlumnos());
                    break;
                case 10:
                    grupo.muestraRepetidores();
                    break;
                case 11:
                    grupo.analizaAsignaturas();
                    break;
                case 12:
                    grupo.analizaCurso();
                case 13:
                    break;
            }
        }while (opcion != 13);
    }

    /**
     * Menu de navegacion
     *
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

