package Programs;

public class PrimeNumber {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,7,23,22};
		for (int i = 0; i < a.length; i++) {
			int c=0;
			for (int j = 2; j <a[i]; j++) {
				if(a[i]%j==0) {
					c=1;
					break;
				}
				}
			if(c==0) {
				System.out.println(a[i]+" is not a prime number");
			}
			else {
				System.out.println(a[i]+ " is a prime number");
			}
		}
	}
}
