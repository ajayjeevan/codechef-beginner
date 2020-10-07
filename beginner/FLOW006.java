/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
	        
		Scanner inp = new Scanner(System.in);
		int test = inp.nextInt();
		
		if(test<=1000){
		    for(int i=0;i<test;i++)
		    {
		        int N = inp.nextInt();
		        int num = N;
		        int sum = 0;
		        while(num!=0)
		        {
		            sum += num%10;
		            num /= 10;
		        }
		        System.out.println(sum);
		    }
		}
	    }
	    catch(Exception e)
	    {
	        return;
	    }
		
	}
}

