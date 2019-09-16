package sortAlgorithm;

import util.Util;

import java.util.Arrays;

/*
 *Author:ZouHeng
 *Des:
 *Date:2019-08-12 17:14
 */
public class SortAlgorithm
{
    //冒泡排序
    public int[] bubbleSort(int[] array)
    {
        for (int i=0;i<array.length;i++)
        {
            for (int j=0;j<array.length-1-i;j++)
            {
                if (array[j]>array[j+1])
                {
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }

    //插入排序
    public int[] insertSort(int[] array)
    {
        for (int i=1;i<array.length;i++)
        {
            int temp=array[i];
            int j;
            for (j=i-1;j>=0;j--)
            {
                if (array[j]>temp)
                {
                    array[j+1]=array[j];
                }
                else
                {
                    break;
                }
            }
            array[j+1]=temp;
        }
        return array;
    }

    //选择排序
    public int[] selectSort(int[] array)
    {
        for (int i=0;i<array.length;i++)
        {
            for (int j=i+1;j<array.length;j++)
            {
                if (array[i]>array[j])
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }

    //希尔排序
    public int[] shellSort(int[] array)
    {
        int[] arr= Arrays.copyOf(array, array.length);
        int gap=1;
        while(gap<arr.length)
        {
            gap=gap*3+1;
        }
        while (gap>0)
        {
            for (int i=gap;i<arr.length;i++)
            {
                int tmp=arr[i];
                int j=i-gap;
                while (j>=0&&arr[j]>tmp)
                {
                    arr[j+gap]=arr[j];
                    j-=gap;
                }
                arr[j+gap]=tmp;
            }
            gap=(int)Math.floor(gap/3);
        }
        return arr;
    }
}
