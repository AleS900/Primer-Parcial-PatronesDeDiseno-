package resolucionExamen.fila_B_ejercicio4;

public class Client {
    public static void main (String[] args){
        Restaurant restaurant = new Restaurant();
        ParrillaBife bife = new ParrillaBife();
        ParrillaLomito lomito = new ParrillaLomito();
        ParrillaTira tira = new ParrillaTira();

        restaurant.setBuilder(bife);
        restaurant.makeParrilla();
        restaurant.getParilla().showInfo();

        restaurant.setBuilder(lomito);
        restaurant.makeParrilla();
        restaurant.getParilla().showInfo();

        restaurant.setBuilder(tira);
        restaurant.makeParrilla();
        restaurant.getParilla().showInfo();
    }
}
