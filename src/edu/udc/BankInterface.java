/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.udc;
import edu.udc.bank.AcctInterface;
/**
 *
 * @author TOSHIBAPC
 */
public interface BankInterface {
    
public AcctInterface[] getAcctsArray();

public String getBankName();
    
}