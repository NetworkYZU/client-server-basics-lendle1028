/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.network.clientserverbasics;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author lendle
 */
public class TimeClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Socket socket=new Socket("time.nist.gov", 13);
        InputStream input=socket.getInputStream();
        StringBuilder builder=new StringBuilder();
        InputStreamReader reader=new InputStreamReader(input);
        for(int c=reader.read(); c!=-1; c=reader.read()){
            builder.append((char)c);
        }
        System.out.println(builder);
        socket.close();
    }
    
}
