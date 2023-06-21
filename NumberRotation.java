import java.util.*;

public class NumberRotation{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number = scan.nextInt();
		new NumberRotation().findNumberRotation(Number);
	}
	private void findNumberRotation(int Number){

		String s = Integer.toString(Number);
		int st = 0,end = s.length()-1;
		boolean isNotStrobogrammetic = false;
		while(st < end){

			if(s.charAt(st).equals("1") || s.charAt(st).equals("6") || s.charAt(st).equals("8") || s.charAt(st).equals("9")){

				if((s.charAt(st).equals("1") && s.charAt(st).equals("1")) || (s.charAt(st).equals("") && s.charAt(end).equals("9")) || (s.charAt(st).equals("8") && s.charAt(end).equals("8")) || (s.charAt(st).equals("9") && s.charAt(end).equals("6"))){

					st += 1;
					end -= 1;
				}
				else {

					isNotStrobogrammetic  = true;
					break;				
				}
			}
			else{

				isNotStrobogrammetic  = true;
				break;
			}
		}
		if(isNotStrobogrammetic == false){

			System.out.println("It is Strobogrammetic Number");
		}
		else{

			System.out.println("It is Not Strobogrammetic Number");
		}
	}
}