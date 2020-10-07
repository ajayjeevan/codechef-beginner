/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner inp = new Scanner(System.in);
		int test = inp.nextInt();
		int[] arr = new int[test];
		
		for(int i = 0; i < test; i++)
		    arr[i] = inp.nextInt();
		    
		Arrays.sort(arr);
		
		for(int i = 0; i < test; i++)
		    System.out.println(arr[i]);
		    
	
	}
}

