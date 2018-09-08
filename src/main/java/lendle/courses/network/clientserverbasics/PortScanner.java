/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.network.clientserverbasics;

import java.net.Socket;

/**
 *
 * @author lendle
 */
public class PortScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        for(int i=0; i<=1024; i++){
            //hint: 建立 socket，連結到 i port
            try(Socket socket=null){
            /////////////////////////////////
                System.out.println("there is a service on port: "+i);
            }catch(Exception e){
                
            }
        }
    }
    
}
