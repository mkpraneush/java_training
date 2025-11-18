package home_work;

public class Sec_Max {
	public static void main(String[] args) {
		int [] num= {10,11,9,8,12,1};
		/*int max=num[0];
		int cas=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		for(int i=0; i<num.length;i++) {
			if(num[i]<max&&num[i]>cas) {
				cas=num[i];
			}
		}
		System.out.println(cas);*/
		int max=0;
		int smax=0;
		if(num [0]>num[1]) {
			max=num[0];
			smax=num[1];
		}
		else {
			max=num[1];
			smax=num[0];
		}
		for(int i=2;i<num.length;i++) {
			if(num[i]>max) {
				smax=max;
				max=num[i];
			}
			else if(num[i]>smax&&num[i]!=max) {
				smax=num[i];
			}
	}
		System.out.println("1st max:"+max);
		System.out.println("2nd max:"+smax);

}}
