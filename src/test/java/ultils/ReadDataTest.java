package ultils;

import currencyConverter.ultils.ReadDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class ReadDataTest {
    private ReadDate readDate;
    @BeforeEach
    public void init(){
        this.readDate = new ReadDate();
    }

    @Test
    public void constructorTest(){
        assertNotNull(this.readDate);
    }
    
    @Test
    public void readCSVTest() throws IOException {
        assertDoesNotThrow(()->this.readDate.getDate("Book1.csv"));
        assertEquals("30/09/2022",this.readDate.getDate("Book1.csv"));
        assertEquals("Get date failed",this.readDate.getDate("Book2.csv"));

    }
    @Test
    public void convertDateTest(){
        assertEquals("14/09/2022",this.readDate.convertDate("2022-09-14"));
    }
}
