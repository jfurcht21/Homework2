package Homework2;

public class Main {

    public static void main(String[] args) {
        BubbleSort sorter = new BubbleSort();
	    int[] array = new int[] {3,2,5,8,6,9,4};

	    sorter.sortArrayDescending(array);

        for (int var:array)
        {
            System.out.print(var + " ");
        }
    }
}
