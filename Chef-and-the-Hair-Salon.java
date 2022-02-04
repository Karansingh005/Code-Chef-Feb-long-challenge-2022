import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0; i<a; i++){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    chef(n,m);
		}
	}
	static void chef(int N, int M){
	    System.out.println(N*M);
	}
}
