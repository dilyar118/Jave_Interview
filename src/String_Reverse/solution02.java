package String_Reverse;

public class solution02 {

	public static void main(String[] args) {

		
		System.out.println(Reverse("hello"));
	}

	public  static String  Reverse(String str) {

		return new StringBuffer(str).reverse().toString();

		}
	
}
