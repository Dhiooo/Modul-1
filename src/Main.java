import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //menginputkan data yang diperlukan oleh program
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Jenis kelamin P/L: ");
        String jenisKelamin = scanner.nextLine();

        System.out.print("Masukkan tahun lahir anda (YYY-MM-DD): ");
        LocalDate tanggalLahir = LocalDate.parse(scanner.next());

        //perhitungan umur
        LocalDate tanggalSekarang = LocalDate.now();
        Period periode = Period.between(tanggalLahir, tanggalSekarang);

        //output
        System.out.println("\nNama Anda: ");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin " + (jenisKelamin.equalsIgnoreCase("L") ? "Laki-laki" : "Perempuan"));
        System.out.println("Umur " + periode.getYears() + " tahun " + periode.getMonths() + " bulan " + periode.getDays() + " hari ");

        scanner.close();
    }
}