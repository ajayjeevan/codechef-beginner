/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void count(int n)
    {
        int count = 0;
        while(n != 0)
        {
            int dig = n%10;
            if(dig == 4) count++;
            n /= 10;
        }
        System.out.println(count);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    Scanner inp = new Scanner(System.in);
	    int test = inp.nextInt();
	    
		for(int i = 0; i < test; i++)
		{
		    int num = inp.nextInt();
		    count(num);
		}
		
	}
}

