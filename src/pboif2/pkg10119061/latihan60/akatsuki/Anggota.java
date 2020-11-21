/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan60.akatsuki;

/**
 *
 * @author Rheiza
 */
public class Anggota extends Akatsuki{
 
     public Anggota () {
        int pilih = pilihAnggota();
        switch (pilih) {
            case 1:
                this.nama = "Pein";
                this.asalDesa = "Amegakure";
                this.partner = "Konan";
                break;
            case 2:
                this.nama = "Konan";
                this.asalDesa = "Amegakure";
                this.partner = "Pein";
                break;
            case 3:
                this.nama = "Kisame";
                this.asalDesa = "Kirigakure";
                this.partner = "Itachi";
                break;
                
            case 4:
                this.nama = "Zetsu";
                this.asalDesa = "Kusagakure";
                this.partner = "Tobi";
                break;
                
            case 5:
                this.nama = "Tobi";
                this.asalDesa = "Konohagakure";
                this.partner = "Deidara, Zetsu";
                break;
            case 6:
                this.nama = "Deidara";
                this.asalDesa = "Iwagakure";
                this.partner = "Sasori";
                break;
            case 7:
                this.nama = "Hidan";
                this.asalDesa = "Yugakure";
                this.partner = "Kakuzu";
                break;
            case 8:
                this.nama = "Kakuzu";
                this.asalDesa = "Takigakure";
                this.partner = "Hidan";
                break;
            case 9:
                this.nama = "Sasori";
                this.asalDesa = "Sunagakure";
                this.partner = "Deidara";
                break;
            case 10:
                this.nama = "Itachi";
                this.asalDesa = "Konohagakure";
                this.partner = "Kisame";
                break;
            case 11:
                this.nama = "Orochimaru";
                this.asalDesa = "Konohagakure";            
                this.partner = "Sasori";
                break;
            default:
                break;
        }
     }    
    
    @Override
    public int pilihAnggota() {
        return super.pilihAnggota();
    }
    
    public void tampilProfil() {
        System.out.println("\n=============Profil Karakter============");
        System.out.println("Nama \t\t: " +getNama());
        System.out.println("Asal \t\t: " +getAsalDesa());
        System.out.println("Partner \t: " +getPartner());
}
}
