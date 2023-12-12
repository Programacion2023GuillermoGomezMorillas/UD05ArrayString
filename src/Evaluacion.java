public class Evaluacion {

    String nombreAsignatura;
    double listaNotas[];


    public Evaluacion(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public Evaluacion(String nombreAsignatura, double[] listaNotas) {
        this.nombreAsignatura = nombreAsignatura;
        this.listaNotas = listaNotas;
    }
    public void leerNotas(int totalAlumnos){
        if (listaNotas==null) {
            System.out.println("Notas ya introducidas desea introducirlas de nuevo(s/n)?");

        }
        }
    }

