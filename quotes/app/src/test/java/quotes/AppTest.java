package quotes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;

class AppTest {

    @Test void testingQuotesConstructor(){
        // Arrange
        // Act
        Quotes testQuotes = new Quotes("Charles Dickens", "Ask no questions, and you'll be told no lies.");
        // Assert
        assertEquals("Ask no questions, and you'll be told no lies.", testQuotes.getText());
        assertEquals("Charles Dickens", testQuotes.getAuthor());

    }
}