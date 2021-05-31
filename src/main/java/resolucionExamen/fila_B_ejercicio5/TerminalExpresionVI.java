package resolucionExamen.fila_B_ejercicio5;

public class TerminalExpresionVI  extends AbstractExpresion {
    @Override
    public void interpreter(ContextRomanos context) {
        context.output = context.output + "6 ";
        context.input = context.input.substring(2);
    }
}
