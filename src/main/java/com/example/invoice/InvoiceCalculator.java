package com.example.invoice;

public class InvoiceCalculator {
    public double CalculateProductAmount(double price,int quantity){
        return price*quantity;
    }
    public double CalculateDiscount(double amount){
        if(amount>=5000){
            return amount*0.10;
        }else if(amount>=2000){
            return amount*0.05;
        }
        return 0;
    }
    public double CalculateGST(double amount){
        return amount*0.18;
    }
    public double CalculateFinalAmount(double amount){
        double discount= CalculateDiscount(amount);
        double discountedAmount=amount-discount;
        double gst=CalculateGST(discountedAmount);
        return discountedAmount+gst;
    }
}
