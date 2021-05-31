package resolucionExamen.fila_B_ejercicio4;

public class Parrilla {
    private String grill_type;
    private String meat_type;
    private String soda;
    private String others;

    public Parrilla() {
    }

    public String getGrill_type() {
        return grill_type;
    }

    public void setGrill_type(String grill_type) {
        this.grill_type = grill_type;
    }

    public String getMeat_type() {
        return meat_type;
    }

    public void setMeat_type(String meat_type) {
        this.meat_type = meat_type;
    }

    public String getSoda() {
        return soda;
    }

    public void setSoda(String soda) {
        this.soda = soda;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public void showInfo(){
        System.out.println("********** " + grill_type + " **********"  );
        System.out.println();
        System.out.println("- Tipo de carne: " + meat_type);
        System.out.println("- Gaseosa      : " + soda);
        System.out.println("- Guarniciones : " + others);
        System.out.println("");


    }
}
