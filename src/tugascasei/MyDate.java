/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugascasei;

/**
 *
 * @author MuhammadTaufik
 */
public class MyDate {

    int hari;
    int bln;
    int thn;
    
    public MyDate(){
        
    }
    
    public MyDate(int hari, int bln, int thn) throws HandlingE {
        this.thn = thn;
        this.bln = bln;
        this.hari = hari;
    }

    public boolean validasiTahun(int thn) throws HandlingE {
        if (thn < 1970 || thn > 9999) {
            throw new HandlingE("input tahun salah");
//            return false;
        }
        return true;
    }

    public boolean validasiBulan(int bln) throws HandlingE {
        if (bln < 0 || bln > 12) {
            throw new HandlingE("input bulan salah, 1-12");
//              return false;
        }
        return true;
    }

    public boolean validasiHari(int thn, int bln, int hari) throws HandlingE {
        if (validasiTahun(thn) & validasiBulan(bln)) {
            switch (bln) {
                case 1: case 3: case 5: case 7: case 8: case 10:
                case 12:
                    if (hari > 31) {
                        throw new HandlingE("input hari salah, 1-31");
//                          return false;
                    }
                    return true;
                case 4: case 6: case 9:
                case 11:
                    if (hari > 30) {
                        throw new HandlingE("input hari salah, 1-30");
//                        return false;
                    }
                    return true;
                case 2:
                    if (thn % 4 == 0) {
                        if (hari > 29) {
                            throw new HandlingE("input hari salah, 1-29");
//                            return false;
                        }
                        return true;
                    } else {
                        if (hari > 28) {
                            throw new HandlingE("input hari salah, 1-28");
//                            return false;
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
