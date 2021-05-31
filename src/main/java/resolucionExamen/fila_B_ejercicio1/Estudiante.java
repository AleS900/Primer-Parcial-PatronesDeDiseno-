package resolucionExamen.fila_B_ejercicio1;

public class Estudiante {
    private String name;
    private String last_name;
    private String id;
    private String student_code;

    public Estudiante() {
    }

    public Estudiante(String name, String last_name, String id, String student_code) {
        this.name = name;
        this.last_name = last_name;
        this.id = id;
        this.student_code = student_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudent_code() {
        return student_code;
    }

    public void setStudent_code(String student_code) {
        this.student_code = student_code;
    }
}
