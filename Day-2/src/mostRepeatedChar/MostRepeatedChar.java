package mostRepeatedChar;
import java.util.*;

public class MostRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> m=new HashMap<Character,Integer>();
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			Integer freq = m.get(ch);
			if(m.containsKey(ch))
				m.put(ch, m.get(ch) + 1);
			else
				m.put(ch, 1);
		}
		
		int freq=0;
		char ch='#';
		// ITERATING OVER MAP
		for (Map.Entry entry : m.entrySet()) { 
            {
            	int tmpFreq=(int)entry.getValue();
            	if(tmpFreq >= freq)
            	{
            		freq=tmpFreq;
            		ch=(char)entry.getKey();
            	}
//            	System.out.println(entry.getKey() + " " + entry.getValue()); 
            }
        } 
		System.out.println("Most repeated character is: "+ch+" with frequency = "+freq);
		
	}

}
