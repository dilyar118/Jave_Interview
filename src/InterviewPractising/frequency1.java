package InterviewPractising;

public class frequency1 {
	
	
	
	public static String frequncy(String str) {
		
		
		String dup = "";
		
		for(int i = 0; i < str.length(); i++) {
			
			if(!dup.contains(""+str.charAt(i))) {
				dup += str.charAt(i);
			}	
			}
			
		String fre = "";
		
		for(int i = 0; i < dup.length(); i++) {
			int count = 0;
			
			for(int j = 0; j < str.length(); j++) {
				
				if(dup.charAt(i) == (str.charAt(j))) {
				
				count++;
			}
			}
			fre+= dup.charAt(i) + "" + count;
		}
		
		
		
		
		return fre;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(frequncy("aabbbc"));
	}

}
