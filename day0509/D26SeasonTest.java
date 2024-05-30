import java.util.Scanner;

class D26SeasonTest {
	public static void main(String[] args) 
	{
		int m, day;
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요 ==> ");
		m = sc.nextInt();

		if (m == 2)
		{
			day = 28;
		}else if (m <=7 && m%2==1 || m>=8 && m%2==0){
			day = 31;
		}else{
			day = 30;
		}

		System.out.println(m+"월은 "+day+"일 까지 있어요!");
	}
}

//else if (m == 1 && m==3 && m==5 && m==7 && m==8 &&m==10&&m==12)