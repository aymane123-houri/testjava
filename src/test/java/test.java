import org.example.Main;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class test {

    @Test
    public void testAdd() {
        Main main = new Main();
        assertEquals(5, main.add(3, 3), "2 + 3 devrait être égal à 5");
    }

    }



