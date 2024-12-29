
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner as = new Scanner(System.in);
		System.out.println("Enter array length : ");
		int n = as.nextInt();
		int[][] arr = new int[n][n];
		System.out.println("Enter element is array .....: ");
		for(int i = 0; i < n; i++){
		    for(int j = 0; j < n; j++){
		    arr[i][j] = as.nextInt();
		}
	}
	System.out.println("Displaying element matrix...");
	for(int i =0; i<arr.length; i++){
	    for(int j = 0; j < arr.length; j++){
	    System.out.println(arr[i][j]);
	}
	}
	int primarydaigonal = 0;
	int secondarydaigonal = 0;
	for(int i = 0; i < n; i++){
	    primarydaigonal += arr[i][i];
	    secondarydaigonal += arr[i][n-1-i];
	}
	int absolutedaigonalvalue = Math.abs(primarydaigonal-secondarydaigonal);
	System.out.println(absolutedaigonalvalue);
	}
}
