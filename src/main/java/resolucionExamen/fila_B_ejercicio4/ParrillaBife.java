package resolucionExamen.fila_B_ejercicio4;

public class ParrillaBife extends BuilderParrilla {
    @Override
    public void buildGrillType() {
        parrilla.setGrill_type("BIFE");
    }

    @Override
    public void buildMeatType() {
        parrilla.setMeat_type("Bife");
    }

    @Override
    public void buildSoda() {
        parrilla.setSoda("Coca Cola");
    }

    @Override
    public void buildOthers() {
        parrilla.setOthers("Papas Fritas");
    }
}
