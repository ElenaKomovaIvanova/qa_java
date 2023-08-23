import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

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
        feline.getFamily().equals("Кошачьи");
     }


    @Test
    public void testeatMeat() throws Exception {
        String food = join(feline.eatMeat(),",");
        food.equals("Животные, Птицы, Рыба");
     }

     @Test
    public void testGetKittens() {
        "1".equals(feline.getKittens());
     }


    }




