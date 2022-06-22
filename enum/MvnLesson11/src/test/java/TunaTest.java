// IDE не даёт назвать класс "Test", поэтому "TunaTest". Но об этом писал еще Миша в чате.

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TunaTest {
    @Test
    void test() {
        Tuna tuna = new Tuna();
        int expected = 91;
        int actual = tuna.getNumberOfScales();
        Assertions.assertEquals(expected, actual);
    }
}