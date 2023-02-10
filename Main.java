package g08;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//1
		float a,b,c;
		System.out.println("Nhap a: ");
		a = in.nextFloat();
		System.out.println("Nhap b: ");
		b = in.nextFloat();
		System.out.println("Nhap c: ");
		c = in.nextFloat();
		v06.ptbac2(a, b, c);
		//2
		System.out.println("\nNhap gt: ");
		int gt = in.nextInt();
		System.out.printf("\nGiai thua cua %d: %d", gt, v06.giaithua(gt));
		//3
		System.out.println("\n nhap so fibo:	");
		int n=in.nextInt();
		System.out.printf("\n so fibo %d:	%d",n,v06.fibo(n));
		//4
		System.out.println("\nnhap a1: ");
		int a1=in.nextInt();
		System.out.println("\nnhap b1: ");
		int b1=in.nextInt();
		System.out.printf("\nUCLN %d %d:%d",a1,b1,v06.ucln(a1, b1));
		System.out.printf("\nUCLN %d %d:%d",a1,b1,v06.bcnn( a1, b1));
		//5
		System.out.println("\nnhap n: ");
		 n =in.nextInt();
		System.out.printf("\nso nguyen to nho hon %d :	",n);
		v06.lksnt(n);
		//6
		System.out.println("\nnhap n: ");
		 n =in.nextInt();
		System.out.printf("\nso nguyen to dau tien %d :	",n);
		v06.snt1(n);
		//7
		System.out.println("\nnhap n: ");
		n =in.nextInt();
		System.out.print("\nso co 5 chu so :	");
		v06.snt2(n);
		//8
		System.out.println("\nnhap n");
		n=in.nextInt();
		System.out.printf("\n tong cac chu so %d :%d ",n,v06.tongchuso(n));
		
		//10
		System.out.println("\n nhap n:");
		n=in.nextInt();
		v06.lkfibo(n);
		}
	
		
		    static boolean thuanNghich(int n){
		        int tn=n;
		        int trunggian=0;
		        while(n>0){
		            trunggian=trunggian*10+n%10;
		            n=n/10;
		        }
		        if(trunggian==tn)
		            return true;
		        else 
		            return false;
		    }
		    static void lietke(){
		        int dem=0;
		        for(int i=100000;i<=999999;i++){
		            if(thuanNghich(i)){
		                if(dem%10==0)
		                System.out.println(i);
		            }
		        }
		    
		    
		        lietke();
		
	}
}
