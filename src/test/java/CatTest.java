
import com.example.Cat;
import com.example.Feline;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertSame;
import static org.mockito.internal.util.StringUtil.join;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Spy
    Feline feline;
    Cat cat;

    @Before
    public void setCat() {
        cat = new Cat(feline);

    }



    @Test
    public void testsSound()  {
        String sound = cat.getSound();
            }

    @Test
    public void getFoodSize() throws Exception {
        assertSame(3, cat.getFood().size());
    }

    @Test
    public void getFoodList() throws Exception {
        String food = join(cat.getFood(),",");
        food.equals("Животные, Птицы, Рыба");
    }

    @Test
    public void getFoodOk() throws  Exception {
        cat.getFood();
        Mockito.verify(feline,Mockito.times(1)).eatMeat();
    }
}

