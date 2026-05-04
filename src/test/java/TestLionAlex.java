import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.NotExtensible;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class TestLionAlex {

    @Mock
    Feline feline;

    @Test
    public void getAlexFriendsList() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals(List.of("Марти", "Глория", "Мелман"), lionAlex.getFriends());
    }

    @Test
    public void getPlaceofLivingAlex() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }

    @Test
    public void getKittensCount() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals(0, lionAlex.getKittens());
    }

    @Test
    public void doesHaveManeAlex() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        assertTrue(lionAlex.doesHaveMane());
    }

    @Test
    public void getFoodForAlex() throws Exception {
        List<String> lionFood = List.of("Зебра", "Бегемот");
        Mockito.when(feline.getFood("Хищник")).thenReturn(lionFood);
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals(lionFood, lionAlex.getFood());
    }
}

