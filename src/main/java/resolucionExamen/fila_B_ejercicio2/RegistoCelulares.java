package resolucionExamen.fila_B_ejercicio2;

public class RegistoCelulares implements IRegistroCelulares{
    private String trademark;
    private String size;
    private String weight;
    private String cam;
    private String imei;
    private String origin_place;

    public RegistoCelulares() {
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCam() {
        return cam;
    }

    public void setCam(String cam) {
        this.cam = cam;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getOrigin_place() {
        return origin_place;
    }

    public void setOrigin_place(String origin_place) {
        this.origin_place = origin_place;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public Object clone(){
        RegistoCelulares objectClone = new RegistoCelulares();
        objectClone.setTrademark(this.trademark);
        objectClone.setSize(this.size);
        objectClone.setWeight(this.weight);
        objectClone.setCam(this.cam);
        objectClone.setImei(this.imei);
        objectClone.setOrigin_place(this.origin_place);
        return objectClone;
    }

    public void showInfo(){
        System.out.println("*************************************");
        System.out.println("- Modelo    : " + trademark);
        System.out.println("- Tamaño    : " + size);
        System.out.println("- Peso      : " + weight);
        System.out.println("- Cámara    : " + cam);
        System.out.println("- IMEI      : " + imei);
        System.out.println("- PaisOrigen: " + origin_place);
        System.out.println("*************************************\n");
    }
}
