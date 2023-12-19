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
        Evaluacion evaluacion = new Evaluacion("Programación", new double[]{3, 2, 4, 6, 8});
        evaluacion.leerNotas(5);
        evaluacion.toString();
    }

    /**
     * Muentra las notas
     */
    public void mostrarNotas() {
        Evaluacion evaluacion = new Evaluacion("Programación", new double[]{5, 4, 3, 2, 1});
        evaluacion.toString();
    }

    /**
     * Hace la media de los alumnos
     */
    public void mostrarMedia() {
        Evaluacion evaluacion = new Evaluacion("Programación", new double[]{10, 8, 7, 6, 5});
        System.out.println(evaluacion.media());
    }

    /**
     * Te muestra la nota máxima y mínima de los alumnos
     */
    public void mostrarMaximoMinimo(){
        Evaluacion evaluacion = new Evaluacion("Programación", new double[]{10, 8, 7, 6, 5});
        System.out.println(evaluacion.maximo());
        System.out.println(evaluacion.minimo());

    }

    /**
     * Muestra el total de aprobados y de suspensos
     */
    public void suspensosAprobados(){
        Evaluacion evaluacion = new Evaluacion("Programación", new double[]{10, 3, 4, 6, 5});
        System.out.println("Hay " + evaluacion.totalAprobados() + " aprobados");
        System.out.println("Hay " + evaluacion.totalSuspensos() + " suspendidos");
    }

    /**
     * Muentra el mejor y el peor alumno
     */
    public void mejorPeor(){
        Evaluacion evaluacion = new Evaluacion("Programación", new double[]{10, 3, 4, 6, 5});
        System.out.println(evaluacion.peorAlumno());
        System.out.println(evaluacion.mejorAlumno());
    }

    /**
     * Cambia la nota de un alumno
     */
    public void cambiarNota(){
        Scanner sc = new Scanner(System.in);
        Evaluacion evaluacion = new Evaluacion("Programación", new double[]{10, 3, 4, 6, 5});
        //Aqui pedimos el alumno que queremos cambiar
        System.out.println("¿Que alumno quieres cambiar?");
        int alumno = sc.nextInt();
        alumno = alumno-1;
        evaluacion.notaAlumno(alumno);
        //Aqui pedimos la nota que queremos ponerle
        System.out.println("¿Que nota quieres ponerle?");
        int nota = sc.nextInt();
        evaluacion.cambiarNota(nota, alumno);
    }

    /**
     * Devuelve el array con los aprobados y los suspendidos
     */
    public void dameAprobadosSuspendidos(){
        Evaluacion evaluacion = new Evaluacion("Programación", new double[]{10, 3, 4, 6, 5});
        System.out.println(evaluacion.dameAprobados());
        System.out.println(evaluacion.dameSuspensos());
    }

    /**
     * Ordena la lista de menor a mayor
     */
    public void ordernarLista(){
        Evaluacion evaluacion = new Evaluacion("Programación", new double[]{10, 3, 4, 6, 5});
        double[] listaOrdenada = evaluacion.ordenar();
        System.out.println(Arrays.toString(listaOrdenada));
    }

    /**
     * Metodo para analizar del grupo dependiendo de sus notas
     */
    public void analizarGrupo(){
        Evaluacion evaluacion = new Evaluacion("Programación", new double[]{0, 3, 4, 6, 5});
        evaluacion.analizaGrupo();

    }
}
