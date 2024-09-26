import java.util.HashSet;
import java.util.Set;

public class RepeatedChar{
	
	public static void main(String args[]){
		Set<Character> duplicates = new HashSet<>();
		Set<Character> seen = new HashSet<>();
		String input = "programming";
		
		for(char ch : input.toCharArray()){
			if(!seen.add(ch)){
				duplicates.add(ch);
			}
		}
		
		System.out.println(duplicates);
	}
}