
public class StringCompression {
	public static String Compress(String str) {
		
		// O(n)
		char[] s = str.toCharArray();
		char[] sc = new char[s.length]; // no need for a longer char array
		char c = s[0];
		int index = 0;
		int count = 0;
		for(int i=0; i<s.length; i++) {
			if(index > s.length-1) {
				return str;
			}
			if(s[i]==c) {
				count ++;
			}
			
			else {
				sc[index++] = c;
				sc[index++] = (char)('0'+ count); 
				count = 1;
				c = s[i];}
			
		}
		sc[index++] = c;
		sc[index] = (char)('0'+ count); 
		return new String(sc);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaaaaaaa";
		System.out.println(Compress(str));

	}

}
