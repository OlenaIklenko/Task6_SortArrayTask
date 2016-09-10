/**
 * Created by Леночка on 10.09.2016.
 */
import org.junit.Assert;
import org.junit.Test;

public class SortArrayTest {
    @Test
    public void testBubbleSort(){
        int[] array = {2, 4, 5, 6, 2, 4, 3, 9, 9, 2};
        int[] expectedArray = {2, 2, 2, 3, 4, 4, 5, 6, 9, 9};
        Assert.assertArrayEquals(expectedArray, SortArrayTask.doBubbleSort(array));
    }

    @Test
    public void testSelectionSort(){
        int[] array = {2, 4, 5, 6, 2, 4, 3, 9, 9, 2};
        int[] expectedArray = {2, 2, 2, 3, 4, 4, 5, 6, 9, 9};
        Assert.assertArrayEquals(expectedArray, SortArrayTask.doSelectionSort(array));
    }

    @Test
    public void testInsertionSort(){
        int[] array = {2, 4, 5, 6, 2, 4, 3, 9, 9, 2};
        int[] expectedArray = {2, 2, 2, 3, 4, 4, 5, 6, 9, 9};
        Assert.assertArrayEquals(expectedArray, SortArrayTask.doInsertionSort(array));
    }


}
