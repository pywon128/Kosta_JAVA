import java.util.Scanner;
class D08LastDateSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month, lastDate;
		System.out.print("월을 입력하세요 ==> ");
		month = sc.nextInt();

		if (month < 1 || month >12)
		{
			System.out.println("입력 오류");
			return;
		}

		switch (month){
		case 2 : lastDate = 28; break;
		case 4 :
		case 6 :
		case 9 :
		case 11 : lastDate = 30; break;
		default : lastDate = 31; break;
		}

		System.out.printf("%d월은 %d일까지 있어요", month, lastDate);
	}
}
