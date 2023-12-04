import com.calculate.ws.Calculator;
import com.calculate.ws.CalculatorSoap;
import org.junit.Assert;
import org.junit.Test;

public class testWebServices {

    @Test
    public void test_webservice_Add(){
        Calculator calc = new Calculator();
        CalculatorSoap webservicesoap = calc.getCalculatorSoap();
        Assert.assertEquals(10,webservicesoap.add(5,5));
    }

    @Test
    public void test_webservice_subtract(){
        Calculator calc = new Calculator();
        CalculatorSoap webservicesoap = calc.getCalculatorSoap();
        Assert.assertEquals(0,webservicesoap.subtract(5,5));
    }

    @Test
    public void test_webservice_multiply(){
        Calculator calc = new Calculator();
        CalculatorSoap webservicesoap = calc.getCalculatorSoap();
        Assert.assertEquals(25,webservicesoap.multiply(5,5));
    }

    @Test
    public void test_webservice_divide(){
        Calculator calc = new Calculator();
        CalculatorSoap webservicesoap = calc.getCalculatorSoap();
        Assert.assertEquals(1,webservicesoap.divide(5,5));
    }
}
