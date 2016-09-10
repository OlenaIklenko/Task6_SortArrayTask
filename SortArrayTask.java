/**
 * Created by Леночка on 10.09.2016.
 */
import java.util.Arrays;
public class SortArrayTask {
    public static void main(String[] args) {

        int[] array = {2, 4, 5, 6, 2, 4, 3, 9, 9, 2};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(doBubbleSort( array)));
        System.out.println(Arrays.toString(doSelectionSort( array)));
        System.out.println(Arrays.toString(doInsertionSort( array)));


    }

    public static int[] doBubbleSort( int [ ] arr)
    {
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        int temp;   //holding variable

        while ( flag )
        {
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < arr.length -1;  j++ )
            {
                if ( arr[ j ] > arr[j+1] )   // change to > for ascending sort
                {
                    temp = arr[ j ];                //swap elements
                    arr[ j ] = arr[ j+1 ];
                    arr[ j+1 ] = temp;
                    flag = true;              //shows a swap occurred
                }
            }
        }
        return arr;
    }

    public static int[] doSelectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }

    public static int[] doInsertionSort(int[] arr){

        int temp;
        for (int i = 1; i < arr.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }

}
