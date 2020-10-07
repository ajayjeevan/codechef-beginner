/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    static void factorial(int n)
    {
        int res[] = new int[500];
        res[0] = 1;
        int res_size=1;
        
        for(int x=2;x<=n;x++)
            res_size = multiply(x, res, res_size);
            
            
        for(int i = res_size - 1; i >= 0; i--)
        {
            System.out.print(res[i]);
        }
        System.out.println();
    }
    
    static int multiply(int x, int res[], int res_size)
    {
        int carry = 0;
        
        for(int i = 0; i < res_size; i++)
        {
            int prdt = res[i]*x + carry;
            res[i] = prdt%10;
            carry = prdt/10;
        }
        while(carry != 0)
        {
            res[res_size] = carry%10;
            carry /= 10;
            res_size++;
        }
        return res_size;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(inp.readLine());
		int num;
        
		if(test>0)
		{
		    for(int i=0;i<test;i++)
		    {
		        num = Integer.parseInt(inp.readLine());
		        factorial(num);
		    }
		}
		
	}
}

