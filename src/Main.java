public class Main
{

    public static void main(String[] args)
    {
        boolean freeShipping;
        double itemPrice;
        double shippingCost;
        double totalPrice;
        itemPrice = 69;

        if  (itemPrice >= 100)
        {
            freeShipping = true;
            System.out.println("You get free shipping!");
        }
        else
        {
            shippingCost = itemPrice * .02;
            totalPrice = itemPrice + shippingCost;
            System.out.println("The Cost of shipping is " + shippingCost + " and the total price is " + totalPrice + ".");
        }

    }
}
