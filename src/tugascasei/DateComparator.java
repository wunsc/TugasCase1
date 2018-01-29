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