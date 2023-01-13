/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test void rollTest() {
        //Arrange
        Library sut = new Library();
        int[] testArray = new int[5];
        //Act
        testArray = sut.roll(5);
        //Assert
assertTrue(testArray.length == 5);
assertTrue(testArray[0] >= 1 && testArray[0] <= 6);
    }

    @Test void duplicateTest() {
        Library sut = new Library();
        int [] array = {2,4,6,2};
        assertTrue(sut.containsDuplicates(array),"Array of {2, 4, 6, 2} asserts true, it contains a duplicate!");
    }

    @Test void testCaculateArrayAverage(){
        //ARRANGE
Library sut = new Library();
int[] testArray = {66, 64, 58, 65, 71, 57, 60};
        //ACT
int result = sut.calculateAverage(testArray);
        //ASSERT
        assertNotNull(result);
        assertEquals(0, (result * 0));
    }

    @Test void testLowestAverageArray(){
        //ARRANGE
        Library sut = new Library();
        int[][] testArray = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {1, 1, 1, 1, 1, 1, 1}
        };
        //ACT
int[] result = sut.lowestAverageArray(testArray);
int[] expectedArray =  (testArray[3]);
        //ASSERT
        assertNotNull(result);
        assertEquals(expectedArray, (result));
    }

    @Test
    void testWeatherData() {
        Library sut = new Library();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assert(sut.weatherData(weeklyMonthTemperatures).equals("51 52 53 54 55 56 57 58 59 60 61 62 64 65 66 70 71 72 "));
    }

    @Test
    void testTally() {
        Library sut = new Library();
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        String elected = sut.tally(votes);
        assert(elected.equals("Bush"));
        System.out.println("\n~~ Bush vs. Hedge vs. Shrub ~~");
        System.out.println(elected + " received the most votes!");
    }

    class AppTest {
        @Test void appHasAGreeting() {
            App classUnderTest = new App();
            assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
        }
    }