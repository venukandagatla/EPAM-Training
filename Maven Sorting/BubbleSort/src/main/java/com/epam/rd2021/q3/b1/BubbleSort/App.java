package com.epam.rd2021.q3.b1.BubbleSort;

public class App 
{
	public int[] bubbleSort(int[] array)
    {
    	int size = array.length;
        for (int i = 0; i < size-1; i++)
        {
            for (int j = 0; j < size-i-1; j++)
            {
                if (array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    	return array;
    }
}
