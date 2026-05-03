import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestLionParametrized {

    String sex;
    boolean result;

    @Mock //
    Feline feline;

    public TestLionParametrized(String sex, boolean result) {
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getLionInfo() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}

        };
    }


    @Test
    public void ConstructorHaveManeIfMale() throws Exception {
        MockitoAnnotations.openMocks(this);
        Lion lion = new Lion(sex, feline);
        assertEquals(result, lion.doesHaveMane());
    }
}

