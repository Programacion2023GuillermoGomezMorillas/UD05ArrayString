import java.util.Arrays;
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
        } else {
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

    /**
     * @return Devuelve el string con el listado de los alumnos y sus notas
     */
    @Override

    public String toString() {
        String listaAlumnos = "";
        if (listaNotas == null) {

            return "Sin notas por el momento";
        } else {
            System.out.println("Asignatura: " + nombreAsignatura);

            for (int j = 0, i = 1; j < listaNotas.length; j++, i++) {
                listaAlumnos += "\nAlumno " + i + ": " + listaNotas[j] + "\n";
            }
            return listaAlumnos;
        }
    }

    public double media(double[] listasNotas) {
        int comprobante = comprobarNotas(listasNotas);
        double media = 0;
        if (comprobante == -1) {
            System.out.println("Sin notas por el momento");
        } else {
            for (int i = 0; i < listasNotas.length; i++) {
                media += listasNotas[i];
            }
        }
        return media;
    }

    public int comprobarNotas(double[] compruebaLista) {
        if (compruebaLista == null) {
            return -1;
        } else {
            return 0;
        }
    }
}



