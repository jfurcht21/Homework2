package Homework2;

/**
 * A class to sort an array in ascending or descending order.
 * Reference: https://www.geeksforgeeks.org/bubble-sort/
 */
public class BubbleSort {
    //Sorts array in ascending order
    public int[] sortArrayAscending(int[] array)
    {
        for(int i = 0;i < array.length-1;i++)
        {
            for(int j = 0;j < array.length - i -1; j++)
            {
                int temp;
                if(array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    //Sorts array in descending order
    public int[] sortArrayDescending(int[] array)
    {
        for(int i = 0;i < array.length-1;i++)
        {
            for(int j = 0;j < array.length - i - 1; j++)
            {
                int temp;
                if(array[j] < array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
