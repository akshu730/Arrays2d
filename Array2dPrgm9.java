package Part3;

import java.util.Scanner;

public class Array2dPrgm9 
{
	public static void leftRotate(int[][] arr)
	{
		int[][] b = new int[arr.length][arr[0].length];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				b[i][j] = arr[arr.length-1-j][i];
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
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] a = new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		leftRotate(a);

	}

}
