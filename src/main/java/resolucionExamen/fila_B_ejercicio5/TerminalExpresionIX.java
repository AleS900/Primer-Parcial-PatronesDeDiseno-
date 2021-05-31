package resolucionExamen.fila_B_ejercicio5;

public class TerminalExpresionIX  extends AbstractExpresion {
    @Override
    public void interpreter(ContextRomanos context) {
        context.output = context.output + "9 ";
        context.input = context.input.substring(2);
    }
}
