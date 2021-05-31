package resolucionExamen.fila_B_ejercicio5;

public class Client {
    public static void main (String[] args){
        String roman_numbers = "I II III IV V VI VII VIII IX X III II IX";
        InterpreterRomanos natural_numbers = new InterpreterRomanos(roman_numbers);
        System.out.println("* Números Romanos  : " + roman_numbers);
        System.out.println("* Números Naturales: " + natural_numbers.interpretar());
    }
}
