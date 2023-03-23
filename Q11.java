package Pratice_Set_1;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-3 -4 -5 5 3 2 2 0 1 2 3 4 5 -5 -4 -3 -2 -1 -2 2
		//20
		Scanner so=new Scanner(System.in);
		System.out.println("Enter the len of arrays");
		int [] arr=new int [so.nextInt()];
		System.out.println("Enter the array");
		for (int i=0;i<arr.length;i++)
			arr[i]=so.nextInt();
		int max=-1 , len=0 , st=-1 , en=-1;
		for (int i=0;i<arr.length;i++)
		{
			int sum=0;
			for (int j=i;j<arr.length;j++)
			{
				sum+=arr[j];
				int nlen=j-i+1;
				if (sum==0 && sum>max && len<nlen)
				{
					st=i;
					en=j;
					len=nlen;
					break;
				}
				
			}
				
		}
		System.out.println(st+"  "+en);

	}

}
