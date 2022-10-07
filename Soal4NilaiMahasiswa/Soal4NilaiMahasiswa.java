import java.util.Scanner;

class NilaiMahasiswa {
    private int nilai;
    private String grade; 

    public NilaiMahasiswa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan total nilai: ");
        nilai = sc.nextInt(); 
    }

    public void nilaiHuruf() {
        if (this.nilai >= 0 && this.nilai < 40) {
            grade = "E";
        } else if (this.nilai >= 40 && this.nilai < 50) {
            grade = "D";
        } else if (this.nilai >= 50 && this.nilai < 55) {
            grade = "C-";
        } else if (this.nilai >= 55 && this.nilai < 60) {
            grade = "C";
        } else if (this.nilai >= 60 && this.nilai < 65) {
            grade = "C+";
        } else if (this.nilai >= 65 && this.nilai < 70) {
            grade = "B-";
        } else if (this.nilai >= 70 && this.nilai < 75) {
            grade = "B";
        } else if (this.nilai >= 75 && this.nilai < 80) {
            grade = "B+";
        } else if (this.nilai >= 80 && this.nilai < 90) {
            grade = "A-";
        } else if (this.nilai >= 90 && this.nilai <= 100) {
            grade = "A";
        } else {
            grade = "???";
        }

        System.out.println("Nilai angka = " + this.nilai);
        System.out.println("Nilai huruf = " + this.grade);
    }
}

public class Soal4NilaiMahasiswa {
    public static void main(String[] args) {
        System.out.println("----- Soal 4 Nilai Mahasiswa -----");
        NilaiMahasiswa nm = new NilaiMahasiswa();
        nm.nilaiHuruf();         
    }
}