package string;
import java.util.Scanner;
public class string {

	public static void main(String[] args) {
		 try (Scanner sc = new Scanner(System.in)) {
			String A=sc.next();
		    String B=sc.next();
		    System.out.println(A.length()+B.length());
		    if(A.compareTo(B)>0)
		    System.out.println("yes");
		    else
		    System.out.println("No");
		    System.out.println(A.substring(0,1).toUpperCase()+A.substring(1) + " "+ Character.toUpperCase(B.charAt(0))+B.substring(1));
		}
		}

	}


