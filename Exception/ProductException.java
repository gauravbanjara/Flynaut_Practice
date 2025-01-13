package Exception;

public class ProductException {
    private int productId;
    private String productName;
    private long quantity;
    public ProductException(int productId, String productName, long quantity) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
    }
    public void addProduct(long newQuantity) throws IllegalArgumentException{
        try {
            if(newQuantity < 0) {
                throw new IllegalArgumentException("Quantity cannot be negative.");
            }
            this.quantity += newQuantity;
        }catch (IllegalArgumentException e){
            System.err.println("Exception : " + e.getMessage());
        }
    }
    public void Display(){
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + productName);
        System.out.println("Quantity: " + quantity);
    }
    public static void main(String[] args) {
        ProductException Iphone = new ProductException(23, "Iphone 16pro Max", 20);
        System.out.println("Details of Products before adding any new quantity");
        Iphone.Display();
        System.out.println("========================================================");

        Iphone.addProduct(-5);

        System.out.println("Details of Products after adding new quantity");
        Iphone.Display();
    }
}

