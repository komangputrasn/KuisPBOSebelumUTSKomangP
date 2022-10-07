import java.util.Scanner;

class Segitiga {
    private int alas, tinggi;

    public Segitiga() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan alas: ");
        this.alas = input.nextInt();

        System.out.print("Masukan tinggi: ");
        this.tinggi = input.nextInt();

        input.close();
    }

    public void setAlas(int alas) {
        this.alas = alas; 
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi; 
    }
    
    public int getAlas() {
        return this.alas; 
    }

    public int getTinggi() {
        return this.tinggi; 
    }

    public double luas() {
        return 0.5 * this.alas * this.tinggi; 
    }
}

public class Soal1Segitiga {
    public static void main(String[] args) {
        System.out.println("----- Soal 1 Segitiga -----");
        Segitiga s = new Segitiga();
        System.out.printf("Luas segitiga dengan alas = %d dan tinggi = %d adalah %.2f\n", s.getAlas(), s.getTinggi(), s.luas());
    }
}