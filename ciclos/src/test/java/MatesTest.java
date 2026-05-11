import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.contornos.Mates;

public class MatesTest {
    @Test
    public void testDividir(){
        int resultado = Mates.dividirStatic(10, 2);
        assertEquals(5,resultado);
    }

    @Test 
    public void testMultiplicar(){
        int resultado = Mates.multiplicarStatic(10, 2);
        assertEquals(20,resultado);
    }
}
