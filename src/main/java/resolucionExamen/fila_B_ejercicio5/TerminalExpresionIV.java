package resolucionExamen.fila_B_ejercicio5;

public class TerminalExpresionIV  extends AbstractExpresion {
    @Override
    public void interpreter(ContextRomanos context) {
        context.output = context.output + "4 ";
        context.input = context.input.substring(2);
    }
}
