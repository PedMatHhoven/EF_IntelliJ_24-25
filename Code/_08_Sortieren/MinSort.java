package _08_Sortieren;

public class MinSort {
    public static int[] a = {5, 9, 3, 16, -7, 22, 13};

    public static void main(String[] args) {
        for (int i=0; i<=a.length-1; i++) System.out.print(a[i]+" ");
        System.out.println(); System.out.println("sortiert:");
        selectionSort();
        for (int i=0; i<=a.length-1; i++) System.out.print(a[i]+" ");
    }

    public static void selectionSort(){
        for (int i=0; i<a.length-1;i++){
            int minpos=minimumPosition(i);
            swap(minpos, i);
        }
    }

    public static int minimumPosition(int from){
        int minpos=from;
        for (int i=from+1; i<a.length; i++) if(a[i]<a[minpos]) minpos=i;
        return minpos;
    }

    private static void swap(int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
