import java.util.*;

public class NumberToWordConvert{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number = scan.nextInt();
		NumberToWordConvert word = new NumberToWordConvert();
		int[] arr = word.convertArray(number);
		word.converWord(arr);
	}
	private int[] convertArray(int number){
		
		String num = Integer.toString(number);
		int[] arr = new int[Integer.toString(number).length()]
		for(int i = 0;i<num.length();++i){

			arr[i] = Character.getNumbericValue(num.charAt(i));
		}
		return arr;
	}
	private void convertWord(int[] arr){

		int[] numbers = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		int[] elevenToNinetin = {"Ten","Elevan","twelve","Thirteen","Fouteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		int[] tenMultiply = {"Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty","Hundred"};

		String s = "";	
		for(int i = arr.length-1;i>=0;--i){

			if(i == 2){

				if(arr[i] != 0){

					s += numbers[arr[i]-1] + " Hundred";
					if(arr[1] != 0 || arr[0] != 0){

						s += " and";
					}
				}				
			}
			else if(i == 1){

				if(arr[i] < 10 && arr[i] > 1){

					
					s += tenMultiply[arr[i]-2];
					if(arr[i] > 0 && arr[i] < 10){

						s += number[arr[0]-1];	
					}	
					i--;			
				}
				else if(arr[i] == 1){


					s += elevenToNinetin[arr[0]];
				}
			}
			else if(i == 0){

				s += number[arr[i]-1];
			}
		}
		System.out.println(s);
	}
}