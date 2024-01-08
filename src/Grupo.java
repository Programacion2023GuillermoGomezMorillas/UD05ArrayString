public class Grupo {
    private String nombreGrupo;
    private String[] alumnos;
    private Asignatura[] asignatura;
    private int totalAlumnos;
    private int totalAsignatura;

    public Grupo(String nombreGrupo, int totalAlumnos, int totalAsignatura) {
        this.nombreGrupo = "DAM1k";
        this.totalAlumnos = totalAlumnos;
        this.totalAsignatura = totalAsignatura;
        this.alumnos = new String[totalAlumnos];
        this.asignatura = new Asignatura[totalAsignatura];
    }
}
