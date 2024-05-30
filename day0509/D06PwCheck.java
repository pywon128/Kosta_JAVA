import java.util.Scanner;

class  D06PwCheck
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String pw;
		String check = "asdf123";
		System.out.print("암호 : ");
		pw = sc.next();
		
		if (check.equals(pw))
		{
			System.out.println("확인 되었습니다.");
		}else{
			System.out.println("암호가 틀렸습니다.");
		}
	}
}
