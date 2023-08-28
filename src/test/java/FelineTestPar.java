import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class FelineTestPar {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    private final int kittensCount;
    private final int kittensCountActual;
    public FelineTestPar(int kittensCount, int kittensCountActual) {
        this.kittensCount = kittensCount;
        this.kittensCountActual = kittensCountActual;
    }

    @Parameterized.Parameters(name = "Количество котят. Тестовые данные: {0} {1}")
        public static Object[][] getKittens() {
        return new Object[][]{
                {1, 1},
                {5, 5},
                {100, 100},
                {30, 30},
                {0, 0},
        };
    }

    @Spy
    Feline feline;
    @Test
    public void testGetKittens() {
        int expected = feline.getKittens(kittensCount);
        assertEquals(expected,kittensCountActual);
    }

}
