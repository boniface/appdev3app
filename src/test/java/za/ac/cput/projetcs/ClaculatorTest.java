package za.ac.cput.projetcs;

import org.junit.Assert;
import org.junit.Test;

public class ClaculatorTest {

    @Test
    public void calculate(){
        Calculator calc = new Calculator();

        Assert.assertEquals(10,calc.add(5,5));

    }
    @Test
    public void createOrderTest(){

        Order order = new Order
                .Builder()
                .cheese("yes")
                .chicken("yes")
                .id("1")
                .build();
        Assert.assertEquals("no", order.getCheese());


    }
}
