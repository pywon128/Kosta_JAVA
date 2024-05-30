import java.util.Scanner;

class  Programming5
{
	public static void main(String[] args) 
	{
		int lotto;
		int one = 2, two = 5, three = 7;
		String result = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("1~10 사이의 번호를 입력하세요 : ");
		lotto = sc.nextInt();
		if (lotto == one)
		{
			result = "1등 입니다.";
		}else if (lotto == two)
		{
			result = "2등 입니다.";
		}else if (lotto == three)
		{
			result = "3등 입니다.";
		}else{
			result = "낙첨입니다.";
		}
		System.out.println(result);

	}
}
