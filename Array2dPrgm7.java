package Part3;

import java.util.Scanner;

public class Array2dPrgm7 
{
	public static void reverse(int[][] arr)
	{
		int[][] b = new int[arr.length][arr[0].length];
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=0;j<arr[0].length;j++)
			{
				b[i][j]= arr[arr[0].length-1-i][j];
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the "+(i+1)+" row");
			for(int j=0;j<a[0].length;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		reverse(a);
	}

}
