import java.util.Scanner;

public class Tugas314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================SISTEM HITUNG BARANG TERJUAL=========================");

        System.out.print("Masukkan jumlah toko : ");
        int jmlToko = sc.nextInt();

        if (jmlToko < 1 ) {
            System.out.print("Jumlah toko minimal adalah 1 ");
        } else {
            int totalBarangSemua = 0;
            int barangTerjual = -1;
            int tokoDijualTerbanyak = 0;

            for (int i = 1; i <= jmlToko; i++) {
                int jmlPelanggan;

                do  {
                    System.out.print("Masukkan jumlah pelanggan toko ke-" + i + ": " );
                    jmlPelanggan = sc.nextInt();

                    if (jmlPelanggan < 0) {
                        System.out.println("Masukkan jumlah pelanggan yang benar");
                    }
                } while (jmlPelanggan < 0);
                    int totalBarang = 0;

                    for (int j = 1; j <= jmlPelanggan; j++) {
                        int jmlBarang;
                        do {
                            System.out.print("Masukkan jumlah barang pelanggan ke-" + j + ": ");
                            jmlBarang = sc.nextInt();

                            if (jmlBarang < 0) {
                                System.out.println("Masukkan yang benar");
                            }
                        } while (jmlBarang < 0);
                        totalBarang += jmlBarang;
                    }
                    System.out.println("Toko " + i + " - pelanggan: " + jmlPelanggan + ", total barang: " + totalBarang);
                    totalBarangSemua += totalBarang;

                    if (totalBarang > barangTerjual) { 
                        barangTerjual = totalBarang; tokoDijualTerbanyak = i; 
                    }
                }
                System.out.println("Total barang seluruh toko adalah : " + totalBarangSemua);
                System.out.println("Toko dengan barang terbanyak adalah : " + tokoDijualTerbanyak);
                System.out.println("===============================PROGRAM BERAKHIR============================");
        }
        sc.close();
    }
}
