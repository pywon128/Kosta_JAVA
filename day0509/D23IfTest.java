
class  D23IfTest {
	public static void main(String[] args) 
	{
		int n = 5;
		System.out.println("a");
		System.out.println("b");
		if (n>0){
			System.out.println("c");
			System.out.println("d");
		}
		else{
			System.out.println("e");
			System.out.println("f");
		}
			
		System.out.println("g");
		System.out.println("h");
	}
}
/*
D22IfTest.java:11: error: 'else' without 'if'
                else
                ^
1 error
error: compilation failed
*/