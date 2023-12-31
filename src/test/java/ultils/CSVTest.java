package ultils;

import currencyConverter.ultils.CSV;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class CSVTest {
    CSV csv;

    @BeforeEach
    public void init() throws IOException {
        this.csv = new CSV("Book1.csv");
    }

    @Test
    public void constructTest(){
        assertNotNull(this.csv);
        assertThrows(NullPointerException.class,()->new CSV(null));
        assertThrows(FileNotFoundException.class,()->new CSV("SOFT2412isMagic.tmd"));
    }
    @Test
    public void indexOfTest(){
        assertEquals(0,this.csv.indexOf("AUD"));
        assertEquals(-1,this.csv.indexOf("asdasd"));
    }

    @Test
    public void ReadCSVTest() throws IOException {
        assertNotNull(this.csv.outputDataset("Book1.csv"));
        assertThrows(NullPointerException.class,()->this.csv.outputDataset(null));
        assertThrows(FileNotFoundException.class,()->this.csv.outputDataset("SOFT2412isMagic.tmd"));
    }
}
