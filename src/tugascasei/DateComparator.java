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

    long hari; /**< initial untuk menyimpan value selisih hari */
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); /**< create object untuk format date */
    Calendar aw = Calendar.getInstance(); /**< initialize object calendar untuk tanggal awal dengan default time zone dan locale */
    Calendar ak = Calendar.getInstance(); /**< initialize object calendar untuk tanggal akhir dengan default time zone dan locale */

    /**
     * Method kalkulasi selisih hari antara dua object (tanggal awal, tanggal akhir)
     * @param awal parameter object tanggal awal dari arraylist
     * @param akhir parameter object tanggal akhir arraylist
     * @return value hari yang merupakan selisih hari antara dua object
     * @throws ParseException 
     */
    public long Comparator(Object awal, Object akhir) throws ParseException {
        
        String a = awal.toString(); /**< set string a dengan string dari object tanggal awal (@params awal) */
        String b = akhir.toString(); /**< set string b dengan string dari object tanggal akhir (@params akhir) */

        Date dta = sdf.parse(a); /**< initialize object dta untuk date tanggal awal dengan hasil parsing dari string a menggunakan object sdf) */
        Date dtb = sdf.parse(b); /**< initialize object dtb untuk date tanggal akhir dengan hasil parsing dari string bb menggunakan object sdf) */

        aw.setTime(dta); /**< set waktu object aw untuk tanggal awal berdasarkan inputan parameter Date (dta) */
        ak.setTime(dtb); /**< set waktu object ak untuk tanggal akhir berdasarkan inputan parameter Date (dtb) */

        int com = ak.compareTo(aw); /**< Comparing ak dengan aw dengan return value integer antara -1 (ak<aw), 0 (ak=aw) dan 1(aw<ak) yang disimpan dalam variable com */
        if (com == 1) {
            long milaw = aw.getTimeInMillis(); /**< calendar time (aw) dijadikan dalam miliseconds yang disimpan dalam variable milaw */
            long milak = ak.getTimeInMillis(); /**< calendar time (ak) dijadikan dalam miliseconds yang disimpan dalam variable milak */
            long dif = milak - milaw; /**< menentukan selisih miliseconds dengan pengurangan antara milak dan milaw yang disimpan dalam variable dif */
            hari = dif / (24 * 60 * 60 * 1000); /**< mendapatkan selisih hari dengan formula dif dibagi dengan 1000(ms to sec) * 60 (sec to min) * 60 (min to hour) * 24 (hour to day) */
        } else if (com == -1) {
            return -1;
        } else {
            return 0;
        }
        return hari;
    }
}