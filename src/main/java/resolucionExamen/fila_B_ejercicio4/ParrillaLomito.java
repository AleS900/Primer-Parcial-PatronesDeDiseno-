package resolucionExamen.fila_B_ejercicio4;

public class ParrillaLomito extends BuilderParrilla {
    @Override
    public void buildGrillType() {
        parrilla.setGrill_type("LOMITO");
    }

    @Override
    public void buildMeatType() {
        parrilla.setMeat_type("Lomo");
    }

    @Override
    public void buildSoda() {
        parrilla.setSoda("Pepsi");
    }

    @Override
    public void buildOthers() {
        parrilla.setOthers("Arroz");
    }
}
