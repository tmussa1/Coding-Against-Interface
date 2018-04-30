/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.udc;

import edu.udc.bank.AcctInterface;
import java.util.Comparator;

/**
 *
 * @author TOSHIBAPC
 */
public class Sorter implements Comparator<AcctInterface>{
    @Override
    public int compare(AcctInterface a, AcctInterface b){
        if(a.getAcctHolder().compareTo(b.getAcctHolder()) == 0) {
            return (int) (b.getAcctValue() - a.getAcctValue()); // sorts account holders with the same name in descending order
        } else {
            return a.getAcctHolder().compareTo(b.getAcctHolder()); //sorts by name
        }
    }
}
