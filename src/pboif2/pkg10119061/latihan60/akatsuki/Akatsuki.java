/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan60.akatsuki;

import java.util.Scanner;

/**
 *
 * @author Rheiza
 */
public class Akatsuki {
    protected String nama,partner,asalDesa;

     public Akatsuki() {
        System.out.println("==============AKATSUKI===============");
        System.out.println("==Daftar Anggota==");
        System.out.println("1. Pein");
        System.out.println("2. Konan");
        System.out.println("3. Kisame");
        System.out.println("4. Zetsu");
        System.out.println("5. Tobi");
        System.out.println("6. Deidara");
        System.out.println("7. Hidan");
        System.out.println("8. Kakuzu");
        System.out.println("9. Sasori");
        System.out.println("10. Itachi");
    }

    public String getNama() {
        return nama;
    }


    public String getPartner() {
        return partner;
    }

    public String getAsalDesa() {
        return asalDesa;
    }

    public int pilihAnggota() {
        System.out.print("\nPilih Karakter : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }  
}
