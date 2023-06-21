public class RadixSort{

	public int maxValue(int[] num){
	
		int max = num[0];
		for(int i = 1;i<num.length;++i){

			if(num[i]>max){

				max = num[i];
			}
		}
		return max;
	}
	public void countingSort(int[] num,int value){
		
		int[] temp = new int[10];
		int[] newArray = new int[num.length+1]
		for(int i = 0;i<num.length;++i){
			
			temp[(num[i]/value)%10]++;
		}		
		for(int i = 1;i<num.length;++i){

			temp[i] += temp[i-1];
		}	
	}
	public void radixSort(int[] num){
		
		int max = maxValue(num);
		for(int i = 1;i<max/i;i*=10){

			countingSort(max,i);			
		}
	}
	public void printDetails(int[] num){

		for(int i = 0;i<num.length;++i){

			System.out.print(num[i]+" ");
		}
	}  	
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int[] num = new int[length];
		for(int i = 0;i<length;++i){

			num[i] = scan.nextInt();
		}
		new RadixSort(nums).printElements(num,length);
	}
}