package JavaPragram;

public class Palidromestring {

	public static void main(String[] args) {
		
		String str="ALLA";
		int length=str.length();
		String palidrome="";
		
		for(int i=length-1;i>=0;i-- ) {
			palidrome=str.charAt(i)+palidrome ;
		
		}
		
		System.out.println(palidrome);
		
		
		if(str.equals(palidrome)) {
			System.out.println("palidrome string");
		}
		else {
			
			System.out.println("non plidrome ");
		}
	} 


}
