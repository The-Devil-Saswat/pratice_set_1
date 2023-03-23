package Pratice_Set_1;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner so=new Scanner(System.in);
		System.out.println("Enter the len of arrays");
		int [] arr=new int [so.nextInt()];
		System.out.println("Enter the array");
		for (int i=0;i<arr.length;i++)
			arr[i]=so.nextInt();
		int min=arr[0];
		int s=0,e=0;
		for (int i=0;i<arr.length;i++)
		{
			int sum=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				sum+=arr[j];
				if(sum>min)
				{
					min=sum;
					s=i;
					e=j;
				}
			}
			
		}
		System.out.println(min+"   "+s+"    "+e);

	}

}
