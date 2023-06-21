import java.util.*;

public class PascalTriangle{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Input : ");
		int input = scan.nextInt();
		new PascalTriangle().createList(input);
	}
	private void createList(int input){

		List<List<Integer>> list = new LinkedList<>();
		
		if(input == 0){
		
			List<Integer> subList = new LinkedList<>();
			list.add(subList.add(1));
		}
		else if(input == 1){

			List<Integer> subList = new LinkedList<>();
			subList.add(1);
			subList.add(1);
			list.add(subList);
		}
		else{

			for(int i = 2;i<input;i++){

				List<Integer> subList = new LinkedList<>();
				for(int j = 0;j<i;++i){

					if(j == 0){

						subList.add(list.get(i-1).get(0));
					}
					else {

						subList.add(list.get(i-1).get(j) + list.get(i-1).get(j-1));
						if(j -1 == i){
	
							subList.add(1);
						}
					}					
				}
				list.add(subList);
			}
		}
		System.out.println(list.toString());
	}
}