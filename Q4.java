package Set_1;

import java.util.Scanner;

public class Q4 {

	static void sort (int[] arr)
	{
		int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
	}
	public static void main(String[] args) {
		Scanner so=new Scanner(System.in);
		System.out.println("Enter the len of arrays");
		int len=so.nextInt();
		int [] arr=new int [len];
		System.out.println("Enter arr");
		for (int i=0;i<arr.length;i++)
			arr[i]=so.nextInt();
		sort(arr);
		int[] arr1=new int[len];
		int j=0;
		for (int i=0;i<arr.length;i+=2)
		{
			arr1[i]=arr[j];
			j++;
		}
		for (int i=1;i<arr.length;i+=2)
		{
			arr1[i]=arr[j];
			j++;
		}
		for (int e:arr1)
			System.out.print(e+",");

	}

}
