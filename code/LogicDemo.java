public class LogicDemo{
	public static void main(String[] args){
		double d1 = Math.random();
		int m = (int)(d1 * 10)+1;
		double d2 = Math.random();
		int n = (int)(d2 * 10)+1;
		System.out.println(m);
		System.out.println(n);
		boolean b1 = m>n && m%2==0;
		boolean b2 = m>n || m%2==0;
		System.out.println(b1);
		System.out.println(b2);
	}
}