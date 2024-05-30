///*
//사람(Person)
//	속성
//		이름	String
//		성별	String	"남자", "여자"
//		나이	int
//	동작
//		void eat(String food)
//		walk (String where)
// */
//
//class Person{
//    String name;
//    String gender;
//    int age;
//
//    public void eat(String food){
//        System.out.printf("%s %d살 %s이(가) %s를(을) 먹어요\n",
//                gender, age, name, food);
//    }
//    public void walk(String where){
//        System.out.printf("%s는 %s를(을) 걸어요.\n",name, where);
//    }
//}
//
//public class PersonTest {
//    public static void main(String[] args){
//        int data;
//        data = 2024;                // 기본자료형은 바로 값을 저장할 수 있다.
//        Person lee;
//        lee = new Person();         // 참조자료형은 객체를 생성하고 사용할 수 있다.
//        Person kim = new Person();  // 참조변수를 선언하면서 바로 생성할 수 있다.
//
//        lee.name = "ㅇ";
//        lee.gender = "남자";
//        lee.age = 28;
//
//        kim.name = "ㄱ";
//        kim.gender = "여자";
//        kim.age = 26;
//
//        lee.eat("비비빅");
//        lee.walk("청계천");
//
//        kim.eat("에이스");
//        kim.walk("광화문");
//    }
//}