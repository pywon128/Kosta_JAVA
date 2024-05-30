import java.util.Scanner;

class  D27DigitToKor
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int input, num1, num2, num0;
		String number = "영일이삼사오육칠팔구십";
		
		System.out.print("0~99 까지 숫자 입력 : ");
		input = sc.nextInt();
		
		num0 = (input/10)*10;
		num1 = input/10;
		num2 = input%10;
		/*
		System.out.println(num0/2);
		System.out.println(number.charAt(10));
		*/
		
		if (input < 10){
			System.out.println(number.charAt(num2));
		}else if(input>=10 ||input <= 19){
			System.out.printf("%s%s",number.charAt(num0),number.charAt(num2));
		}else if(input>=20 || input <= 29){
			System.out.printf("%s%s",number.charAt(0),number.charAt(1));
			//System.out.printf("%s%s%s",number.charAt(2),number.charAt(10),number.charAt(0));
		}

	}
}