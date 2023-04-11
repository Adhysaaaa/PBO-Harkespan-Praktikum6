//untuk memanggil package dari transportasi 
import transportasi.mobil;
import transportasi.sepeda;

public class TransportasiDemo {
    public static void main(String[] args) {
        mobil objectMobil = new mobil();
        objectMobil.info();

        sepeda objectBicycle = new sepeda();
        objectBicycle.info();
    }
}
