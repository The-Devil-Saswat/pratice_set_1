package Pratice_Set_1;

import java.util.Scanner;

public class Q14 {
	
	static void sort (int[] arr)
	{
		int n = arr.length;
        for (int i = 1; i < n; ++i) 
        {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		System.out.println("Enter the value of X");
		sort(arr1);
		int [] u=new int [arr1.length];
		int [] v=new int [arr1.length];
		int i=0;
		int x=so.nextInt();
		for (int e:arr1)
			for (int f:arr2)
				if ((e+f)==x)
				{
					u[i]=e;
					v[i]=f;
					i++;
				}
		System.out.println("The Pairs are:-");
		for (int j=0;j<u.length;j++)
			if(u[j]!=0)
				System.out.println(u[j]+" + "+v[j]);

	}

}
