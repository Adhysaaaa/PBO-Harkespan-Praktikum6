package transportasi;

import java.util.Scanner; //Adalah library pada java yang menyediakan fungsi untuk membaca input.

//Adalah pendefinisian nama kelas.
public class mobil {
   
public static void main(String[] args) {
Scanner input=new Scanner(System.in); //perintah untuk dapat membaca inputan.

//pendeklarasian variabel, variabel merupakan tempat penampungan dari input yang kita masukkan.
String nama;
String nama_mobil;
String plat_mobil;
int tglpinjam;
int tglkembali;
int denda;

System.out.print("Nama : " ); // perintah untuk menampilkan text, karakter, atau pun kalimat dan seterusnya
nama=input.nextLine(); //perintah untuk menginputkan data berupa string (kalimat), lalu akan disimpan ke variabel nama dan seterusnya.
System.out.print("Nama Mobil : " );
nama_mobil=input.nextLine();
System.out.print("Plat Mobil : " );
plat_mobil=input.nextLine();
System.out.print("Tanggal Pinjam : ");
tglpinjam=input.nextInt(); // berfungsi untuk menginputkan data berupa integer (angka bilangan bulat), 
                           // lalu inputan tersebut akan disimpan ke variabel tglpinjam.
System.out.print("Tanggal Kembali: ");
tglkembali=input.nextInt();

denda=(tglkembali-tglpinjam-2)*1000000; // rumus perhitungan untuk nilai denda yang akan didapatkan.

//Pernyataan if(tglkembali<=tglpinjam+2) merupakan proses penyeleksian. 
//Artinya jika tanggal pengembalian mobilnya tidak sampai 2 hari, maka tidak akan dikenakan biaya denda.
if(tglkembali<=tglpinjam+2) 
{
System.out.println("\nNama \t\t\t: "+nama);
System.out.println("Nama Mobil \t\t: "+nama_mobil);
System.out.println("Plat Mobil \t\t: "+plat_mobil);
System.out.println("Tanggal Pinjam \t\t: "+tglpinjam+" April 2023");
System.out.println("Tanggal Kembali \t: "+tglkembali+" April 2023");
System.out.println("Denda \t\t\t: Tidak Ada Denda");
}
else
{
System.out.println("\nNama \t\t\t: "+nama);
System.out.println("Nama Mobil \t\t: "+nama_mobil);
System.out.println("Plat Mobil \t\t: "+plat_mobil);
System.out.println("Tanggal Pinjam \t\t: "+tglpinjam+" April 2023");
System.out.println("Tanggal Kembali \t: "+tglkembali+" April 2023");
System.out.println("Denda \t\t\t: Rp. "+denda);
}
}

public void info() {
}
}