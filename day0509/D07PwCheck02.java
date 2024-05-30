import java.util.Scanner;

class  D07PwCheck02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String pw;
		String check;
		System.out.print("암호 : ");
		pw = sc.next();
		System.out.print("암호 확인 : ");
		check = sc.next();
		
		if (pw.equals(check) && pw.length()>=8)
		{
			System.out.println("확인 되었습니다.");
		}else{
			System.out.println("암호가 틀렸거나 8자리 이하입니다.");
		}
	}
}
