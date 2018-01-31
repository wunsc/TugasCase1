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

    private int hari; // initial tanggal
    private int bln; // initial bulan
    private int thn; // initial tahun
    
    /**
     * Mengalokasikan object MyDate dan initializes sehingga dapat memanggil method-nya
     */
    public MyDate(){
        
    }
    
    /**
     * Mengalokasikan object MyDate dan initializes dengan spesifik tanggal, bulan dan tahun
     * @param hari merupakan parameter untuk tanggal, tipe data integer
     * @param bln merupakan parameter untuk bulan, tipe data integer
     * @param thn merupakan parameter untuk tahun, tipe data integer
     * @throws HandlingE merupakan custom handle exception untuk signals error ketika terjadi kesalahan dalam input 
     */
    public MyDate(int hari, int bln, int thn) throws HandlingE {
        this.thn = thn;
        this.bln = bln;
        this.hari = hari;
    }
    
    /**
     * Merupakan method untuk validasi tahun ketika input value tahun yang mana harus di antara 1970 sampai 9999
     * @param thn merupakan parameter untuk tahun, tipe data integer
     * @return boolean, false akan di-throws
     * @throws HandlingE merupakan custom handle exception untuk signals error ketika terjadi kesalahan dalam input tahun
     */
    public boolean validasiTahun(int thn) throws HandlingE {
        if (thn < 1970 || thn > 9999) {
            throw new HandlingE("input tahun salah");
        }
        return true;
    }
    
    /**
     * Merupakan method untuk validasi bulan ketika input value bulan yang mana harus di antara 1 sampai 12
     * @param bln merupakan parameter untuk bulan, tipe data integer
     * @return boolean, false akan di-throws
     * @throws HandlingE merupakan custom handle exception untuk signals error ketika terjadi kesalahan dalam input bulan
     */
    public boolean validasiBulan(int bln) throws HandlingE {
        if (bln < 1 || bln > 12) {
            throw new HandlingE("input bulan salah, 1-12");
        }
        return true;
    }
    
    /**
     * Merupakan method untuk validasi tanggal ketika input value tanggal yang mana harus menyesuaikan dengan value tahun dan bulan
     * @param thn merupakan parameter untuk tahun, tipe data integer. Validasi mengambil method validasiTahun(thn)
     * @param bln merupakan parameter untuk bulan, tipe data integer. Validasi mengambil method validasiBulan(bln)
     * @param hari merupakan parameter untuk tanggal, tipe data integer
     * @return boolean, false akan di-throws
     * @throws HandlingE merupakan custom handle exception untuk signals error ketika terjadi kesalahan dalam input tanggal
     */
    public boolean validasi(int thn, int bln, int hari) throws HandlingE {
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
     * Merupakan method untuk Builder String atau menggabungkan dari masing-masing parameter hari, bulan dan tahun dipisahkan dengan "-"
     * @return String -> hari-bulan-tahun
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
