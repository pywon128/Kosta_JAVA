// 프로그램 실행시에 두 개의 정수를 전달받아 나누기한 결과를 출력
// Java Calc 4 2

class  Calc
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int div = a/b;
			System.out.println("나누기 결과 : "+div);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("나누기할 두 수를 전달 해주세요.");
		}catch(NumberFormatException e ){
			System.out.println("나누기할 두 수를 전달 해주세엽.");
		}catch(ArithmeticException e ){
			System.out.println("나누기할 두 수를 전달 해주세욥.");
		}
	}
}
