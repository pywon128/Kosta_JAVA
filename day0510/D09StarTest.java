import java.util.Scanner;
class D09StarTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, result="";
		int mon, day, lastDate=31;

		System.out.print("이름을 입력하세요 ==> ");
		name = sc.next();
		System.out.print("몇월에 태어 났나요 ==> ");
		mon = sc.nextInt();
		System.out.print("몇월에 태어 났나요 ==> ");
		day = sc.nextInt();
		
		if (mon < 1 || mon > 12)
		{
			System.out.println("입력오류");
			return;
		}
		switch (mon){
			case 2 : lastDate = 28; break;
			case 4 :
			case 6 :
			case 9 :
			case 11 : lastDate = 30; break;
		}

		if (day < 1 || day > lastDate)
		{
			System.out.println("입력오류");
			return;
		}
		
		switch (mon)
		{
			case 1: if (day <= 19 ) { result = "염소자리";}else {result = "물병자리";}break;
			case 2: if (day <= 18 ) { result = "물병자리";}else {result = "물고기자리";}break;
			case 3: if (day <= 20 ) { result = "물고기자리";}else {result = "양자리";}break;
			case 4: if (day <= 19 ) { result = "양자리";}else {result = "황소자리";}break;
			case 5: if (day <= 20) { result = "황소자리";}else {result = "쌍둥이자리";}break;
			case 6: if (day <= 21 ) { result = "쌍둥이자리";}else {result = "게자리";}break;
			case 7: if (day <= 22 ) { result = "게자리";}else {result = "사자자리";}break;
			case 8: if (day <= 22 ) { result = "사자자리";}else {result = "처녀자리";}break;
			case 9: if (day <= 23 ) { result = "처녀자리";}else {result = "천칭자리";}break;
			case 10: if (day <= 22 ) { result = "천칭자리";}else {result = "전갈자리";}break;
			case 11: if (day <= 22 ) { result = "전갈자리";}else {result = "사수자리";}break;
			case 12: if (day <= 24 ) { result = "사수자리";}else {result = "염소자리";}break;
		}
		System.out.printf("%s님은 %s 입니다.",name,result);

	}
}
