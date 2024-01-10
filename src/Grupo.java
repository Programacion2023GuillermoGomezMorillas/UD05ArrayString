import java.util.Arrays;
import java.util.Scanner;

public class Grupo {
    private String nombreGrupo;
    private String[] alumnos;
    private Asignatura[] asignaturas;
    private int totalAlumnos;
    private int totalAsignatura;

    public Grupo(String nombreGrupo, int totalAlumnos, int totalAsignatura) {
        this.nombreGrupo = "DAM1k";
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
        String s = "Alumno" + String.format("%-30s%-1515.f2", asignaturas[i]);
        for (int i=0 ; i<totalAlumnos ; i++) {
            s = "Alumno" + String.format("%-30s%-1515.f2", asignaturas[i]);
            s = s +  String.format("%-30s%-1515.f2", alumnos[i],  );
        }
        return s;
    }
}