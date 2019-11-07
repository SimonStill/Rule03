/******************************************************************************
 *  Rule03 - NUM03
 *  Compliant
 ******************************************************************************/

import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

public class R03_NUM03_Compliant_Compilable{
    
    public static void main(String[] args){
        DataInputStream is = new DataInputStream();
        int x; 
        getInteger(x);
        System.out.println("The integer is: " + x);
    }
    
    public static long getInteger (DataInputStream is) throws IOException {
        try {
            return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
        }
        catch(IOException e) {
            System.out.println("Problem reading integer");
        }
    } 
}


