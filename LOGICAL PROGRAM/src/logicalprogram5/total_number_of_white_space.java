package logicalprogram5;

public class total_number_of_white_space {
	public static void main(String[] args) {
		String s="ac as ed d ede jendj ndkj jkdnwn xjn xkd kwn xk xk vgf fvf ";
		int count =0;
		for(int i=0;i<=s.length()-1;i++) {
			char ch = s.charAt(i);
			
			if(ch==' ') {
				
				count++;
			}
		}System.out.println("number of white space  :"+count);
	}

}
