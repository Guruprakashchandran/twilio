import java.util.*;

public class SubsetViews{

	public void eastSideSunsetView(int[] a){

		int max = 0;
		List<Integer> list = new LinkedList<>();
		for(int i = a.length;i>=0;--i){
	
			if(max<a[i]){
				max = a[i];
				list.add(i);
			}		
		}
	}
	public void westSideSunsetView(int[] a){

		int max = 0;
		List<Integer> list = new LinkedList<>();
		for(int i = 0;i<a.length;++i){
	
			if(max<a[i]){
				max = a[i];
				list.add(i);
			}		
		}
	}
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int[] a = new int[length];
		String direction = scan.next();
		if(direction == "EAST"){

			new SubsetViews().eastSideSunsetView(a);
		}
		else{

			new SunsetViews().westSideSunsetView(a);	
		}
	}
}