/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static final double charge = 0.50;
    
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        String arr[] = str.split(" ");
        
        double amt = 0.00;
        double tot = 0.00;
        
        amt = Double.parseDouble(arr[0]);
        tot = Double.parseDouble(arr[1]);
        
        
        if(amt%5 == 0){
            if(amt+charge <= tot){
                System.out.println(String.format("%.2f", tot-amt-charge));
            }
            else 
                System.out.println(String.format("%.2f", tot));
        }
        else 
                System.out.println(String.format("%.2f", tot));
        
	}
}
