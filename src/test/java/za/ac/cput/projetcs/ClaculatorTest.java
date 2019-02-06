package za.ac.cput.projetcs;

import org.junit.Assert;
import org.junit.Test;

public class ClaculatorTest {
    @Test
    public void calculate(){
        Calculator calc = new Calculator();

        Assert.assertEquals(10,calc.add(5,5));

    }
}
