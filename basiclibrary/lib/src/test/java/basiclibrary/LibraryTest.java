/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class LibraryTest {
    @Test void testRoll() {
        //Arrange
    Library sut = new Library();
    int[] testsArray = {};

    // Act
        testsArray = sut.roll(5);

        // Assert
        // assert that there are 5 things in my array
    assertTrue(testsArray.length == 5);
    // assert that each value is between 1 and 6
    }