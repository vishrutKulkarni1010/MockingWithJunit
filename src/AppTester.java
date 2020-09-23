import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

public class AppTester {
    @Mock
    CalculatorService calcService;

    @InjectMocks
    App app = new App();

    @Test
    public void testAdd(){
        when(calcService.add(20,20)).thenReturn(40);//this add is from external dependencies that is interface.

        int actual = app.addition(20,20); //this is add is from actual class
        int expected = 40;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testDiff(){
        when(calcService.diff(20,20)).thenReturn(0);//this add is from external dependencies that is interface.

        int actual = app.difference(20,20); //this is add is from actual class
        int expected = 0;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testMult(){
        when(calcService.mult(2,2)).thenReturn(4);//this add is from external dependencies that is interface.

        int actual = app.multiply(2,2); //this is add is from actual class
        int expected = 4;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testDiv(){
        when(calcService.div(20,20)).thenReturn(1);//this add is from external dependencies that is interface.

        int actual = app.division(20,20); //this is add is from actual class
        int expected = 1;
        Assert.assertEquals(expected,actual);
    }

}
