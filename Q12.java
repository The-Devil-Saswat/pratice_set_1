package Pratice_Set_1;

import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		
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
		int c=0;
		for (int e:arr2)
		{
			for (int f:arr1)
			{
				if (e==f)
					break;
				else if(f==arr1[arr1.length-1])
					c=1;
			}
			
			if (c==1)
			{
				System.out.println("no it is not a sub set");
				break;
			}
			else if(e==arr2[arr2.length-1])
			{
				System.out.println("yes it is a sub set");
			}
		}
		
	}

}
