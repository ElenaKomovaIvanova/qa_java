import com.example.Animal;
import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;


import static org.junit.Assert.*;
import static org.mockito.internal.util.StringUtil.join;


public class LionTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    Feline feline;
    Lion lion;
    boolean hasMane;

    String sex;

    @Test
    public void testHasManeTrue() throws Exception {
        sex = "Самец";
        Lion lion = new Lion(sex);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void testHasManeFalse() throws Exception {
        sex = "Самка";
        Lion lion = new Lion(sex);
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void testHasManeException() throws Exception {
        Exception thrown = assertThrows(Exception.class, () -> new Lion("Исключение"));
    }

    @Test
    public void testHasManeExceptionText() throws Exception {
        assertThrows(Exception.class, () -> new Lion("Исключение")).getMessage().
                equals("Используйте допустимые значения пола животного - самей или самка");

    }

}
