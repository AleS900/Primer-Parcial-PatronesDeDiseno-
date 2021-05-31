package resolucionExamen.fila_B_ejercicio4;

public class ParrillaTira extends BuilderParrilla {
    @Override
    public void buildGrillType() {
        parrilla.setGrill_type("TIRA");
    }

    @Override
    public void buildMeatType() {
        parrilla.setMeat_type("Tira de Carne");
    }

    @Override
    public void buildSoda() {
        parrilla.setSoda("Coca Cola");
    }

    @Override
    public void buildOthers() {
        parrilla.setOthers("Fideo");
    }

}
