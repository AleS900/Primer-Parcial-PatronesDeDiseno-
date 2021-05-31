package resolucionExamen.fila_B_ejercicio1;

public class Colegio {
    private String sch_name;

    public Colegio() {

    }

    public Colegio(String sch_name) {
        this.sch_name = sch_name;
    }

    public void matricular(Estudiante student, Integer precio_a_pagar){
        VentanillaDePago.getInstance().add(student, precio_a_pagar);
    }

}
