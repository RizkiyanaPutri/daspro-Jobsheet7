import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTiketTerjual = 0, jumlahTiket;
        double hargaTiket=50000, totalPenjualan = 0;
        boolean lanjut = true;
        
        do {
            System.out.print("Input jumlah tiket  : ");
            jumlahTiket= sc.nextInt();

            if (jumlahTiket <= 0) {
                System.out.println("Minimal pembelian tiket adalah 1, silakan input ulang!");
                System.out.println("------------------------------------------");
                continue;
            }

            double totalHarga = jumlahTiket * hargaTiket;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15 * totalHarga;
            }else if(jumlahTiket > 4){
                diskon = 0.10 * totalHarga;
            }

            if (diskon > 0) {
                System.out.println("Harga sebelum diskon: Rp." + (jumlahTiket * hargaTiket));
                System.out.println("Diskon              : Rp." + diskon);
            }

            totalHarga -= diskon;
            totalPenjualan += totalHarga;
            totalTiketTerjual += jumlahTiket;
            System.out.println("Total               : Rp." + totalHarga);

            sc.nextLine();
            System.out.print("Lanjut input pembelian selanjutnya? (Y/T)");
            String jawaban = sc.nextLine();
            System.out.println("------------------------------------------");
             if (jawaban.equalsIgnoreCase("Y")) {
                lanjut = true;
             }else{
                lanjut = false;
             }
             System.out.println();
             
        } while (lanjut);

        System.out.println("------------------------------------------");
        System.out.println("            Laporan Penjualan");
        System.out.println("------------------------------------------");
        System.out.println("Total tiket terjual : " + totalTiketTerjual + " tiket");
        System.out.printf("Total penjualan     : Rp." + totalPenjualan);

        sc.close();
    }
}