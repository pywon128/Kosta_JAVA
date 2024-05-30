public class DiscountProductTest {
    public static void main(String[] args) {
        Product p = new DiscountProduct("비비빅", 1000, "10%");

        System.out.println(p);
        System.out.println(p.getPrice());

//        String a = "15%";
//        String b = a.replaceAll("[^\\d]","");
//        System.out.println(b);
    }
}
