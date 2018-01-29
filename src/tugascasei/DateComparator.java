/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugascasei;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author MuhammadTaufik
 */
public class DateComparator {

    long hari;
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    Calendar aw = Calendar.getInstance();
    Calendar ak = Calendar.getInstance();

    public long Comparator(Object awal, Object akhir) throws ParseException {

        String a = awal.toString();
        String b = akhir.toString();

        Date dta = sdf.parse(a);
        Date dtb = sdf.parse(b);

        aw.setTime(dta);
        ak.setTime(dtb);

        int com = ak.compareTo(aw);
        if (com == 1) {
            long milaw = aw.getTimeInMillis();
            long milak = ak.getTimeInMillis();
            long dif = milak - milaw;
            hari = dif / (24 * 60 * 60 * 1000);
        } else if (com == -1) {
            return -1;
        } else {
            return 0;
        }
        return hari;
    }
}

//        int thna = 0;
//        int thnb = 0;
//        int blna = 0;
//        int blnb = 0;
//        int thna = Integer.valueOf(a.substring(5));
//        int thnb = Integer.valueOf(b.substring(5));
//        int blna = Integer.valueOf(a.substring(3, 4));
//        int blnb = Integer.valueOf(b.substring(3, 4));
//        int hra = Integer.valueOf(a.substring(0, 2));
//        int hrb = Integer.valueOf(b.substring(0, 2));
//        if ((a.substring(4, 5) == "0" || a.substring(4, 5) == "1") && (b.substring(4, 5) == "0" || b.substring(4, 5) == "1")){
//            blna = Integer.valueOf(a.substring(3, 5)); 
//            blnb = Integer.valueOf(b.substring(3, 5));
//            thna = Integer.valueOf(a.substring(6));
//            thnb = Integer.valueOf(b.substring(6));
//        } else if ((a.substring(4, 5) == "-") && (b.substring(4, 5) == "0" || b.substring(4, 5) == "1")) {
//            blna = Integer.valueOf(a.substring(3, 4));
//            blnb = Integer.valueOf(b.substring(3, 5));
//            thna = Integer.valueOf(a.substring(5));
//            thnb = Integer.valueOf(b.substring(6));
//        } else if ((a.substring(4, 5) == "0" || a.substring(4, 5) == "1") && (b.substring(4, 5) == "-")) {
//            blna = Integer.valueOf(a.substring(3, 5));
//            blnb = Integer.valueOf(b.substring(3, 4));
//            thna = Integer.valueOf(a.substring(6));
//            thnb = Integer.valueOf(b.substring(5));
//        } else if ((a.substring(4, 5) == "-") && (b.substring(4, 5) == "-")){
//            blna = Integer.valueOf(a.substring(3, 4));
//            blnb = Integer.valueOf(b.substring(3, 4));
//            thna = Integer.valueOf(a.substring(5));
//            thnb = Integer.valueOf(b.substring(5));
//        }
//        aw.set(thna, blna, hra);
//        ak.set(thnb, blnb, hrb);

