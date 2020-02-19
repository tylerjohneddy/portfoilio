import java.util.ArrayList;
import java.util.List;

public class Anagram {
	public static boolean anagram(String a, String b) {
      char[] achars =   a.replace(" ", "").toCharArray();
      char[] bchars =   b.replace(" ", "").toCharArray();
      List<Character> aList =new ArrayList<>();
      List<Character> bList =new ArrayList<>();
      
      for (char c : achars) {
    	  aList.add(c);
    	  
      }
      for(char c : bchars) {
    	  bList.add(c);
      }
      bList.sort(null);
    		  aList.sort(null);
		return aList.equals(bList);
		
	}
	public static void main(String[] args) {
		System.out.println(anagram("helloworld", "hello world"));
	}

}
