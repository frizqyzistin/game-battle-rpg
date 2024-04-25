package Kalkulator;

public class Kalkulator {
    // Metode statis untuk penjumlahan
    public static int penjumlahan(int a, int b) {
        return a + b;
    }
    
    // Metode statis untuk pengurangan
    public static int pengurangan(int a, int b) {
        return a - b;
    }
    
    // Metode non-statis untuk perkalian
    public int perkalian(int a, int b) {
        return a * b;
    }
    
    // Metode non-statis untuk pembagian
    public double pembagian(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan");
        }
    }
    
    // Metode non-statis untuk menyederhanakan pecahan
    public String sederhana(int pembilang, int penyebut) {
        int gcd = gcd(pembilang, penyebut);
        pembilang /= gcd;
        penyebut /= gcd;
        
        return pembilang + "/" + penyebut;
    }
    
    // Metode untuk menghitung GCD (Greatest Common Divisor)
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}

