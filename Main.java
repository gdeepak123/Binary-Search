//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {-18, -4, 0, 2, 4, 6, 8, 12, 16, 20, 44, 58};
        int target = 20;
        int index = binarySearch(arr,target);
        System.out.println(index);
    }

        public static int binarySearch(int[] arr, int target)
        {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end)
            {
                int mid = start + (end - start) / 2;

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;

                } else {
                    return mid;
                }
            }
            return -1;

        }

    }
