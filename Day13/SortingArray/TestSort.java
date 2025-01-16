import SortingArray.Sort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestSort {
    @Test
    public void testAllCases() {
        int[] arr1 = {5, 2, 9, 1, 5};
        int[] expected1 = {1, 2, 5, 5, 9};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] expected2 = {1, 2, 3, 4, 5};
        int[] arr3 = {};
        int[] expected3 = {};
        int[] arr4 = {1, 2, 3, 4, 2};
        int[] expected4 = {1, 2, 2, 3, 4};
        int[] arr5 = {7, 4, 2, 3, 1};
        int[] expected5 = {1, 2, 3, 4, 7};
        Sort.Sorting(arr1);
        assertArrayEquals(expected1, arr1);
        Sort.Sorting(arr2);
        assertArrayEquals(expected2, arr2);
        Sort.Sorting(arr3);
        assertArrayEquals(expected3, arr3);
        Sort.Sorting(arr4);
        assertArrayEquals(expected4, arr4);
        Sort.Sorting(arr5);
        assertArrayEquals(expected5, arr5);
    }
}
