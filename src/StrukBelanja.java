import java.sql.SQLOutput;
import java.util.Scanner;
public class StrukBelanja {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int hargaBuku = 5000;
        int hargaPulpen = 3000;
        int hargaPenghapus = 2000;

        System.out.print("Nama Barang 1 : ");
        String namaBarang1 = scanner.nextLine();
        System.out.print("Jumlah    : ");
        int jumlah1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nama Barang 2 : ");
        String namaBarang2 = scanner.nextLine();
        System.out.print("Jumlah    : ");
        int jumlah2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nama Barang 3 : ");
        String namaBarang3 = scanner.nextLine();
        System.out.print("Jumlah    : ");
        int jumlah3 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Uang di Bayar : ");
        int uangdibayar = scanner.nextInt();

        int subtotal1 = hargaBuku * jumlah1;
        int subtotal2 = hargaBuku * jumlah2;
        int subtotal3 = hargaBuku * jumlah3;

        int totalBelanja = subtotal1 + subtotal2 + subtotal3;
        int kembalian = uangdibayar - totalBelanja;


    }
}