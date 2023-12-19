import java.util.Arrays;
import java.util.Scanner;

/**
 * Se trata de una clase que contiene las notas de un grupo y puden ser consultadas, visualizadas y modificadas
 */
public class Evaluacion {
    //Declaracion de variables
    private String nombreAsignatura;
    private double[] listaNotas;
    Scanner sc = new Scanner(System.in);

    /**
     * Constructor para el nombre de la asignatura
     * @param nombreAsignatura
     */
    public Evaluacion(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    /**
     * Constructor para el nombre de la asignatura y la lista de las notas
     * @param nombreAsignatura
     * @param listaNotas
     */
    public Evaluacion(String nombreAsignatura, double[] listaNotas) {
        this.nombreAsignatura = nombreAsignatura;
        this.listaNotas = listaNotas;
    }

    /**
     *
     * @param totalAlumnos Muestra las notas que hay, y si no hay, las crea para que el usuario las introduzca
     */
    public void leerNotas(int totalAlumnos) {
        String eleccion;
        //Si existe la lista, pregunta si quieres sobrescribir las notas o no
        if (listaNotas != null) {
            System.out.println("Notas ya introducidas desea introducirlas de nuevo(s/n)?");
            eleccion = sc.nextLine();
            //Si la respuesta es que si, te envia a un metodo para crear la lista
            if (eleccion.equalsIgnoreCase("s")) {
                crearLista(totalAlumnos);
                //Si la respuesta es que no, te muestra la lista que habia antes
            } else if (eleccion.equalsIgnoreCase("n")) {
                for (int k = 0; k < totalAlumnos; k++) {
                    System.out.print(listaNotas[k] + ", ");
                }
            }
            //Si no existe lista, crea una nueva
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
        //Bucle para introducir las notas dependiendo de los alumnos totales
        for (int j = 0; j < totalAlumnos; j++) {
            do {
                System.out.println("Introduzca la nota entre 0 y 10 (Ej 8,5)");
                nota = sc.nextDouble();
                listaNotas[j] = nota;
            } while (0 < nota && nota > 10);
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
                System.out.print("Alumno " + i + ": " + listaNotas[j] + "\n");
        }
        }
        return listaAlumnos;
    }

    /**
     * Se introduce una lista y se comprueba si existe o no existe la lista, si no existe devuelve -1
     * @param compruebaLista
     * @return
     */
    public int comprobarNotas(double[] compruebaLista) {
        if (compruebaLista == null) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * Devuelve la media de las notas de calse
     * @return
     */
    public double media() {
        int comprobante = comprobarNotas(listaNotas);
        double media = 0;
        //Comprobante por si no existe la lista
        if (comprobante == -1) {
            System.out.println("Sin notas por el momento");
        } else {
            //Bucle para sumar todos los valores
            for (int i = 0; i < listaNotas.length; i++) {
                media += listaNotas[i];
            }
        }
        return (media/ listaNotas.length);
    }

    /**
     * Metodo para devolver la mínima nota de la lista
     * @return
     */
    public double minimo() {
        int comprobante = comprobarNotas(listaNotas);
        double minimo = 10;
        //Comprobante por si no existe la lista
        if (comprobante == -1) {
            System.out.println("Sin notas por el momento");
        } else {
            //Bucle para sumar todos los valores
            for (int i = 0; i < listaNotas.length; i++){
                if (listaNotas[i] < minimo){
                    minimo = listaNotas[i];
                }
            }
        }
        return minimo;
    }

    /**
     * Metodo para devolver la máxima nota de la lista
     * @return
     */
    public double maximo() {
        int comprobante = comprobarNotas(listaNotas);
        double maximo = 0;
        //Comprobante por si no existe la lista
        if (comprobante == -1) {
            System.out.println("Sin notas por el momento");
        } else {
            //Recorre el array para ver cual es el máximo
            for (int i = 0; i < listaNotas.length; i++){
                if (listaNotas[i] > maximo){
                    maximo = listaNotas[i];
                }
            }
        }
        return maximo;
    }

    /**
     * Metodo para devolver el número de suspensos totales
     * @return
     */
    public int totalSuspensos() {
        int comprobante = comprobarNotas(listaNotas);
        int cont = 0;
        //Comprobante por si no existe la lista
        if (comprobante == -1) {
            System.out.println("Sin notas por el momento");
        } else {
            //Recorre el array para ver cual es el numero total de suspensos
            for (int i = 0; i < listaNotas.length; i++){
                if (listaNotas[i] < 5){
                    cont++;
                }
            }
        }
       return cont;
    }

    /**
     * Método que devuelve el número de aprobados totales
     * @return
     */
    public int totalAprobados() {
        int comprobante = comprobarNotas(listaNotas);
        int cont = 0;
        //Comprobante por si no existe la lista
        if (comprobante == -1) {
            System.out.println("Sin notas por el momento");
        } else {
            //Recorre el array para ver cual es el numero total de aprobados
            for (int i = 0; i < listaNotas.length; i++){
                if (listaNotas[i] > 4){
                    cont++;
                }
            }
        }
        return cont;
    }

    /**
     * Metodo para cambiar la nota de un alumno en concreto.
     * Hay que meter la nota y el alumno al método
     * @param nota
     * @param alumno
     */
    public void cambiarNota(double nota, int alumno){
        alumno = alumno-1;
        //Si supera el tamaño devulve -1
        if (alumno > listaNotas.length || alumno < 0){
            System.out.println("No existe ese alumno");
        }
        //Asigna la nota al alumno elegido
        else {
            listaNotas[alumno] = nota;
        }
    }

    /**
     * Método que devuelve la mejor nota de la clase
     * @return
     */
    public double mejorAlumno(){
        double mejor=0;
        //Recorre el array y guarda el alumno con la nota mas alta
        for (int i=0; i<listaNotas.length; i++)
            if (listaNotas[i] == maximo()){
                mejor = i;
            }
        return mejor;
    }

    /**
     * Método que devuelve la peor nota de la clase
     * @return
     */
    public double peorAlumno(){
        double peor=0;
        //Recorre el array y guarda el alumno con la nota mas baja
        for (int i=0; i<listaNotas.length; i++)
            if (listaNotas[i] == minimo()){
                peor = i;
            }
        return peor;
    }

    /**
     * Devuelve la nota de un alumno en concreto
     * @param indiceAlumno
     * @return
     */
    public double notaAlumno(int indiceAlumno){
        indiceAlumno = indiceAlumno-1;
        //Si esta por encima o por debajo del tamaño del array devuelve -1
        if (indiceAlumno > listaNotas.length || indiceAlumno < 0){
            return -1;
        }
        return listaNotas[indiceAlumno];
    }

    /**
     * Te devuelve un array con con todos los aprobados
     * @return
     */
    public int[] dameAprobados(){
        int aprobados = totalAprobados();
        int[] alumnosAprobados = new int[aprobados];
        //Si no hay aprobados
    if (aprobados == 0){
        System.out.println("No hay aprobados");
        //Si si que hay aprobados
    }else {
        int j = 0;
        //Recorre el array para ver cuales son los que estan aprobados
        for (int i=0 ; i<listaNotas.length ; i++){
            if (listaNotas[i]>4){
                alumnosAprobados[j] = i+1;
                j++;
            }
        }
    }
        System.out.println(Arrays.toString(alumnosAprobados));
    return alumnosAprobados;
    }

    /**
     * Te devuelve un array con con todos los suspendidos
     * @return
     */
    public int[] dameSuspensos(){
        int suspensos = totalSuspensos();
        int[] alumnosSuspensos = new int[suspensos];
        //Si no hay aprobados
        if (suspensos == 0){
            System.out.println("No hay aprobados");
            //Si si que hay aprobados
        }else {
            int j = 0;
            //Recorre el array para ver cuales son los que estan suspensos
            for (int i=0 ; i<listaNotas.length ; i++){
                if (listaNotas[i]<5){
                    alumnosSuspensos[j] = i + 1;
                    j++;
                }
            }
        }
        System.out.println(Arrays.toString(alumnosSuspensos));
        return alumnosSuspensos;
    }

    /**
     * Ordena el array de menor a mayor
     * @return
     */
    public double[] ordenar(){
        double[] listaOrdenada;
        //La siguiente genera una copia del array
        listaOrdenada = Arrays.copyOf(listaNotas, listaNotas.length);
        //La siguiente linea ordena el array
        Arrays.sort(listaOrdenada);
        return listaOrdenada;
    }

    /**
     * Dependiendo de las notas te da un mensaje por pantalla
     */
    public void analizaGrupo(){
        double[] listaAnalizar = ordenar();
        double dosTercios = 2/3 * listaNotas.length;
        //Variables para saber la cantidad de notas en los rangos que queremos
        int cont1=0, cont2=0, cont3=0, cont4=0;
        //Bucle para ir recorriendo el array y ver en que rango estan los alumnos con sus notas
        for (int i =0 ; i<listaAnalizar.length ; i++){
            if (listaNotas[i]>7) {
                cont1++;
            }
            if (listaNotas[i]>=5 && listaNotas[i]<=7){
                cont2++;
            }
            if (listaNotas[i]<5){
                cont3++;
            }
            cont4++;
        }
        //Condicionales para saber el rango de las notas de la clase
        if (cont1>dosTercios){
            System.out.println("VAMOS FENOMENTAL");
        }
        else if (cont2>dosTercios){
            System.out.println("REPASAR EJERCICIOS CON DIFICULTAD");
        }
        else if (cont2>dosTercios){
            System.out.println("VAMOS MAL...REPETIR EL TEMARIO");
        }
        else {
            System.out.println("HACER SUBGRUPOS CON TAREAS DE DIFERENTE DIFICULAS");
        }
    }
}



