package com.navaneeth.QuickSort;

public class App 
{
	 int partition(int[] array, int left, int right)
    {
        int pivot = array[right]; 
        int i = (left-1);
        for (int j=left; j<right; j++)
        {
            if (array[j] <= pivot)
            {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[right];
        array[right] = temp;
        return i+1;
    }

     void sort(int[] array, int left, int right)
    {
        if (left < right)
        {
            int partition_index = partition(array, left, right);
            sort(array, left, partition_index-1);
            sort(array, partition_index+1, right);
        }
    }
    
     int[] quickSort(int[] array) 
    {
    	sort(array,0,array.length-1);
    	return array;
    }
}
