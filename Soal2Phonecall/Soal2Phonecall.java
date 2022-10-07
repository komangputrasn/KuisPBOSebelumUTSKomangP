import java.util.Scanner;

class Phonecall {
    private int jamAwal, menitAwal, detikAwal;
    private int jamAkhir, menitAkhir, detikAkhir;

    public Phonecall() {
        Scanner input =  new Scanner(System.in);

        System.out.print("Masukan jam awal: ");
        this.jamAwal = input.nextInt();

        System.out.print("Masukan menit awal: ");
        this.menitAwal = input.nextInt();

        System.out.print("Masukan detik awal: ");
        this.detikAwal = input.nextInt();

        System.out.print("\nMasukan jam akhir: ");
        this.jamAkhir = input.nextInt();

        System.out.print("Masukan menit akhir: ");
        this.menitAkhir = input.nextInt();

        System.out.print("Masukan detik akhir: ");
        this.detikAkhir = input.nextInt();
    }

    public void lamaPercakapan() {
        System.out.printf("\nLama waktu percakapan = %d jam %d menit %d detik\n", 
                          this.jamAkhir - this.jamAwal, this.menitAkhir - this.menitAwal, this.detikAkhir - this.detikAwal);
    }

    public void biayaPercakapan() {
        int lamaWaktuDetik = (((this.jamAkhir - jamAwal) * 3600) + ((this.menitAkhir - this.menitAwal) * 60) + (this.detikAkhir - this.detikAwal));
        System.out.printf("Lama waktu percakapan dalam detik = %d\n", lamaWaktuDetik);

        double biaya = (lamaWaktuDetik / 5) * 150; 
        System.out.printf("Biaya yang dikenakan = Rp %.2f", biaya);
    }
}

public class Soal2Phonecall {
    public static void main(String[] args) {
        Phonecall pc = new Phonecall();
        pc.lamaPercakapan();
        pc.biayaPercakapan();
    }
}