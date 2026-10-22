import java.util.Scanner;

public class Tugas1Bioskop24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        double totalPenjualanHarian = 0;
        int jumlahTiket;

        System.out.println("=== SISTEM PENJUALAN TIKET BIOSKOP ===");

        while (true) {
            System.out.print("Masukan jumlah tiket yang dibeli (ketik 0 untuk selesai/keluar): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Silahkan masukan lagi.");
                continue;
            }
            double totalHargaPembelian = jumlahTiket * hargaTiket;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15; 
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double hargaSetelahDiskon = totalHargaPembelian - (totalHargaPembelian * diskon);
            totalTiketTerjual += jumlahTiket;
            totalPenjualanHarian += hargaSetelahDiskon;

            System.out.println("Total harga transaksi ini: Rp " + hargaSetelahDiskon);
            System.out.println("----------------------------------------------");
        }

            System.out.println("\n=== RREKAP PENJUALAN HARIAN ===");
            System.out.println(" Total tiket terjual : " + totalTiketTerjual + " tiket" );
            System.out.println("Total hasil penjualan : Rp " + totalPenjualanHarian);
    }
}