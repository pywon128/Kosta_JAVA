class D23ForTest {
	public static void main(String[] args) {
		for (int i=1; i<=3; i++ ){
			System.out.println("Hello!");
		}
		System.out.println(i);
	}
}
/*
 error: cannot find symbol
                System.out.println(i);
                                   ^
  symbol:   variable i
  location: class D23ForTest
1 error
error: compilation failed
*/