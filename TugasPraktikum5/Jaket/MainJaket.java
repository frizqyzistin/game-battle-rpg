package Jaket;

import java.util.Scanner;

public class MainJaket {
    public static void main(String[] args) {
        // Membuat objek CVLabkomdas
        Jaket labkomdas = new Jaket();

        // Membuat objek Scanner untuk menerima input pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah jaket A
        System.out.print("Masukkan jumlah jaket A yang ingin dibeli: ");
        int kuantitasA = scanner.nextInt();

        // Meminta pengguna untuk memasukkan jumlah jaket B
        System.out.print("Masukkan jumlah jaket B yang ingin dibeli: ");
        int kuantitasB = scanner.nextInt();

        // Meminta pengguna untuk memasukkan jumlah jaket C
        System.out.print("Masukkan jumlah jaket C yang ingin dibeli: ");
        int kuantitasC = scanner.nextInt();

        // Menutup scanner
        scanner.close();

        // Menghitung total harga
        int totalHarga = labkomdas.hitungTotalHarga(kuantitasA, kuantitasB, kuantitasC);

        // Mencetak total harga
        System.out.println("Total harga: Rp " + totalHarga);
    }
}


