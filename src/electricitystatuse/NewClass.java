/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricitystatuse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author DELL
 */
public class NewClass {
    public static void  main(String [] args){
      
       
            ElectricityStatuse ets=new ElectricityStatuse();
            ets.start();
           
           
        }
    
    
	
	// Convert to dot representation
	private static String convertIP(byte[] ipAddr){
	    String ipAddrStr = "";
	    for (int i=0; i<ipAddr.length; i++) {
	        if (i > 0) {
	            ipAddrStr += ".";
	        }
	        ipAddrStr += ipAddr[i]&0xFF;
	    }
	    return ipAddrStr;
        
        
        
    }
    
}
