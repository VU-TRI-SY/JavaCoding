package ArrayExecise;

public class SortingAlgorithms {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i-1;
            //di chuyen cac phan tu ma lon hon key sang phai mot o
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1; 
            }
            arr[j+1] = key; //insert key vao vi tri thich hop
        }
    }

    public static void bubbleSort(int[] arr){
        boolean check = false;
        // while(check == true){ //điều kiện để lặp của while là khi nào trong mảng mà còn xuất hiện một cặp phá vỡ trật tự thì vẫn duyệt tiếp
        //     check = false; //giả sử không tồn tại cặp nào phá vỡ trật tự của mảng trong lần duyệt này
        //     for(int i = 0; i <= arr.length-2; i++){
        //         if(arr[i] > arr[i+1]){
        //             int temp = arr[i];
        //             arr[i] = arr[i+1];
        //             arr[i+1] = temp;
        //             check = true; //tồn tại một cặp phá vỡ trật tự của mảng
        //         }
        //     }
        // }
        do{
            check = false; //giả sử không tồn tại cặp nào phá vỡ trật tự của mảng trong lần duyệt này
            for(int i = 0; i <= arr.length-2; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    check = true; //tồn tại một cặp phá vỡ trật tự của mảng
                }
            }
        }while(check == true);
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int min_idx = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[min_idx] > arr[j]){ //characteristic statement: cau lenh dac trung
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }
}
