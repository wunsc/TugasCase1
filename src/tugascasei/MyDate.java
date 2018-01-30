/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugascasei;

/** @brief MyDate class
 *
 * @author Muhammad Taufik Rahman
 * @date January 2018
 */
public class MyDate {

    private int hari; /**< initial tanggal */
    private int bln; /**< initial bulan */
    private int thn; /**< initial tahun */
    
    /**
     * Default constructor. Untuk create object pemanggilan method validasi
     */
    public MyDate(){
        
    }
    
    /**
     * Constructor with param. Untuk create object tanggal awal dan tanggal akhir
     * @param hari parameter tanggal, tipe data integer
     * @param bln parameter bulan, tipe data integer
     * @param thn parameter tahun, tipe data integer
     * @throws HandlingE custom handle exception dari class HandlingE
     */
    public MyDate(int hari, int bln, int thn) throws HandlingE {
        this.thn = thn;
        this.bln = bln;
        this.hari = hari;
    }
    
    /**
     * Method validasi tahun untuk pengecekan input tahun antara 1970 sampai 9999,
     * dan akan throws jika input salah
     * @param thn parameter tahun, tipe data integer
     * @return boolean
     * @throws HandlingE custom exception dari class HandlingE
     */
    public boolean validasiTahun(int thn) throws HandlingE {
        if (thn < 1970 || thn > 9999) {
            throw new HandlingE("input tahun salah");
        }
        return true;
    }
    
    /**
     * Method validasi bulan untuk pengecekan input bulan antara 1 sampai 12,
     * dan akan throws jika input bulan salah
     * @param bln parameter bulan, tipe data integer
     * @return boolean
     * @throws HandlingE custom exception dari class HandlingE
     */
    public boolean validasiBulan(int bln) throws HandlingE {
        if (bln < 1 || bln > 12) {
            throw new HandlingE("input bulan salah, 1-12");
        }
        return true;
    }
    
    /**
     * Method validasi, untuk pengecekan input tanggal dengan memerlukan parameter input tahun dan bulan,
     * dan akan throws jika input salah
     * @param thn parameter tahun, tipe data integer
     * @param bln parameter bulan, tipe data integer
     * @param hari parameter tanggal, tipe data integer
     * @return boolean
     * @throws HandlingE custom exception dari class HandlingE
     */
    public boolean validasi(int thn, int bln, int hari) throws HandlingE {
        /**
         * 
         */
        if (validasiTahun(thn) & validasiBulan(bln)) {
            switch (bln) {
                case 1: case 3: case 5: case 7: case 8: case 10:
                case 12:
                    if (hari > 31) {
                        throw new HandlingE("input tanggal salah, 1-31");
                    }
                    return true;
                case 4: case 6: case 9:
                case 11:
                    if (hari > 30) {
                        throw new HandlingE("input tanggal salah, 1-30");
                    }
                    return true;
                case 2:
                    if (thn % 4 == 0) {
                        if (hari > 29) {
                            throw new HandlingE("input tanggal salah, 1-29");
                        }
                        return true;
                    } else {
                        if (hari > 28) {
                            throw new HandlingE("input tanggal salah, 1-28");
                        }
                        return true;
                    }
                default:
                    System.out.println("input tanggal salah");
                    break;
            }
            return false;
        }
        return false;
    }
    
    /**
     * Method untuk Builder String dari masing-masing parameter hari, bulan dan tahun
     * @return String
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(hari);
        sb.append("-");
        sb.append(bln);
        sb.append("-");
        sb.append(thn);
        return sb.toString();
    }
}
