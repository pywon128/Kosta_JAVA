// 프로그램 실행시에 두개의 정수를 전달받아 더하기 한 결과를 출력
// java MainArgsTest 3 4
public class MainArgsTest {
    public static void main(String[] args){
		// int add = args[0] + args[1]; String 이라서 안됨
		int add = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);

		System.out.println("더하기 결과 : " + add);
    }
}
