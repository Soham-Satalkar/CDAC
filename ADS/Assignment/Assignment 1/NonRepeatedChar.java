import java.util.ArrayList;
import java.util.List;

public class NonRepeatedChar{
	
	public static void main(String args[]){
		List<Character> character = new ArrayList<>();
		List<Character> nonRepeated = new ArrayList<>();
		String input = "aabbcc";
		
		for(char ch : input.toCharArray()){
			if(!character.contains(ch)){
				character.add(ch);
				nonRepeated.add(ch);
			}
			else{
				nonRepeated.remove((Character) ch);
			}	
		}
		System.out.println(nonRepeated.get());
	}
}