import java.util.*;

public class Decode{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		new Decode().decoding(input);
		scan.close();
	}
	private void decoding(String input){

		int stIndex = 0,endIndex = input.length;
		List<Integer> arr = new ArrayList<>();
		for(int i = 0;i<arr.length;++i){

			arr.set(i,i+1);
		}
		List<String> list = new ArrayList<>();
		for(int i = 0,count = 1;i<input.length();++i){

			if(i+1 < length && input.charAt(i) == input.charAt(i+1)){

				count++;
			}
			else {

				list.add(count+input.charAt(i));
				count = 1;
			}
		}
		System.out.println(list.toString());
	}
}