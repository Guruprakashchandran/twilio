import java.util.*;

public class Pattern{

	public static void main(String[] args){

		new Pattern().getInputs();
	}
	private void getInputs(){

		Scanner scan = new Scanner(System.in);
		try{

			System.out.print("Enter Input : ");
			int n = scan.nextInt();	
			patternPrinting(n);
		}
		catch(Exception e){

			System.out.println("Wrong Input!!!");
		}	
		finally{

			scan.close();
		}
	}
	public void patternPrinting(int n){

		int i = 0,j = 0;
		while(i ! = -1){

			while(j != -1){

				System.out.print(i == 0 ? "*" : j);
				j = (j == n)? --j : ++j; 				
			}
			System.out.println();
			i = (i == n)? --i : ++i; 
		}
	}
}