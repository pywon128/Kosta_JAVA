package exam01;

public class IndexOfAndContainsTest {
    public static void main(String[] args) {
        String data = "Hello Java";
//        if (data.indexOf("Java") != -1){
                    // indexOf : true = 인덱스값, false = -1 리턴
//            System.out.println("Java를 포함");
//        }else {
//            System.out.println("자바를 포함하지 않음");
//        }

//        if (data.contains("Java")){
//            System.out.println("Java를 포함");
//        }else {
//            System.out.println("자바를 포함하지 않음");
//        }

        if (data.matches(".*Java.*")){
                            // 정규형을 써야함
            System.out.println("자바를 포함");
        } else {
            System.out.println("자바를 포함하지 않음");
        }

    }
}
