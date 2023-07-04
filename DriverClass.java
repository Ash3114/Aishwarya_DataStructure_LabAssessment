import java.util.Scanner;

public class DriverClass {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		
		int arraySize = sc.nextInt();
		int payArray[]=new int[arraySize];
		
		System.out.println("Enter the values of array");
		
		for(int i=0;i<arraySize; i++) {
			payArray[i]=sc.nextInt();
		}
		
		System.out.println("Enter the total number of targets to be achieved");
		
		int target = sc.nextInt();
		int count=0;
		
		while(target!=0) {
			boolean isAchieved = false;
			++count;
		
			long targetNew = 0;
			System.out.println("Enter the value of target");
			targetNew = sc.nextInt();
			
			long sum =0;
			for(int i=0;i<arraySize; i++) {
				sum+=payArray[i];
				
				if(sum>=targetNew) {
					System.out.println("Target is achieved after "+(i+1)+" transactions");
					isAchieved = true;
					break;
				}
				
			}
				if(!isAchieved) {
					System.out.println("Given target is not achieved");
					
					
				}
				
				--target;
			}
			
		}
	}

