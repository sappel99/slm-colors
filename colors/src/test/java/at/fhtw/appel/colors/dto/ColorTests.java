package at.fhtw.appel.colors.dto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ColorTests {
    private final Message message = new Message();

    @Test
    void contextLoads() {
    }

    @Test
    void testInit() {
        assertEquals("", message.getMes());
    }

    @Test
    void testSettingColor() {
        message.setMes("green");
        assertEquals("green", message.getMes());
    }

    @Test
    void testGetComp() {
        assertEquals("green", message.getCompColor("red"));
    }
}
