package resolucionExamen.fila_B_ejercicio5;

public class TerminalExpresionIII  extends AbstractExpresion {
    @Override
    public void interpreter(ContextRomanos context) {
        context.output = context.output + "3 ";
        context.input = context.input.substring(3);
    }
}
