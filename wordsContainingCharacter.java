package array;

public class wordsContainingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String [] words = {"leet","code"};
			char x ='e';
			int ans = answer(words,x);
	}

	private static int answer(String[] words,char x) {
		// TODO Auto-generated method stub
		int ans = 0;
		for(int i=0;i<words.length;i++) {
			if(words[i].contains(x)) {
				ans = ans+1;}
		return ans;
	}

}}
