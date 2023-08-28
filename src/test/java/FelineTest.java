import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.internal.util.StringUtil.join;

@RunWith(MockitoJUnitRunner.class)

public class FelineTest {

    Feline feline;
    @Before
    public void setFeline() {
        feline = new Feline();
    }
    @Test
    public void tesGetFamily() {
        assertEquals("Кошачьи",feline.getFamily());
    }

    @Test
    public void testeatMeat() throws Exception {
        String food = String.join(", ", feline.eatMeat());
        assertEquals("Животные, Птицы, Рыба", food);
     }

     @Test
    public void testGetKittens() {
         assertEquals(1,(feline.getKittens()));
     }

}




