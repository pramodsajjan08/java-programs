package twentyfivepatterns;

public class Pattern3 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<5;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
