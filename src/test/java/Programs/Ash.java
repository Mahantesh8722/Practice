package Programs;

public class Ash {

	public static void main(String[] args) {
		
		String s = "gadag";
		String rev="";
		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s.equals(rev)) {
			System.out.println(rev);
		}
		else {
			System.out.println(s);
		}
	}
}
