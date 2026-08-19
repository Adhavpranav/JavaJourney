package CoreJava;

class Order {

    protected int orderId;
    protected String customerName;
    protected double amount;

    Order(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }

    protected void showOrder() {
        System.out.println("Order details:");
        System.out.println("Order Id: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Amount: " + amount);
    }

    public double calculateTotal() {
        return amount;
    }
}

class OnlineOrder extends Order {

    protected double deliveryCharge;

    OnlineOrder(int orderId, String customerName, double amount, double deliveryCharge) {
        super(orderId, customerName, amount);
        this.deliveryCharge = deliveryCharge;
    }

    @Override
    public double calculateTotal() {
        return amount + deliveryCharge;
    }
}

class RestaurantOrder extends OnlineOrder {

    protected String restaurantName;

    RestaurantOrder(int orderId, String customerName, double amount,
                    double deliveryCharge, String restaurantName) {

        super(orderId, customerName, amount, deliveryCharge);
        this.restaurantName = restaurantName;
    }

    @Override
    protected void showOrder() {
        super.showOrder();
        System.out.println("Restaurant Name: " + restaurantName);
    }

    protected void applyDiscount(double percent) {
        double discount = amount * percent / 100;
        amount = amount - discount;

        System.out.println("Discount: " + discount);
        System.out.println("Amount after discount: " + amount);
    }
}

interface Trackable {
    void trackOrder();
}

class LiveOrder extends RestaurantOrder implements Trackable {

    protected String status;

    LiveOrder(int orderId, String customerName, double amount,
              double deliveryCharge, String restaurantName, String status) {

        super(orderId, customerName, amount, deliveryCharge, restaurantName);
        this.status = status;
    }

    @Override
    public void trackOrder() {
        System.out.println("Order Status: " + status);
    }
}

public class FoodDeliveryInheritance {

    public static void main(String[] args) {

        LiveOrder liveOrder = new LiveOrder(
                1,
                "Pranav",
                1000,
                10,
                "SilverSpoon",
                "Out for Delivery"
        );

        liveOrder.showOrder();

        liveOrder.applyDiscount(10);

        System.out.println("Final Total: " + liveOrder.calculateTotal());

        liveOrder.trackOrder();
    }
}
