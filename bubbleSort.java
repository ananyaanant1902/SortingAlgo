import java.util.*;

class BubbleSort {

    //linear search is basically the loops,
    //binary search
    public static void bubbleSort(int[] arr){
        int[] arr_sorted=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before :");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        bubbleSort(arr);

        System.out.println("After :");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
