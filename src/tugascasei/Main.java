/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugascasei;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MuhammadTaufik
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long selisih_hari;
        MyDate md = new MyDate();
        List<MyDate> obdat = new ArrayList<MyDate>();
        DateComparator dc = new DateComparator();
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Tanggal Awal");
        while (i <= 2) {
            System.out.print("Tanggal: ");
            int tgl = sc.nextInt();
            System.out.print("Bulan: ");
            int bln = sc.nextInt();
            System.out.print("Tahun: ");
            int thn = sc.nextInt();
            try {
                if (md.validasiHari(thn, bln, tgl)){
                    obdat.add(new MyDate(tgl, bln, thn));
                }
            } catch (HandlingE ex) {
                System.out.println(ex.getMessage());
                obdat.removeAll(obdat);
                break;
            }
            if (i != 2){
                System.out.println("Tanggal Akhir");
            }
            i++;
        }
        
        for (int j = 0; j < obdat.size()-1; j++){
            try {
                selisih_hari = dc.Comparator(obdat.get(j), obdat.get(j+1));
                System.out.println("Selisih Hari: " + selisih_hari);
            } catch (ParseException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
