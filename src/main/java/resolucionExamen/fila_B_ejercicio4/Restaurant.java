package resolucionExamen.fila_B_ejercicio4;

public class Restaurant {
    private BuilderParrilla builder;

    public void setBuilder(BuilderParrilla builder){
        this.builder = builder;
    }

    public Parrilla getParilla(){
        return builder.getParrilla();
    }

    public void makeParrilla(){
        this.builder.createParrilla();
        this.builder.buildGrillType();
        this.builder.buildMeatType();
        this.builder.buildSoda();
        this.builder.buildOthers();
    }
}
