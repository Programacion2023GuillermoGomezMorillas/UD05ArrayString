import java.util.Arrays;
import java.util.Scanner;

public class Grupo {
    private String nombreGrupo;
    private String[] alumnos;
    private Asignatura[] asignaturas;
    private int totalAlumnos;
    private int totalAsignatura;

    /**
     * Constructor para poner los siguientes parametros:
     * @param nombreGrupo
     * @param totalAlumnos
     * @param totalAsignatura
     * Crea dos arrays de la distancia de totalAlumnos y totalAsignaturas
     */
    public Grupo(String nombreGrupo, int totalAlumnos, int totalAsignatura) {
        this.nombreGrupo = nombreGrupo;
        this.totalAlumnos = totalAlumnos;
        this.totalAsignatura = totalAsignatura;
        this.alumnos = new String[totalAlumnos];
        this.asignaturas = new Asignatura[totalAsignatura];
    }

    /**
     * Método para poner nota a todos los alumnos.
     * Tambien ordena la lista alfabéticamente.
     */
    public void leerAlumnos() {
        Scanner sc = new Scanner(System.in);
        String grupoAlumnos;
        //Bucle para poner nota a todos los alumnos
        for (int i = 0, k = 1; i < this.totalAlumnos; i++, k++) {
            System.out.println("Alumno " + k);
            grupoAlumnos = sc.nextLine();
            this.alumnos[i] = grupoAlumnos;
        }
        //Ordena la lista por orden alfabético
        Arrays.sort(this.alumnos);
    }

    /**
     * Muestra la lista de alumnos. Ordenada alfabéticamente en el método leerAlumnos()
     */
    public void mostrarAlumnos() {

        System.out.println(Arrays.toString(this.alumnos));
    }

    /**
     * Método para nombrar todas las asignaturas y de cada asignatura poner la nota de todos los alumnos
     */
    public void leerAsignatura() {
        Scanner sc = new Scanner(System.in);
        String nombreAsignatura;
        for (int i = 0, k = 1; i < this.totalAsignatura; i++, k++) {
            System.out.println("Asignatura " + k);
            nombreAsignatura = sc.nextLine();
            asignaturas[i] = new Asignatura(nombreAsignatura);
            asignaturas[i].leerNotas(totalAlumnos);
        }
    }

    /**
     * Muestra la lista de asignaturas
     */
    public void mostrarAsignaturas(){
        System.out.println(Arrays.toString(asignaturas));
    }

    /**
     * Sobrecargo el método ToString para mostrar una tabla con el nombre de los alumnos,
     * las asignaturas y sus notas.
     * String.format() --> Sirve para poner espaciado
     * @return
     */
    @Override
    public String toString() {
        String a ="";
        String s = "Alumno";
        //Bucle para la primera fila de la tabla
        for (int i=0; i<totalAsignatura ; i++){
            s = s +  String.format("%30.20s",asignaturas[i].getNombreAsignatura());
        }
        //Para bajar a la siguiente linea
        s = s + "\n";
        //Bucle para el nombre de los alumnos
        for (int k=1 ; k<=totalAlumnos ; k++){
            a = a + String.format("%-30s",alumnos[k-1]);
            //Bucle para las notas de los alumnos en una asignatura concreta
            for (int j=0 ; j<totalAsignatura ; j++) {
                a = a + String.format("%-30s", asignaturas[j].notaAlumno(k));
            }
            //Para bajar a la siguiente linea
            a = a + "\n";
       }
        //Devuelve las dos cadenas de texto juntas
        return s + a;
    }

    /**
     *
     * @return Devuelve el nombre de las asignaturas y la media de todos los alumnos en esa asignatura en forma de tabla
     */
    public String mostrarMedia(){
        String s="", a="";
        //Buecle para la primera linea de la tabla donde pone las asignaturas
        for (int i = 0;i<totalAsignatura;i++) {
            s = s + String.format("%-25s", asignaturas[i].getNombreAsignatura());
        }
        s = s + "\n";
        //Bucle para las medias de las asignaturas
        for (int j=0, k=1;j<totalAsignatura;j++, k++){
            a = a + String.format("%-25s", asignaturas[j].media());

        }
        //Devuelve las dos cadenas de texto juntas
        return s + a;
        }

    /**
     *
     * @return Devuelve el nombre de la asignatura con la nota mas baja entre los alumnos
     */
    public String dameAsignaturaMinima() {
            String s = "";
            double nota=10;
        //Bucle que recorre las asignaturas
        for (int j = 0; j < totalAsignatura; j++) {
            //Bucle que recorre todos los alumnos
            for (int k = 1; k < totalAlumnos; k++) {
                //Guarda el alumno con la nota mas baja
                    if (asignaturas[j].notaAlumno(k) <= nota) {
                        nota = asignaturas[j].notaAlumno(k);
                        s = asignaturas[j].getNombreAsignatura();
                        System.out.println(s);
                    }
                }
            }
                return s;
        }

    /**
     *
     * @return Devuelve el nombre de la asignatura con la nota mas alta entre los alumnos
     */
    public String dameAsignaturaMaxima(){
        String s = "";
        double nota=0;
        //Bucle que recorre las asignaturas
        for (int j = 0; j < totalAsignatura; j++) {
            //Bucle que recorre todos los alumnos
            for (int k = 1; k < totalAlumnos; k++) {
                //Guarda el alumno con la nota mas alta
                if (asignaturas[j].notaAlumno(k) >= nota) {
                    nota = asignaturas[j].notaAlumno(k);
                    s = asignaturas[j].getNombreAsignatura();
                }
            }
        }
        return s;
    }
    /**
     *
     * @return Devuelve la media de una asignatura
     */
    public double dameMediaAsignatura(int indice){
        double suma=0;
        //Recorre las notas de la asignatura introducida y las va sumando
        for (int i=1 ; i<=totalAlumnos ; i++){
            suma = suma + asignaturas[indice].notaAlumno(i);
        }
        //Suma total de las notas entre el total de los alumnos para la media
        return (suma/totalAlumnos);
    }
    public double dameAlumnoMedia(int indice) {
        double suma=0;
        //Recorre las notas de la asignatura introducida y las va sumando
        for (int i=0 ; i<totalAlumnos ; i++){
            suma = suma + asignaturas[i].notaAlumno(indice);
        }
        //Suma total de las notas entre el total de los alumnos para la media
        return (suma/totalAlumnos);
    }
    public int dameAlumnoSuspensos(int indice){
        int suspensosTotales = 0;
        for (int i=0; i<totalAsignatura ; i++){
            if (asignaturas[i].notaAlumno(indice)<5){
                suspensosTotales++;
            }
        }
        return suspensosTotales;
    }
    }
