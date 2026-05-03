import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TestLion {

    @Mock
    Feline feline;

    /*
    @Test
        public void ConstructorHaveManeIfMale() throws Exception {
        Lion lion = new Lion("Самец", feline);
        //assertEquals(true, lion.hasMane);
        assertTrue(lion.doesHaveMane());
    }
    */

    @Test(expected = Exception.class)
        //тест ошибки конструктора
        public void ConstructorExceptionOnInvalidSex() throws Exception {
        Lion lion = new Lion("Неизвестно кто", feline);
    }

    @Test
    public void getKittensReturnsNumber() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(3);

        assertEquals(3, lion.getKittens());
        Mockito.verify(feline).getKittens();
    }

    @Test
    public void doesHaveManeReturnsTrueForMale() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue("У самца должна быть грива", lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeReturnsFalseForFemale() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertFalse("У самки не должно быть гривы", lion.doesHaveMane());
    }

    @Test
    public void getFoodReturnsCoorectList() throws Exception {
        List<String> getFood = List.of("Зебра", "Антилопа");
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(getFood);
        assertEquals(getFood, lion.getFood());
    }
}