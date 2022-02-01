package array;
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		int size,key;
		try (Scanner sc = new Scanner(System.in)) {
			size=sc.nextInt();
			int arr[]=new int[size];
			for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
			key=sc.nextInt();
			for(int i=0;i<size;i++)
			if(arr[i]==key)
			System.out.println("Index value of "+ key + " is: "+ i);
		}

	}

}
