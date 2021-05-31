package resolucionExamen.fila_B_ejercicio5;


import java.util.ArrayList;
import java.util.List;

public class InterpreterRomanos extends AbstractExpresion {
    private List<AbstractExpresion> parseTree = new ArrayList<>();
    private ContextRomanos contextRomanos;

    public InterpreterRomanos(String word) {
        this.interpretacion(word);
    }

    public void interpretacion (String words){
        String input = words;
        contextRomanos = new ContextRomanos(input.replace(" ",""));
        for (String word : input.split(" ")){
            switch (word){
                case "I":
                    parseTree.add(new TerminalExpresionI());
                    break;
                case "II":
                    parseTree.add(new TerminalExpresionII());
                    break;
                case "III":
                    parseTree.add(new TerminalExpresionIII());
                    break;
                case "IV":
                    parseTree.add(new TerminalExpresionIV());
                    break;
                case "V":
                    parseTree.add(new TerminalExpresionV());
                    break;
                case "VI":
                    parseTree.add(new TerminalExpresionVI());
                    break;
                case "VII":
                    parseTree.add(new TerminalExpresionVII());
                    break;
                case "VIII":
                    parseTree.add(new TerminalExpresionVIII());
                    break;
                case "IX":
                    parseTree.add(new TerminalExpresionIX());
                    break;
                case "X":
                    parseTree.add(new TerminalExpresionX());
                    break;
                default:
                    break;
            }
        }
    }

    public String interpretar(){
        for (AbstractExpresion terminalExpresion: parseTree) {
            terminalExpresion.interpreter(contextRomanos);
        }
        return  contextRomanos.output;
    }

    @Override
    public void interpreter(ContextRomanos context) {

    }
}
