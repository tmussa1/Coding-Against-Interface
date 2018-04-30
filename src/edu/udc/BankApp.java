/*
 * Date: 02/18/2018
 * This assignment deals with interfaces and collections in Java 
 * It is an implementation of bank records
 * Submitted to: Dr. Belcher
 */
package edu.udc;
import edu.udc.bank.AcctInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author Tofik Mussa
 */
public class BankApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
    try
    {
    BankInterface myBank = new BigBank();
    AcctInterface [] myaccts = myBank.getAcctsArray();
    java.util.List<AcctInterface> lstAcct = BigBank.showTop(4, myaccts);
    System.out.println(myBank.getBankName());

    for(AcctInterface ai:lstAcct) {
        System.out.println(ai.getAcctHolder());
        System.out.println(ai.getAcctValue());
    }

    }

    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
    
    }
    
    

    }
    

