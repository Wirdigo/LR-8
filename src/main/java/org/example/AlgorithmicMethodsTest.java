package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlgorithmicMethodsTest {
    AlgorithmicMethods algorithmicMethods = new AlgorithmicMethods();

    @Test
    void testFindMinPositiveElement() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(1, algorithmicMethods.findMinPositiveElement(array));

        int[] emptyArray = {};
        assertEquals(Integer.MAX_VALUE, algorithmicMethods.findMinPositiveElement(emptyArray));

        int[] negativeArray = {-1, -2, -3};
        assertEquals(Integer.MAX_VALUE, algorithmicMethods.findMinPositiveElement(negativeArray));
    }

    @Test
    public void testCalculateSumOfNegativeElements() {
        int[] array = {-1, -2, -3, 4, 5};
        assertEquals(-6, algorithmicMethods.calculateSumOfNegativeElements(array));

        int[] emptyArray = {};
        assertEquals(0, algorithmicMethods.calculateSumOfNegativeElements(emptyArray));

        int[] positiveArray = {1, 2, 3};
        assertEquals(0, algorithmicMethods.calculateSumOfNegativeElements(positiveArray));
    }

    @Test
    public void testFibonacci() {
        assertEquals(0, algorithmicMethods.fibonacci(0));
        assertEquals(1, algorithmicMethods.fibonacci(1));
        assertEquals(1, algorithmicMethods.fibonacci(2));
        assertEquals(2, algorithmicMethods.fibonacci(3));
        assertEquals(3, algorithmicMethods.fibonacci(4));
        assertEquals(5, algorithmicMethods.fibonacci(5));

        assertThrows(IllegalArgumentException.class, () -> algorithmicMethods.fibonacci(-1));
    }

    @Test
    public void testCalculateCurrentStrength() {
        assertEquals(2.0, algorithmicMethods.calculateCurrentStrength(2.0, 4.0), 0.01);
        assertEquals(0.5, algorithmicMethods.calculateCurrentStrength(4.0, 2.0), 0.01);

        assertThrows(ArithmeticException.class, () -> algorithmicMethods.calculateCurrentStrength(0.0, 2.0));
    }
}