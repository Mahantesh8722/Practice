package Programs;

public class Largest {

	public static void main(String[] args) {
//		int[]a= {1,0,2,3,5,999};
//		int b= a[0];
//		for(int i=0; i<a.length;i++) {
//			if(a[i]>b) {
//				b=a[i];
//			}
//		}
//		System.out.println(b+" is the largest number in the given array");
		
		double[] a= {1,0.999,21,3.1,99.0};
		double sum=0;
		for(int i=0; i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum of the given numbers in an array is "+sum);
	}
}
