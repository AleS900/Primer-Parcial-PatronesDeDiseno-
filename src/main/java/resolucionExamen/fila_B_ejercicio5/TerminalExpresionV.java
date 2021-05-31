package resolucionExamen.fila_B_ejercicio5;

public class TerminalExpresionV  extends AbstractExpresion {
    @Override
    public void interpreter(ContextRomanos context) {
        context.output = context.output + "5 ";
        context.input = context.input.substring(1);
    }
}
