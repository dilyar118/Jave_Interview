package findTheJava_String;

public class solution {
	
	public static void main(String[] args) {
		
		String str = "java is fun. java is the best. java";
		
		int java = 0;
		
		for( int i = 0; i < str.length()-3; i++) {
			
			if(str.substring(i, i+4).equalsIgnoreCase("java")) {
				
				java++;
			}
		}
		
		System.out.println("Java is fount: " + java);
	}

}
