import com.example.Animal;
import com.example.Feline;
import com.example.FelineInterface;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTesrMocF {
    @Spy
    Feline feline;
    Lion lion;

    @Before
    public void setLion() {
        lion = new Lion((FelineInterface) feline);

    }

    @Test
    public  void testgetKittens() {
        assertEquals(1,(lion.getKittens()));
    }

}
