package JavaPragram;

public class PalidromeNumber {

	public static void main(String[] args) {
      
		int a;
		int b,c=0;
		int n=121;
		 a=n;
		 while (a>0) {
			 b=a%10;
			 c=(c*10)+b;
			 a=a/10;
			 System.out.println(c);
			 
			 
		 }
		
	if(c==n) {
		System.out.println("palidrome");
		
		
	}else {
		System.out.println("non palidrome");
	}
	}

}