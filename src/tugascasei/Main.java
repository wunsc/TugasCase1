/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugascasei;

//import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.Date;
import java.util.List;
import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author MuhammadTaufik
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        
//        for (MyDate myDate : obdat) {
//            //dc.Comparator(myDate, myDate);
//            System.out.println(myDate.toString());
//            //System.out.println(myDate.toString().length());
//        }
        
//        System.out.println(obdat.get(0).toString());
//        String a = obdat.get(0).toString();
//        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
//        try {
//            Date d = sd.parse(a);
//            System.out.println(sd.format(d));
//        String b = a.substring(4, 5);
//        String c = a.substring(5);
//        System.out.println(b+c);
//System.out.println(selisih_hari);
//        String b = obdat.get(0).toString();
//        System.out.println(b);
//        System.out.println(b.substring(5));
//        System.out.println(b.substring(3, 4));
//        System.out.println(b.substring(0, 2));
//        
//        Calendar cld = Calendar.getInstance();
//        Calendar cld1 = Calendar.getInstance();
//        //System.out.println(cld.get(Calendar.DAY_OF_YEAR));
//        
//        cld.set(2018, 2, 30);
//        cld1.set(2018, 2, 28);
//        int a = cld1.compareTo(cld);
//        System.out.println(a);
//        int day = cld.get(Calendar.DAY_OF_WEEK);
//        System.out.println(day);
//        int max = cld.getActualMaximum(Calendar.DAY_OF_MONTH);
//        System.out.println(max);
//        } catch (ParseException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
