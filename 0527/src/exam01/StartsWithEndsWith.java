package exam01;

public class StartsWithEndsWith {
    public static void main(String[] args) {
        String data = "Hello Java";
        boolean flag1 = data.startsWith("Hello");
        boolean flag2 = data.endsWith("Java");
        boolean flag3 = data.startsWith("Oracle");

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
    }
}
