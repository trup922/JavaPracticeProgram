package JavaPragram;

public class ReverseString {

	public static void main(String[] args) {
		String str="Priya";
		int n =str.length();
		String rev="";
		 for(int i=n-1;i>=0;i--) {
			 rev=str.charAt(i)+rev;
			 System.out.println(rev);
		 }
		
	}

}
