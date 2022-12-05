package Services.Donation;


import Order_and_payment.Order;

import java.util.Scanner;

public class NGO_Donation_Service extends Donation_Service{

    public  NGO_Donation_Service(Order current_order)
    {
        start_service_logic( current_order);
    }

    @Override
    public void start_service_logic(Order current_order) {
        Scanner sc=new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("Enter your donation amount: ");
        total_fees=sc.nextLong();
        System.out.println("Thank you for donating to NGO.");
        System.out.println();

        current_order.total_fees=this.total_fees;
        current_order.service_name="NGO donation";
        current_order.service_type="Donation";
    }
}
