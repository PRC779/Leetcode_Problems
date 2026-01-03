class Solution {
    public int searchInsert(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

// (0(n))
// public int searchInsert(int[] numbers, int target) {
//         int nums = numbers.length;
//         for (int i = 0; i < nums; i++) {
//             if (numbers[i] >= target) {
//                 return i;  
//             }
//         }       
//         return nums;    
//     }
// }
}