package stringbuffer2;
import java.util.Scanner;
public class stringbuffer2 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String str =scan.nextLine();
			StringBuffer sb = new StringBuffer(str);
			int str_len = sb.length();
			for(int i=0;i<str_len;i++)
			{
				char ch = sb.charAt(i);
				if(ch >= 'a' && ch <= 'z')
				{
					int offset =ch -'a';
					ch=(char) ('A' + offset);
					
				}
				else if(ch>='A' && ch<='Z')
				{
					int offset = ch-'A';
					ch = (char) ('a'+ offset);
				}
				sb.setCharAt(i, ch);
			}
				System.out.println(sb);
		}
	}

}