package transportasi;


import java.util.Scanner; ////Adalah library pada java yang menyediakan fungsi untuk membaca input.

// Adalah pendefinisian nama kelas.
public class sepeda {
    private String kode;
    private String nama;
    private float harga;
    private int jumlah;

// pendeklarasian variabel, variabel merupakan tempat penampungan dari input yang kita masukkan.
public void setData(String kode, String nama, float harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }
// rumus perhitungan total belanja sepeda
public float getTotalPembelian() {
        return harga * jumlah;
    }

// rumus untuk jika total pembelian lebih dari 500000 maka akan mendapatkan bonus seperti yang ada dibawah    
public String getBonus() {
        float totalPembelian = getTotalPembelian();
        if (totalPembelian >= 500000 && jumlah > 5) {
            return "Rubicon";
        } else if (totalPembelian >= 100000 && jumlah > 3) {
            return "Sepeda Lipat";
        } else if (totalPembelian >= 50000 || jumlah > 2) {
            return "Pesawat";
        } else {
            return "Tidak ada";
        }
    }

// untuk mencetak nota
    public void cetakNota() {
        System.out.println("Kode sepeda: " + kode);
        System.out.println("Nama sepeda: " + nama);
        System.out.println("Harga sepeda: " + harga);
        System.out.println("Jumlah sepeda: " + jumlah);
        System.out.println("Total pembelian: " + getTotalPembelian());
        System.out.println("Bonus: " + getBonus());
    }

// untuk memberikan input dan output yang kita masukkan dan mengkonfirmasi jika ingin menambah data atau tidak    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputLagi = "Y";
        while (inputLagi.equals("Y")) {
            sepeda penjualan = new sepeda();

            System.out.print("Masukkan kode sepeda: ");
            String kode = input.nextLine();

            System.out.print("Masukkan nama sepeda: ");
            String nama = input.nextLine();

            System.out.print("Masukkan harga sepeda: ");
            float harga = input.nextFloat();

            System.out.print("Masukkan jumlah sepeda: ");
            int jumlah = input.nextInt();

            input.nextLine(); // clear buffer

            penjualan.setData(kode, nama, harga, jumlah);
            penjualan.cetakNota();

            System.out.print("Input data lagi [Y/T]? ");
            inputLagi = input.nextLine();
        }

        input.close();
    }

    public void info() {
    }
}
