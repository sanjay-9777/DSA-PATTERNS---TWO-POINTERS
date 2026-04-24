public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 1, 1, 2, 2, 2, 3, 3, 3, 3 };
        int officer = 0, res = 1, cm = 1;
        int n = arr.length;

        while (cm < n) {
            if (arr[cm] != arr[cm - 1]) {
                arr[officer + 1] = arr[cm];
                officer++;
                res++;
            }
            cm++;
        }
        System.out.println(res);
        for (int i = 0; i < res; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
