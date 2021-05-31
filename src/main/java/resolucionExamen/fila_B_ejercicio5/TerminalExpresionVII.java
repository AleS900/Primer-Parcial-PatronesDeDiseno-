package resolucionExamen.fila_B_ejercicio5;

public class TerminalExpresionVII  extends AbstractExpresion {
    @Override
    public void interpreter(ContextRomanos context) {
        context.output = context.output + "7 ";
        context.input = context.input.substring(3);
    }
}
