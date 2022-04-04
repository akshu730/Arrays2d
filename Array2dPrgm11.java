package Part3;

import java.util.Scanner;

public class Array2dPrgm11 
{
	public static void clockwiseSpiral(int[][] arr)
	{
		int row_start = 0;
		int col_start = 0;
		int row_end = arr.length-1;
		int col_end = arr[0].length-1;
		
		while(row_start<=row_end && col_start<=col_end)
		{
			for(int i=col_start;i<=col_end;i++)
			{
				System.out.print(arr[row_start][i]);
			}
			row_start+=1;
			for(int i=row_start;i<=row_end;i++)
			{
				System.out.print(arr[i][col_end]);
			}
			col_end-=1;
			if(row_start<=row_end)
			{
				for(int i=col_end;i>=col_start;i--)
				{
					System.out.print(arr[row_end][i]);
				}
				row_end-=1;
			}
			if(col_start<=col_end)
			{
				for(int i=row_end;i>=row_start;i--)
				{
					System.out.print(arr[i][col_start]);
				}
				col_start+=1;
			}
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
		
		clockwiseSpiral(a);
	}

}
