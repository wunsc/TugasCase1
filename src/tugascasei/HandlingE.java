/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugascasei;

/** @brief Custom Exception class 
 *
 * @author MuhammadTaufik
 * @date January 2018
 */
public class HandlingE extends Exception{
    
    /**
     * Constructor membuat custom handle an exception
     * @param mes 
     */
    public HandlingE(String mes){
        super(mes);
    }
}
