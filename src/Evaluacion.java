import java.util.Scanner;

public class Evaluacion {

    String nombreAsignatura;
    double[] listaNotas;


    public Evaluacion(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public Evaluacion(String nombreAsignatura, double[] listaNotas) {
        this.nombreAsignatura = nombreAsignatura;
        this.listaNotas = listaNotas;
    }

    public void leerNotas(int totalAlumnos) {
        Scanner sc = new Scanner(System.in);
        String eleccion;
        if (listaNotas != null) {
            System.out.println("Notas ya introducidas desea introducirlas de nuevo(s/n)?");
            eleccion = sc.nextLine();

            if (eleccion.equalsIgnoreCase("s")) {
                this.listaNotas = new double[totalAlumnos];
                double nota;

                for (int j = 0; j < totalAlumnos; j++) {
                    do {
                        System.out.println("Introduzca la nota entre 0 y 10 (Ej 8,5)");
                        nota = sc.nextDouble();
                    } while (0 < nota && nota > 10);
                    listaNotas[j] = nota;
                }

            } else if (eleccion.equalsIgnoreCase("n")) {
                for (int k = 0; k < totalAlumnos; k++) {
                    System.out.println(listaNotas[k]);
                }
            }
        }
    }
}

