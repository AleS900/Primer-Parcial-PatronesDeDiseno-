package resolucionExamen.fila_B_ejercicio5;

public class TerminalExpresionVIII  extends AbstractExpresion {
    @Override
    public void interpreter(ContextRomanos context) {
        context.output = context.output + "8 ";
        context.input = context.input.substring(4);
    }
}
