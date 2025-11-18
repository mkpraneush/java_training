package methods;

public class Primeornot_meth {
	boolean prime(int a) {
		for (int i=2;i<=a/2;i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Primeornot_meth p =new Primeornot_meth();
		System.out.println(p.prime(13)?"Prime":"Not Prime");
		System.out.println(p.prime(19)?"Prime":"Not Prime");
	}
}
