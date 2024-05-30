package exam01;

public class ValueOfTest {
    public static void main(String[] args) {
        int year = 2024;
        String data_year = String.valueOf(year);
        double height = 56.7;
        String data_double = String.valueOf(height);
        boolean flag = false;
        String data_boolean = String.valueOf(flag);
        char[] arr = {'h','e','l','l','o'};
        String data_char = String.valueOf(arr);

        System.out.println(data_year);
        System.out.println(data_double);
        System.out.println(data_boolean);
        System.out.println(data_char);


    }
}
