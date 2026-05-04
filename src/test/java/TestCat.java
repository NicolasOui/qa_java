import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {

    @Mock
    Feline feline;

    @Test
    public void CatGetSound() {
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodReturnsCorrectList() throws Exception {
        List<String> FoodForCat = List.of("Зебра", "Барсук");
        Mockito.when(feline.eatMeat()).thenReturn(FoodForCat);
        Cat cat = new Cat(feline);
        assertEquals(FoodForCat, cat.getFood());
    }

    @Test
    public void getFoodCallsFelineEatMeat() throws Exception {
        List<String> FoodForCat = List.of("Зебра", "Барсук");
        Mockito.when(feline.eatMeat()).thenReturn(FoodForCat);
        Cat cat = new Cat(feline);
        Mockito.verify(feline).eatMeat();
}







