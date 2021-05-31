package resolucionExamen.fila_B_ejercicio5;

public class TerminalExpresionX  extends AbstractExpresion {
    @Override
    public void interpreter(ContextRomanos context) {
        context.output = context.output + "10 ";
        context.input = context.input.substring(1);
    }
}
