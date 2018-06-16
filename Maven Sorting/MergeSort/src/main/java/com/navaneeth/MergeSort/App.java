package com.navaneeth.MergeSort;

public class App 
{
	void merge(int array[], int left, int mid, int right)
    {        
        int n1 = mid - left + 1;
        int n2 = right - mid;         
        int temp1[] = new int [n1];
        int temp2[] = new int [n2];     
        for (int i=0; i<n1; ++i)
            temp1[i] = array[left + i];
        for (int j=0; j<n2; ++j)
            temp2[j] = array[mid + 1+ j];
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2)
        {
            if (temp1[i] <= temp2[j])
            {
                array[k] = temp1[i];
                i++;
            }
            else
            {
                array[k] = temp2[j];
                j++;
            }
            k++;
        } 
        while (i < n1)
        {
            array[k] = temp1[i];
            i++;
            k++;
        } 
        while (j < n2)
        {
            array[k] = temp2[j];
            j++;
            k++;
        }
    }
     
    void sort(int array[], int left, int right)
    {
        if (left < right)
        {         
            int mid = left + (right - left)/2;          
            sort(array, left, mid);
            sort(array , mid+1, right);
            merge(array, left, mid, right);
        }
    }
    
    int[] mergeSort(int[] array)
    {
    	sort(array,0,array.length-1);
    	return array;
    }
}
