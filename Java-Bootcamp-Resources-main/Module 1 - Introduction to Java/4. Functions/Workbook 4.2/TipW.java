public class Tip {

    public static void main(String[] args) {
        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Thank you!");
        tipTheWaiter(100);
    }
    
    public static void tipTheWaiter(double bill){
        double calculateTip = bill * 15/100;
        System.out.println("Your service was wonderful! Please, accept this tip: $" + calculateTip);
    }
}