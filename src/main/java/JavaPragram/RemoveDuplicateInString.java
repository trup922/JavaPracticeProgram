package JavaPragram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicateInString {

	public static void main(String[] args) {
        String str="Priyanka Tushar Pratyush";
        int n=str.length();
        char c[]= str.toCharArray();
        Map<Character , Integer> map=new HashMap<Character, Integer>();
        for(char ch:c) {
        	if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
        	}
        	else {
        		map.put(ch, 1);
        	}
        	
        }
		
		//System.out.println(map);
		
		for(Map.Entry<Character,Integer> entry: map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey() + entry.getValue());
			}
			
		}
	}

}
