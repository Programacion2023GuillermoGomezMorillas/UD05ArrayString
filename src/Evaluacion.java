import java.util.Scanner;

public class Evaluacion {

    String nombreAsignatura;
    double[] listaNotas;
    Scanner sc = new Scanner(System.in);


    public Evaluacion(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public Evaluacion(String nombreAsignatura, double[] listaNotas) {
        this.nombreAsignatura = nombreAsignatura;
        this.listaNotas = listaNotas;
    }

    public void leerNotas(int totalAlumnos) {
        String eleccion;
        if (listaNotas != null) {
            System.out.println("Notas ya introducidas desea introducirlas de nuevo(s/n)?");
            eleccion = sc.nextLine();

            if (eleccion.equalsIgnoreCase("s")) {
                crearLista(totalAlumnos);

            } else if (eleccion.equalsIgnoreCase("n")) {
                for (int k = 0; k < totalAlumnos; k++) {
                    System.out.println(listaNotas[k]);
                }
            }
        }
        else {
            crearLista(totalAlumnos);
        }
    }
    /**
     * Método para introducir las notas en el array
     */
    public void crearLista(int totalAlumnos) {
        this.listaNotas = new double[totalAlumnos];
        double nota;
        for (int j = 0; j < totalAlumnos; j++) {
            do {
                System.out.println("Introduzca la nota entre 0 y 10 (Ej 8,5)");
                nota = sc.nextDouble();
            } while (0 < nota && nota > 10);
            System.out.print(listaNotas[j]);
        }

    }

    @Override
    public String toString() {
        System.out.println("Asignatura: " + nombreAsignatura);
        for (int j=0; j< listaNotas.length;j++) {
            return "\nAlumno 1: " + listaNotas[0] + "\nAlumno 2: " + listaNotas[0] +
        }
    }
}


