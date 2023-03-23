package Set_1;

import java.util.Scanner;

public class Q7 {

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
		// TODO Auto-generated method stub
		Scanner so=new Scanner(System.in);
		System.out.println("Enter the len of arrays");
		int len=so.nextInt();
		int [] arr=new int [len];
		System.out.println("Enter arr");
		for (int i=0;i<arr.length;i++)
			arr[i]=so.nextInt();
		sort(arr);
		for (int e:arr)
			System.out.print(e);

	}

}
