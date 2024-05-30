public class DiscountProduct extends Product{
    private int discountPrice;  // 할인된 가격
    private String discount;       // 할인율

    public DiscountProduct(String name, int price, String discount) {
        super(name, price);
        this.discount = discount.replaceAll("[^\\d]","");
    }
    public DiscountProduct() {
    }

    public String getDiscount() {
        return discount;
    }
    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @Override
    public int getPrice() {
        discountPrice = price-(price*Integer.parseInt(discount))/100;

        return discountPrice;
    }

    @Override
    public String toString() {
        return "DiscountProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
