package Set_1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,3,4,5,6,7,8,9};
		Scanner so=new Scanner (System.in);
		System.out.println("Enter the k value");
		int k=so.nextInt();
		int i=0;
		while (i<arr.length-1)
		{
			int a=i+k-1;
			if (a>arr.length)
				a=arr.length-1;
			for (int j=i;(j<i+k)&(j<arr.length)&a<arr.length;j++)
			{
				if(j<a)
				{
					swap(arr[j],arr[a],arr);
					a--;
				}
			}
			i+=k;
		}
		System.out.println("After swaps");
		for (int j:arr)
			System.out.print(j+",");

	}

	static void swap(int i, int j,int[] arr) 
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
