// 프로그램 실행시에 두 개의 정수를 전달받아 나누기한 결과를 출력
// Java Calc 4 2

class  Calc01
{
	public static void main(String[] args) {
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int div = a/b;
			System.out.println("나누기 결과 : "+div);
			//System.out.println("작업종료");
		} catch(Exception e){
			System.out.println("나누기할 두 수를 전달 해주세요.");
		}
// 		catch(ArithmeticException e){
//			System.out.println("0으로 나누기 할 수 없음");
//		} 	// Exception 이 이미 모든 예외상황을 처리하기 때문에 Arithmetic Exception 을 사용할 수 없음
				// 이와 같이 catch 절을 여러개 쓸 때에는 하위 예외가 뒤에 올 수 없다.
		finally {
			System.out.println("작업종료");
		}	// 정상작동 하거나 예외가 발생해도 반드시 실행시킬 명령어들

		
	}
}
