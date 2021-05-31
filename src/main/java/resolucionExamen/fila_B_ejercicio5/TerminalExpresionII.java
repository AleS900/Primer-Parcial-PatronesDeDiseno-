package resolucionExamen.fila_B_ejercicio5;

public class TerminalExpresionII  extends AbstractExpresion {
    @Override
    public void interpreter(ContextRomanos context) {
        context.output = context.output + "2 ";
        context.input = context.input.substring(2);
    }
}
