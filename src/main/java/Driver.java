

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.concurrent.Semaphore;

/**
 *
 * @author Kerly Titus
 */
public class Driver {

    /** 
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    	Network objNetwork = new Network( );            /* Activate the network */
        objNetwork.start();

        Server server1 = new Server("server1");
        server1.start();
        Server server2 = new Server("server2");
        server2.start();
        Server server3 = new Server("server3");
        server3.start();

        Client objClient1 = new Client("sending");          /* Start the sending client thread */
        objClient1.start();
        Client objClient2 = new Client("receiving");        /* Start the receiving client thread */
        objClient2.start();
        
      /*..............................................................................................................................................................*/
       
    }
    
 }
