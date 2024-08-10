package lab6;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUtilities {

    /*
     * Tests related to getMultiplesOf3
     */
    @Test
    public void test_getMultiplesOf3_01() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] result = Utilities.getMultiplesOf3(input);
        int[] expected = {3, 6};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_getMultiplesOf3_02() {
        int[] input = {1, 2, 4, 5, 7, 8};
        int[] result = Utilities.getMultiplesOf3(input);
        int[] expected = {};
        assertArrayEquals(expected, result);
    }

    /*
     * Tests related to getAllPrefixes
     */
    @Test
    public void test_getAllPrefixes_01() {
        int[] input = {3};
        String[] result = Utilities.getAllPrefixes(input);
        String[] expected = {"[3]"};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_getAllPrefixes_02() {
        int[] input = {3, 1};
        String[] result = Utilities.getAllPrefixes(input);
        String[] expected = {"[3]", "[3, 1]"};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_getAllPrefixes_03() {
        int[] input = {3, 1, 4};
        String[] result = Utilities.getAllPrefixes(input);
        String[] expected = {"[3]", "[3, 1]", "[3, 1, 4]"};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_getAllPrefixes_04() {
        int[] input = {3, 1, 4, 5};
        String[] result = Utilities.getAllPrefixes(input);
        String[] expected = {"[3]", "[3, 1]", "[3, 1, 4]", "[3, 1, 4, 5]"};
        assertArrayEquals(expected, result);
    }

    /*
     * Tests related to getGroupedNumbers
     */
    @Test
    public void test_getGroupedNumbers_00() {
        int[] input = {};
        int[] result = Utilities.getGroupedNumbers(input);
        int[] expected = {};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_getGroupedNumbers_01() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] result = Utilities.getGroupedNumbers(input);
        int[] expected = {3, 6, 1, 4, 2, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_getGroupedNumbers_02() {
        int[] input = {1, 2, 4, 5};
        int[] result = Utilities.getGroupedNumbers(input);
        int[] expected = {1, 4, 2, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_getGroupedNumbers_03() {
        int[] input = {2, 3, 5, 6};
        int[] result = Utilities.getGroupedNumbers(input);
        int[] expected = {3, 6, 2, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_getGroupedNumbers_04() {
        int[] input = {1, 3, 4, 6};
        int[] result = Utilities.getGroupedNumbers(input);
        int[] expected = {3, 6, 1, 4};
        assertArrayEquals(expected, result);
    }

    /*
     * Tests related to getGroupedNumbers
     */
    @Test
    public void test_zigZagFlatten_00() {
        int[][] input = {};
        int[] result = Utilities.zigZagFlatten(input);
        int[] expected = {};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_zigZagFlatten_01() {
        int[][] input = {{}, {}};
        int[] result = Utilities.zigZagFlatten(input);
        int[] expected = {};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_zigZagFlatten_02() {
        int[][] input = {{3, 7}, {5, 8}};
        int[] result = Utilities.zigZagFlatten(input);
        int[] expected = {3, 7, 8, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_zigZagFlatten_03() {
        int[][] input = {{3, 7, 9}, {5, 8}};
        int[] result = Utilities.zigZagFlatten(input);
        int[] expected = {3, 7, 9, 8, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_zigZagFlatten_04() {
        int[][] input = {{3, 7, 9}, {5, 8}, {1, 2, 3, 4}, {11, 22}};
        int[] result = Utilities.zigZagFlatten(input);
        int[] expected = {3, 7, 9, 8, 5, 1, 2, 3, 4, 22, 11};
        assertArrayEquals(expected, result);
    }

}
