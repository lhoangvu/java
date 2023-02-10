package g08;
import java.lang.Math;
public class v06 {
	public static void ptbac2(float a,float b,float c) {	
		double s=b*b-4*a*c;
		double x1,x2;
		if(s>0) {
			x1=(-b+Math.sqrt(s))/(2*a);
			x2=(-b-Math.sqrt(s))/(2*a);
			System.out.print("nghiem cua phuong trinh bac 2 la:"+ x1+" "+x2);
		}
		else if(s==0) {
			x1=x2=-b/(2*a);
			System.out.print("phuong trinh co nghiem kep"+x1);
		}
		else {
			System.out.print("phuong trinh vo nghiem");
		}
	}
	public static long giaithua(int n) {
		long gt=1;
		if(n==0 ||n==1) {
			return gt;
		}
		else {
			for(int i=2;i<=n;i++) {
				gt *=i;
			}
			return gt;
		}
		}
	public static int fibo(int n) {
		if (n == 0 || n == 1) {
			return n;
		} 
		else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}
	public static int ucln(int a1, int b1) {
		if (b1 == 0) {
			return a1;
		} 
		else {
		int n = a1 % b1;
		return ucln(b1, n);
	}
		
}
	public static int bcnn(int a1,int b1) {
		return a1*b1/ucln(a1,b1);

		}
	public static boolean snt(int n) {
		if(n<2)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}
	public static void lksnt(int n) {
		for(int i=1;i<n;i++) {
			if(snt(i)) {
				System.out.print("\n"+i);
			}
		}
	}
	
				public static void snt1(int n ) {
					int  tmp=0;
					int  count=0;
					while(count<n) {
						if(v06.snt(tmp)) {
								System.out.print(tmp + " ");
								count++;
						}
						tmp++;
					}
				}
				public static void snt2(int n) {
					for(int i=10000;i<=99999;i++) {
						if(v06.snt(i)) {
							System.out.print(i+" ");
						}
					}
				}
				public static int tongchuso(int n) {
					int sum=0;
					while (n!=0) {
						sum+=n%10;
						n=n/10;
					}
					return sum;
				}
				public static boolean checkfibo(int n) {
					if(n==0 || n==1) 
						return true;
					int f1=1,f2=0,f;
					for(int i=3;i<99;i++) {
						f=f1+f2;
						if(f==n)
							return true;
						f2=f1;
						f1=f;
					}
					
					return false;
				}
				public static void lkfibo(int n) {
					System.out.print("so nguyen to và fibo nho hon n:	 ");
					for(int i=0;i<n;i++) {
						if(v06.checkfibo(i) && v06.snt(i)) {
							System.out.print(i+" ");
							
						}
			
	
			}
				
		}
	}
		
		
	

