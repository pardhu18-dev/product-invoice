package com.example.invoice;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class InvoiceCalculatorTest {
    InvoiceCalculator invoice=new InvoiceCalculator();
    @Test
    void testProductAmount(){
        assertEquals(5000,invoice.CalculateProductAmount(2500,2));
    }
    @Test
    void testTenPercentDiscount(){
        assertEquals(500,invoice.CalculateDiscount(5000));
    }
    @Test
    void testFivePercentDiscount(){
        assertEquals(150,invoice.CalculateDiscount(3000));
    }
    @Test
    void testNoDiscount(){
        assertEquals(0,invoice.CalculateDiscount(1000));
    }
    @Test
    void testGST(){
        assertEquals(180,invoice.CalculateGST(1000));
    }
    @Test
    void testFinalAmount(){
        assertEquals(5310,invoice.CalculateFinalAmount(5000));
    }
}
