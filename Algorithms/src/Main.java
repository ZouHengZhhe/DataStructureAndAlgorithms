import sortAlgorithm.SortAlgorithm;
import util.Util;

public class Main {

    public static void main(String[] args)
    {
        SortAlgorithm sortAlgorithm=new SortAlgorithm();
        int[] a=new int[100];
        for(int i=0;i<100;i++)
        {
            int temp=(int)((Math.random())*10000);
            a[i]=temp;
        }
        Util.sysArray(a);

//        int[] sortArray=sortAlgorithm.bubbleSort(a);     //冒泡排序
//        int[] sortArray=sortAlgorithm.selectSort(a);         //选择排序
        int[] sortArray=sortAlgorithm.insertSort(a);
        Util.sysArray(sortArray);
    }


}
