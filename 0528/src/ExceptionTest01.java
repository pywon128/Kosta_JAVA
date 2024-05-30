class  ExceptionTest01{

	public static void calcDiv(int a, int b) throws ArithmeticException {
		int r = a/b;
		System.out.println("나누기 결과 : "+r);
/* 		try{
			int r = a/b;
			System.out.println("나누기 결과 : "+r);
		}catch(Exception e){
			System.out.println("나누기할 두 수를 확인하세요");
		} */
	}

	public static void main(String[] args) 
	{
		try{
			calcDiv(4,2);
			calcDiv(4,0);
		}
		catch (ArithmeticException e){
			System.out.println("예외발생 : "+e);
			// e = >  java.lang.ArithmeticException: / by zero
			// e.getMessage() => by zero
		}
	}
}
