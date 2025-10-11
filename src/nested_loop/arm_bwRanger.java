package nested_loop;

public class arm_bwRanger {
	public static void main(String[] args) {

		for(int num=1;num<=10000;num++) {
			int temp=num;
			int len=0;
			while(num!=0) {
				len++;
				num/=10;
			}
			num=temp;
			int sum=0;
			while(num!=0) {
				int last=num%10;
				int pow=1;
				for(int i=1;i<=len;i++) {
					pow=pow*last;
				}
				sum=sum+pow;
				num/=10;
			}
			if(sum==temp) {
				System.out.println(temp);
			}
			num=temp;
	}
	}}
