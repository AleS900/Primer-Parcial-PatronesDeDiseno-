package resolucionExamen.fila_B_ejercicio4;

public abstract class BuilderParrilla {
    protected Parrilla parrilla;

    public Parrilla getParrilla(){
        return parrilla;
    }

    public void createParrilla(){
        parrilla = new Parrilla();
    }

    public abstract void buildGrillType();
    public abstract void buildMeatType();
    public abstract void buildSoda();
    public abstract void buildOthers();
}
