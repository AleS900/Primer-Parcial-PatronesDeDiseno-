package resolucionExamen.fila_B_ejercicio1;

public class Jefe {
    private String name;
    private String last_name;
    private String id;
    private Boolean is_boss;

    public Jefe() {
    }

    public Jefe(String name, String last_name, String id, Boolean is_boss) {
        this.name = name;
        this.last_name = last_name;
        this.id = id;
        this.is_boss = is_boss;
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

    public Boolean getIs_boss() {
        return is_boss;
    }

    public void setIs_boss(Boolean is_boss) {
        this.is_boss = is_boss;
    }
}
