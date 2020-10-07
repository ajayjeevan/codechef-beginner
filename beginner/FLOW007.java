/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{   
    static void reverse(int n)
    {
        int rev = 0;
        while(n != 0)
        {
            rev *= 10;
            rev += n%10;
            n /= 10;
        }
        System.out.println(rev);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner inp = new Scanner(System.in);
		int test = inp.nextInt();
		for(int i = 0; i < test; i++)
		{
		    int num = inp.nextInt();
		    reverse(num);
		}
		
	}
}

