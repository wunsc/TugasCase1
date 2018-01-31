/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugascasei;

/** @brief Custom Exception class 
 *
 * @author Muhammad Taufik Rahman
 * @date January 2018
 */
public class HandlingE extends Exception{
    
    /**
     * Construct HandlingE dengan spesifik pesan yang telah ditentukan
     * @param mes merupakan parameter untuk spesifik pesan, tipe data String
     */
    public HandlingE(String mes){
        super(mes);
    }
}
