import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class Tansactions {
	
	private void process() {
		Scanner sc = new Scanner(System.in);
		int size =readInput(sc, "Enter the size of transaction array", false).get(0);
		
	}
	
	public List<Integer> readInput(Scanner sc, String message, boolean Needed){
		List<Integer> inputList = new ArrayList<>();
		int value = sc.nextInt();
		
		for(int i=0; i<value; i++) {
			if(!Needed) {
				inputList.add(value);
				break;
			}
			inputList.add(sc.nextInt());
		}
		
		return inputList;
	}
	

}
