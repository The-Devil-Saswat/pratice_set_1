package Pratice_Set_1;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) 
	{
		Scanner so=new Scanner(System.in);
		System.out.println("Enter the len of array 1");
		int [] arr1=new int [so.nextInt()];
		System.out.println("Enter the array 1");
		for (int i=0;i<arr1.length;i++)
			arr1[i]=so.nextInt();
		System.out.println("Enter the len of array 2");
		int [] arr2=new int [so.nextInt()];
		System.out.println("Enter the array 2");
		for (int i=0;i<arr2.length;i++)
			arr2[i]=so.nextInt();
		int min=arr1[0]*arr2[0];
		int index=0;
		for (int i=1;i<arr1.length;i++)
			if((arr1[i]*arr2[i])<min)
			{
				min=arr1[i]*arr2[i];
				index=i;
			}
		System.out.println("Min sum is "+min+" and index is "+index);

	}

}
