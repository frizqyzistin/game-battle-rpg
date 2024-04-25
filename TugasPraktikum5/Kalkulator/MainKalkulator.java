package Kalkulator;

public class MainKalkulator {
    public static void main(String[] args) {
        // Menggunakan metode statis
        int hasilPenjumlahan = Kalkulator.penjumlahan(10, 5);
        int hasilPengurangan = Kalkulator.pengurangan(10, 5);
        
        // Menggunakan metode non-statis
        Kalkulator kalkulator = new Kalkulator();
        int hasilPerkalian = kalkulator.perkalian(10, 5);
        double hasilPembagian = kalkulator.pembagian(10, 5);
        
        // Menyederhanakan pecahan
        String hasilSederhana = kalkulator.sederhana(10, 5);
        
        // Mencetak hasil
        System.out.println("Penjumlahan: " + hasilPenjumlahan);
        System.out.println("Pengurangan: " + hasilPengurangan);
        System.out.println("Perkalian: " + hasilPerkalian);
        System.out.println("Pembagian: " + hasilPembagian);
        System.out.println("Pecahan disederhanakan: " + hasilSederhana);
    }
}

