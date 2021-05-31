package resolucionExamen.fila_B_ejercicio1;

import java.util.HashMap;

public class VentanillaDePago {
    private static  VentanillaDePago instance = null;
    private HashMap<String, Integer> montoPagado_estudiante = new HashMap<>();
    private HashMap<Estudiante, String> estudiante_inscripcion = new HashMap<>();
    private Integer saldo = 0;

    public VentanillaDePago() {
    }


}
