import java.util.*;

public class HighProfit{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int[] arr = new int[length];
		for(int i = 0;i<length;++i){

			arr[i] = scan.nextInt();
		}
		new HighProfit().findHighProfit(arr,length);
	}
	private void findHighProfit(int[] arr,int length){

		int value = 0,index = 0;
		for(int i = 0;i<length;++i){

			if(arr[i] > arr[index]){

				index = i;
			}
			else if(arr[i] - arr[index] > value){

				value = arr[i] - arr[index];
			}
		}
		System.out.println("Profit : " +value);
	}
}