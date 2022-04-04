package Part3;

import java.util.Scanner;

public class Array2dPgm3 
{
	public static void biggestElement(int[][] arr)
	{
		int max;
		for(int i=0;i<arr.length;i++)
		{
			max = arr[i][0];
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]>max)
					max = arr[i][j];
			}
			System.out.println(i+1+ " row biggest element is " +max);
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
		
		biggestElement(a);
	}

}
