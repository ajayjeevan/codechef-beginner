/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int len(int n)
    {
        int count = 0;
        while(n!=0)
        {
            n /= 10;
            count++;
        } 
        return count;
    }
    static void sum(int n)
    {
        int count = len(n);
        int first = n%10;
        int last = (int)(n/(Math.pow(10,count-1)))%10;
        
        System.out.println(first+last);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner inp = new Scanner(System.in);
	    
		int test = inp.nextInt();
	    for(int i = 0; i < test; i++)
	    {
	        int num = inp.nextInt();
	        sum(num);
	        
	    }
		
	}
}

