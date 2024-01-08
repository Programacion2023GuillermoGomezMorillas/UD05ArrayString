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
        } while (opc < 1 || opc > 10);
        return opc;
    }

    /**
     * Comprueba las notas y te las muestra
     */
    public void comprobarNotas() {
        Asignatura asignatura = new Asignatura("Programación", new double[]{3, 2, 4, 6, 8});
        asignatura.leerNotas(5);
        asignatura.toString();
    }

    /**
     * Muentra las notas
     */
    public void mostrarNotas() {
        Asignatura asignatura = new Asignatura("Programación", new double[]{5, 4, 3, 2, 1});
        asignatura.toString();
    }

    /**
     * Hace la media de los alumnos
     */
    public void mostrarMedia() {
        Asignatura asignatura = new Asignatura("Programación", new double[]{10, 8, 7, 6, 5});
        System.out.println(asignatura.media());
    }

    /**
     * Te muestra la nota máxima y mínima de los alumnos
     */
    public void mostrarMaximoMinimo(){
        Asignatura asignatura = new Asignatura("Programación", new double[]{10, 8, 7, 6, 5});
        System.out.println(asignatura.maximo());
        System.out.println(asignatura.minimo());

    }

    /**
     * Muestra el total de aprobados y de suspensos
     */
    public void suspensosAprobados(){
        Asignatura asignatura = new Asignatura("Programación", new double[]{10, 3, 4, 6, 5});
        System.out.println("Hay " + asignatura.totalAprobados() + " aprobados");
        System.out.println("Hay " + asignatura.totalSuspensos() + " suspendidos");
    }

    /**
     * Muentra el mejor y el peor alumno
     */
    public void mejorPeor(){
        Asignatura asignatura = new Asignatura("Programación", new double[]{10, 3, 4, 6, 5});
        System.out.println(asignatura.peorAlumno());
        System.out.println(asignatura.mejorAlumno());
    }

    /**
     * Cambia la nota de un alumno
     */
    public void cambiarNota(){
        Scanner sc = new Scanner(System.in);
        Asignatura asignatura = new Asignatura("Programación", new double[]{10, 3, 4, 6, 5});
        //Aqui pedimos el alumno que queremos cambiar
        System.out.println("¿Que alumno quieres cambiar?");
        int alumno = sc.nextInt();
        alumno = alumno-1;
        asignatura.notaAlumno(alumno);
        //Aqui pedimos la nota que queremos ponerle
        System.out.println("¿Que nota quieres ponerle?");
        int nota = sc.nextInt();
        asignatura.cambiarNota(nota, alumno);
    }

    /**
     * Devuelve el array con los aprobados y los suspendidos
     */
    public void dameAprobadosSuspendidos(){
        Asignatura asignatura = new Asignatura("Programación", new double[]{10, 3, 4, 6, 5});
        System.out.println(asignatura.dameAprobados());
        System.out.println(asignatura.dameSuspensos());
    }

    /**
     * Ordena la lista de menor a mayor
     */
    public void ordernarLista(){
        Asignatura asignatura = new Asignatura("Programación", new double[]{10, 3, 4, 6, 5});
        double[] listaOrdenada = asignatura.ordenar();
        System.out.println(Arrays.toString(listaOrdenada));
    }

    /**
     * Metodo para analizar del grupo dependiendo de sus notas
     */
    public void analizarGrupo(){
        Asignatura asignatura = new Asignatura("Programación", new double[]{0, 3, 4, 6, 5});
        asignatura.analizaGrupo();

    }
}
