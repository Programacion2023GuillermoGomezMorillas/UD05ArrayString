public class Grupo {
    String nombreGrupo;
    String[] alumnos;
    Asignatura[] asignatura;
    int totalAlumnos;
    int totalAsignatura;

    public Grupo(String nombreGrupo, int totalAlumnos, int totalAsignatura) {
        this.nombreGrupo = "DAM1k";
        this.totalAlumnos = totalAlumnos;
        this.totalAsignatura = totalAsignatura;
        this.alumnos = new String[totalAlumnos];
        this.asignatura = new Asignatura[totalAsignatura];
    }


}