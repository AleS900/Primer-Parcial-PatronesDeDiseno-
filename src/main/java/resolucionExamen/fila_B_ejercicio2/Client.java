package resolucionExamen.fila_B_ejercicio2;

public class Client {
    public static void main (String[] args){
        RegistoCelulares input = new RegistoCelulares();
        input.setTrademark("A1");
        input.setSize("5 pulgadas");
        input.setWeight("60 gramos");
        input.setCam("foco=10, lente= 5mp");
        input.setImei("XXXX");
        input.setOrigin_place("Bolivia");
        //1
        RegistoCelulares movil1 =  (RegistoCelulares)input.clone();
        movil1.setImei("1001");
        //2
        RegistoCelulares movil2 =  (RegistoCelulares)input.clone();
        movil2.setImei("1002");
        //3
        RegistoCelulares movil3 =  (RegistoCelulares)input.clone();
        movil3.setImei("1003");
        //4
        RegistoCelulares movil4 =  (RegistoCelulares)input.clone();
        movil4.setImei("1004");
        //5
        RegistoCelulares movil5 =  (RegistoCelulares)input.clone();
        movil5.setImei("1005");

        movil1.showInfo();
        movil2.showInfo();
        movil3.showInfo();
        movil4.showInfo();
        movil5.showInfo();
    }
}
