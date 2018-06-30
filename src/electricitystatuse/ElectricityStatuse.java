/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricitystatuse;

import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.util.Enumeration;

/**
 *
 * @author DELL
 */
public class ElectricityStatuse extends Thread{
public String status="on";
    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
       System.out.println("Current On");
        while (true) {            
           
        
        try {
		    InetAddress addr = InetAddress.getLocalHost();

		    // Get IP Address
		    byte[] ipAddr = addr.getAddress();

		    // Get hostname
		    String hostname = addr.getHostName();
//		    System.out.println("hostname " + hostname);
//		    System.out.println("IP Address " + convertIP(ipAddr));
//		    System.out.println("IP Address2 " + String.valueOf(ipAddr[0]&0xFF));
                    
                    String ipF=String.valueOf(ipAddr[0]&0xFF);
                    
                    
                    if(ipF.equals("192")){
                        if(status=="off"){
                        System.out.println("Current On");
                        
                        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                        Calendar cal = Calendar.getInstance();
                        System.out.println(dateFormat.format(cal.getTime()));
                        status="on";
                        
                        }
                        
                    }else{
                    if(status=="on"){
                        System.out.println("Current Off");
                         DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
                        Calendar cal = Calendar.getInstance();
                        System.out.println(dateFormat.format(cal.getTime()));
                        status="off";
                    }
                    }
                    
		} catch (java.net.UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
    }

    /**
     * @param args the command line arguments
     */
    }
    
}
