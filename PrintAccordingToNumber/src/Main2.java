
public class Main2 {
	public void divisible_by_two(int n) {
		if (n > 100) {
			System.out.println("enter the number which is divisible by  2");
			for (int i = 0; i <= n; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				}

			}
		}
	}

	public void divisible_by_three(int n) {
		if (n > 100) {
			System.out.println("enter the number which is divisible by 3 ");
			for (int i = 0; i <= n; i++) {
				if (i % 3 == 0) {
					System.out.println(i);
				}

			}
		}
		

	}
	public void divisible_by_four(int n) {
		if (n > 100) {
			System.out.println("enter the number which is divisible by 4 ");
			for (int i = 0; i <= n; i++) {
				if (i % 4 == 0) {
					System.out.println(i);
				}

			}
		}
	}
	public void divisible_by_five(int n) {
		if (n > 100) {
			System.out.println("enter the number which is divisible by 5 ");
			for (int i = 0; i <= n; i++) {
				if (i % 5 == 0) {
					System.out.println(i);
				}

			}
		}
	}
	public void divisible_by2and5(int n) {
		if (n > 100) {
			System.out.println("enter the number which is divisible by  2 and 5");
			for (int i = 0; i <= n; i++) {
				if (i % 2 == 0 && i%5==0) {
					System.out.println(i);
				}

			}
		}
	}
	
	

}
