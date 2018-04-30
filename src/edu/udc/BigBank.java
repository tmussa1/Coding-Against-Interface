/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.udc;

import edu.udc.bank.AcctInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author TOSHIBAPC
 */
public class BigBank extends UDCStudentUnion implements BankInterface{

    @Override
    public AcctInterface[] getAcctsArray() {
        return getStudentAccts();
    }

    @Override
    public String getBankName() {
        return "Bank of America";
    }
    
    public static List<AcctInterface> showTop(int howMany, AcctInterface [] aAr) { //returns the topmost elements as requested
    
    Arrays.sort(aAr, new Sorter()); //sorter is a separate class used as a comparator
    List mynewList = new ArrayList(); //new list to be returned
    
    if(howMany <= 0){
        throw new RuntimeException("Enter a valid number to get the top records");
    }
    
    for(int i = 0; (howMany < aAr.length && i < howMany) || (howMany > aAr.length && i < aAr.length); i++){ //checks for bounds using terminating condition of for loop
        mynewList.addAll(Arrays.asList(aAr[i])); //appends to the new list
    }
    return mynewList;
    }
    
}
