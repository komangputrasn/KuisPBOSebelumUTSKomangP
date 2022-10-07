import java.util.Scanner;

class WarnetConnect {
    private int lamaInternet, lamaPengetikan, lamaGame;
    private int banyakScan, banyakPrintWarna, banyakHitamPutih, banyakTehBotol;

    public WarnetConnect() {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Selamat datang di Warnet Connect! ---");

        System.out.print("Masukan lama penggunaan internet: ");
        this.lamaInternet = input.nextInt(); 
        
        System.out.print("Masukan lama pengetikan: ");
        this.lamaPengetikan = input.nextInt();

        System.out.print("Masukan lama bermain game: ");
        this.lamaGame = input.nextInt();

        System.out.print("\nMasukan banyak file scan: ");
        this.banyakScan = input.nextInt();

        System.out.print("Masukan banyak print warna: ");
        this.banyakPrintWarna = input.nextInt();

        System.out.print("Masukan banyak print hitam putih: ");
        this.banyakHitamPutih = input.nextInt();

        System.out.print("Masukan banyak teh botol: ");
        this.banyakTehBotol = input.nextInt();

        input.close();
    }

    public void biayaTotal() {
        double biayaInternet = ((double)this.lamaInternet / 60) * 4000;
        double biayaPengetikan = ((double)this.lamaPengetikan / 60) * 2000;
        double biayaGame = ((double)this.lamaGame / 60) * 5000; 

        double biayaScan = this.banyakScan * 1000;
        double biayaPrintWarna = this.banyakPrintWarna * 500;
        double biayaHitamPutih = this.banyakHitamPutih * 300;
        double biayaTehBotol = this.banyakTehBotol * 3000;

        double biayaTotal = biayaInternet + biayaPengetikan + biayaGame + biayaScan + biayaHitamPutih + biayaPrintWarna + biayaTehBotol;
        System.out.printf("Biaya total = Rp %.2f\n", biayaTotal);
    }
}

public class Soal3Warnet {
    public static void main(String[] args) {
        System.out.println("----- Soal 3 Warnet -----");
        WarnetConnect wc = new WarnetConnect();
        wc.biayaTotal();
    }
}