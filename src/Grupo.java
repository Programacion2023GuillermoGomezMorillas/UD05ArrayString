import java.util.Arrays;
import java.util.Scanner;

public class Grupo {
    private String nombreGrupo;
    private String[] alumnos;
    private Asignatura[] asignaturas;
    private int totalAlumnos;
    private int totalAsignatura;

    public Grupo(String nombreGrupo, int totalAlumnos, int totalAsignatura) {
        this.nombreGrupo = nombreGrupo;
        this.totalAlumnos = totalAlumnos;
        this.totalAsignatura = totalAsignatura;
        this.alumnos = new String[totalAlumnos];
        this.asignaturas = new Asignatura[totalAsignatura];
    }
    public void leerAlumnos() {
        Scanner sc = new Scanner(System.in);
        String grupoAlumnos;
        for (int i = 0, k = 1; i < this.totalAlumnos; i++, k++) {
            System.out.println("Alumnos " + k);
            grupoAlumnos = sc.nextLine();
            this.alumnos[i] = grupoAlumnos;

        }
        Arrays.sort(this.alumnos);
    }
    public void mostrarAlumnos() {

        System.out.println(Arrays.toString(this.alumnos));
    }
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
    public void mostrarAsignaturas(){
        System.out.println(Arrays.toString(asignaturas));
    }
    @Override
    public String toString() {
        String a ="";
        String s = "Alumno";
        for (int i=0; i<totalAsignatura ; i++){
            s = s +  String.format("%30.20s",asignaturas[i].getNombreAsignatura());
        }
        s = s + "\n";

        for (int k=1 ; k<=totalAlumnos ; k++){
            a = a + String.format("%-30s",alumnos[k-1]);
            for (int j=0 ; j<totalAsignatura ; j++) {
                a = a + String.format("%-30s", asignaturas[j].notaAlumno(k));
            }
            a = a + "\n";
       }

        return s + a;
    }
    public String mostrarMedia(){
        String s="", a="";

        for (int i = 0;i<totalAsignatura;i++) {
            s = s + String.format("%-25s", asignaturas[i].getNombreAsignatura());
        }
        s = s + "\n";
        for (int j=0, k=1;j<totalAsignatura;j++, k++){
            a = a + String.format("%-25s", asignaturas[j].media());

        }
        return s + a;
        }
        public String dameAsignaturaMinima() {
            String s = "";
            for (int j = 0; j < totalAsignatura; j++) {
                for (int k = 1; k < totalAlumnos; k++) {
                    if (asignaturas[j].notaAlumno(k) <= 10) {
                        s = asignaturas[j].getNombreAsignatura();
                    }
                }
            }
                return s;
        }
    public String dameAsignaturaMaxima(){
        String s = "";
        for (int j = 0; j < totalAsignatura; j++) {
            for (int k = 1; k < totalAlumnos; k++) {
                if (asignaturas[j].notaAlumno(k) >= 0) {
                    s = asignaturas[j].getNombreAsignatura();
                }
            }
        }
        return s;
    }
    }