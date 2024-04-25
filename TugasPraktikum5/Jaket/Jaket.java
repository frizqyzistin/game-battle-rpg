package Jaket;

public class Jaket {
    // Harga jaket per bahan
    private static final int HARGA_JAKET_A = 100000;
    private static final int HARGA_JAKET_B = 125000;
    private static final int HARGA_JAKET_C = 175000;

    // Harga jaket per bahan dengan diskon
    private static final int HARGA_DISKON_JAKET_A = 95000;
    private static final int HARGA_DISKON_JAKET_B = 120000;
    private static final int HARGA_DISKON_JAKET_C = 160000;

    // Batas kuantitas untuk mendapatkan diskon
    private static final int BATAS_DISKON = 100;

    // Metode untuk menghitung total harga
    public int hitungTotalHarga(int kuantitasA, int kuantitasB, int kuantitasC) {
        int totalHarga = 0;

        // Menghitung harga jaket A
        if (kuantitasA > BATAS_DISKON) {
            totalHarga += kuantitasA * HARGA_DISKON_JAKET_A;
        } else {
            totalHarga += kuantitasA * HARGA_JAKET_A;
        }

        // Menghitung harga jaket B
        if (kuantitasB > BATAS_DISKON) {
            totalHarga += kuantitasB * HARGA_DISKON_JAKET_B;
        } else {
            totalHarga += kuantitasB * HARGA_JAKET_B;
        }

        // Menghitung harga jaket C
        if (kuantitasC > BATAS_DISKON) {
            totalHarga += kuantitasC * HARGA_DISKON_JAKET_C;
        } else {
            totalHarga += kuantitasC * HARGA_JAKET_C;
        }

        return totalHarga;
    }
}

