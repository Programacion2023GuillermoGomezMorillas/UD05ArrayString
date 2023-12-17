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
    public int comprobarNotas(double[] compruebaLista) {
        if (compruebaLista == null) {
            return -1;
        } else {
            return 0;
        }
    }

    public double media() {
        int comprobante = comprobarNotas(listaNotas);
        double media = 0;
        if (comprobante == -1) {
            System.out.println("Sin notas por el momento");
        } else {
            for (int i = 0; i < listaNotas.length; i++) {
                media += listaNotas[i];
            }
        }
        return media;
    }

    public double minimo() {
        int comprobante = comprobarNotas(listaNotas);
        double minimo = 10;
        if (comprobante == -1) {
            System.out.println("Sin notas por el momento");
        } else {
            for (int i = 0; i < listaNotas.length; i++){
                if (listaNotas[i] < minimo){
                    minimo = listaNotas[i];
                }
            }
        }
        return minimo;
    }
    public double maximo() {
        int comprobante = comprobarNotas(listaNotas);
        double maximo = 0;
        if (comprobante == -1) {
            System.out.println("Sin notas por el momento");
        } else {
            for (int i = 0; i < listaNotas.length; i++){
                if (listaNotas[i] > maximo){
                    maximo = listaNotas[i];
                }
            }
        }
        return maximo;
    }
    public int totalSuspensos() {
        int comprobante = comprobarNotas(listaNotas);
        int cont = 0;
        if (comprobante == -1) {
            System.out.println("Sin notas por el momento");
        } else {
            for (int i = 0; i < listaNotas.length; i++){
                if (listaNotas[i] < 5){
                    cont++;
                }
            }
        }
       return cont;
    }
    public int totalAprobados() {
        int comprobante = comprobarNotas(listaNotas);
        int cont = 0;
        if (comprobante == -1) {
            System.out.println("Sin notas por el momento");
        } else {
            for (int i = 0; i < listaNotas.length; i++){
                if (listaNotas[i] > 4){
                    cont++;
                }
            }
        }
        return cont;
    }
    public void cambiarNota(double nota, int alumno){
        alumno = alumno-1;
        if (alumno > listaNotas.length || alumno < 0){
            System.out.println("No existe ese alumno");
        }
        else {
            listaNotas[alumno] = nota;
        }
    }
    public double mejorAlumno(){
        double mejor=0;
        for (int i=0; i<listaNotas.length; i++)
            if (listaNotas[i] == maximo()){
                mejor = i;
            }
        return mejor;
    }
    public double peorAlumno(){
        double peor=0;
        for (int i=0; i<listaNotas.length; i++)
            if (listaNotas[i] == minimo()){
                peor = i;
            }
        return peor;
    }

    public double notaAlumno(int indiceAlumno){
        indiceAlumno = indiceAlumno-1;
        if (indiceAlumno > listaNotas.length || indiceAlumno < 0){
            return -1;
        }
        return listaNotas[indiceAlumno];
    }
    public int[] dameAprobados(){
        int aprobados = totalAprobados();
        int[] alumnosAprobados = new int[aprobados];
    if (aprobados == 0){
        System.out.println("No hay aprobados");
    }else {
        for (int i=0 ; i<listaNotas.length ; i++){
            int j = 0;
            if (listaNotas[i]>4){
                listaNotas[i]= alumnosAprobados[j];
                j++;
            }
        }
    }
        System.out.println(Arrays.toString(alumnosAprobados));
    return alumnosAprobados;
    }

    public int[] dameSuspensos(){
        int suspensos = totalSuspensos();
        int[] alumnosSuspensos = new int[suspensos];
        if (suspensos == 0){
            System.out.println("No hay aprobados");
        }else {
            for (int i=0 ; i<listaNotas.length ; i++){
                int j = 0;
                if (listaNotas[i]>4){
                    listaNotas[i]= alumnosSuspensos[j];
                    j++;
                }
            }
        }
        System.out.println(Arrays.toString(alumnosSuspensos));
        return alumnosSuspensos;
    }
    public double[] ordenar(){
        double[] listaOrdenada;
        listaOrdenada = Arrays.copyOf(listaNotas, 0);
        Arrays.sort(listaOrdenada);
        return listaOrdenada;
    }
    public void analizaGrupo(){
        double[] listaAnalizar = ordenar();
        for (int i =0 ; i<listaAnalizar.length ; i++){

        }
    }
}



