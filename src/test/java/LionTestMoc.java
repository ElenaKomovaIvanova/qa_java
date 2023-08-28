import com.example.Animal;
import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.internal.util.StringUtil.join;
@RunWith(MockitoJUnitRunner.class)
public class LionTestMoc {
    @Spy
    Animal animal;
    Lion lion;

    @Before
    public void setLion() {
        lion = new Lion(animal);
    }

    @Test
    public void getFoodList() throws Exception {
        String food = String.join(", ", lion.getFood());
        assertEquals("Животные, Птицы, Рыба", food);
    }

    @Test
    public void getFoodOk() throws Exception {
        lion.getFood();
        Mockito.verify(animal, Mockito.times(1)).getFood("Хищник");
    }

}
