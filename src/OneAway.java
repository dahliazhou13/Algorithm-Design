
public class OneAway {
	public static boolean isOneAway(String a, String b) {
		String longer, shorter;
		if(a.length() >= b.length()) {
			longer = a;
			shorter = b;
		}
		else {
			longer = b;
			shorter = a;
		}
		if(longer.length()-shorter.length()>1)
			return false;
		int match = 0;
		int i,j = 0;
		for(i=0; i<shorter.length(); i++) {
			if(shorter.charAt(i)==longer.charAt(j)) {
				j++;
				match ++;
			}
			else if(shorter.charAt(i)==longer.charAt(j+1)) {
				j+=2;
				match ++;
			}
		}
		if(match >=longer.length()-1) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "djlskajdlsjaldaljdlkasd";
		String b = "djlskajdlsjaldaljdlkmsd";
		System.out.println(isOneAway(a,b));
	}

}
