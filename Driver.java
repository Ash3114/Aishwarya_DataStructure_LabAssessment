import java.util.Scanner;

public class Driver {
	
	public static void main(String args[]) {
		
		MergeSort mergeSort = new MergeSort();
		DenominationsCount dc = new DenominationsCount();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations");
		
		int totalDenominations = sc.nextInt();
		System.out.println("Enter the currency denomination value");
		
		int[] notes = new int[totalDenominations];
		for(int i=0; i<totalDenominations; i++) {
			notes[i]=sc.nextInt();
			
		}
		
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSort.sort(notes,0,notes.length-1);
		dc.NotesImplementation(notes, amount);
		
	}

}
