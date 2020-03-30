public class Heapsort {
    public int[] a;
    public int n;
    public Heapsort(int[] arr) {
        a = arr;
        buildHeap(a);
        for(int i = n ; i >= 1 ; --i) {
            int temp = a[1];
            a[1] = a[i];
            a[i] = temp;
            --n;
            Heapify(a,1,n);
        }
    }

    public void buildHeap(int[] a) {
        n = a.length - 1;
        for(int i = (int)Math.floor(n / 2) ; i >= 1 ; --i) Heapify(a, i, n);
    }

    public void Heapify(int[] a, int i, int n) {
        int left = 2*i;
        int right = 2*i + 1;
        int max;

        if (left <= n && a[left] > a[i]) max = left;
        else max = i;

        if (right <= n && a[right] > a[max]) max = right;

        if (max != i){
            int temp = a[i];
            a[i] = a[max];
            a[max] = temp;
            Heapify(a, max, n);
        }
    }
}
