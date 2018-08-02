package ProgramKasir;

import java.util.Scanner;

public class ProgramKasir {

    public static void main(String[] args) {
        program kasir = new program();
        kasir.pertama();
    }
    }
class program{
    public void pertama(){
        int jumlah, harga, total, diskonA, diskonB, kembali, anggota, totalA, totalB;
        int diskon = 10;
        String nama;
        Scanner masuk = new Scanner(System.in);
        do{
            System.out.println("~~WELCOME TO cSHOP~~");
            System.out.print("Masukkan Nama : ");
            nama = masuk.next();
            System.out.print("Jumlah Barang : ");
            jumlah = masuk.nextInt();
            System.out.print("Harga Barang Satuan : Rp. ");
            harga = masuk.nextInt();
            System.out.print(nama + ", Apakah anda anggota? (y=1, n=2)" );
            anggota = masuk.nextInt();
            total = jumlah * harga;
            
            if (total > 1000000){
                    diskonA = total / diskon;
                    if (anggota == 1){
                        diskonB = total / diskon;
                        totalA = total - diskonA - diskonB;
                        System.out.println("Total : Rp. " + totalA);
                    }else
                        totalA = total - diskonA;
                    System.out.println("Total : Rp. " + totalA);
                    
                    }else
                System.out.println("Total : Rp. " + total);
            System.out.print(nama + ", Ingin melakukan transaksi lagi? (y=1, n=2)");
            kembali = masuk.nextInt();
            
        }while (kembali == 1);
        System.out.print("\n ~~~TERIMA KASIH~~~");
    }
}
        
            
        
                
    
        
    
    

