import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestFeline {

    @Test
    public void ReciveListToEatMeat() throws Exception {
        List<String> foodForCat = List.of("Животные", "Птицы", "Рыба");
        Feline feline = new Feline();
        assertEquals(foodForCat, feline.eatMeat());
    }

    @Test
    public void getFamilyReturnsCatsFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void ReceiveNumberKittensStrongNumber() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void ReceiveNumberKittensFreeNumbers() {
        Feline feline = new Feline();
        assertEquals(5, feline.getKittens(5));
    }
}



