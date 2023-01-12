package ArrayExecise;

public class InsertDeleteArray {
    public static int insertToArray(int[] arr, int n, int key, int position){
        //insert d vao trong arr
        // insertToArray(arr, 10, 19, 2) -> insert 10 tro thanh element co index la 2 trong arr, va element co index 2
        //cu se tro thanh index 3
        // 1 2 3 4 5 6 7 8 9 10
        // 1 2 19 3 4 5 6 7 8 9 10
        //return the new size of array
        if(n >= arr.length){
            return n; //array is full
        }
        if(position < 0 || position > n){
            return n;
        }

        n++; //tang size cua array len 1
        for(int i = n-1; i >= position+1; i--){
            arr[i] = arr[i-1];
        }
        arr[position] = key;
        
        return n;
    }

    public static int deleteFromArray(int[] arr, int n, int pos){
        if (pos < 0 || pos > n-1) {
            return n;
        }
        
        for (int i = pos; i < n; i++) {
            arr[i] = arr[i+1];
        }
        n--;
        return n;
    }

    public static void main(String[] args){
        int[] arr = new int[20];
        for(int i = 0; i < 10; i++){
            arr[i] = i+1;
        }
        int size = 10;
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        size = insertToArray(arr, size, 19, 2);
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        size = deleteFromArray(arr, size, 2);
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
