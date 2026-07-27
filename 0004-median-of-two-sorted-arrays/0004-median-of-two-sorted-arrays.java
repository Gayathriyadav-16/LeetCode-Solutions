// class Solution {
//     int floor(int ar[],int val){
//         int low =0,high=ar.length-1;
//         int ans=0;
//         while(low<=high){
//             int mid = (low+high)/2;
//             if(ar[mid] <= val){
//                 ans = mid+1; 
//                 low = mid+1;
//             }
//             else{
//                 high = mid-1;
//             }
//         }
//         return ans;
//     } 
//     // int ceil(int ar[],int val){
//     //     int low =0,high=ar.length-1;
//     //     int ans=0;
//     //     while(low<=high){
//     //         int mid = (low+high)/2;
//     //         if(ar[mid] == val){
//     //             ans = val;
//     //             return ans; 
//     //         }
//     //         else if(ar[mid]>val){
//     //             ans = mid-1;
//     //             high = mid-1;
//     //         }
//     //         else{
//     //             low = mid+1;
//     //         }
//     //     }
//     //     return ans;
//     // } 
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int n1 = nums1.length,n2 = nums2.length; 
//         int tot = n1+n2;
//         // if (n1 == 0)
//         //     return n2 % 2 == 1 ? nums2[n2 / 2]:(nums2[n2 / 2] + nums2[n2 / 2 - 1]) / 2.0;
//         // if (n2 == 0)
//         //     return n1 % 2 == 1 ? nums1[n1 / 2]:(nums1[n1 / 2] + nums1[n1 / 2 - 1]) / 2.0;
//         int low = Math.min(nums1[0],nums2[0]);
//         int high = Math.max(nums1[n1-1],nums2[n2-1]);
//         // while(low<=high){
//         //     int mid = (low+high)/2;
//         //     // int a_floor = floor(nums1,mid);
//         //     // int b_floor = floor(nums2,mid);
//         //     int smaller = floor(nums1,mid) + floor(nums2,mid);
//         //     int  larger = ceil(nums1,mid+1) + ceil(nums2,mid+1);
//         //     if(smaller == larger){
//         //         return mid;
//         //     }
//         //     else if(smaller>larger){
//         //         high = mid-1;
//         //     }
//         //     else{
//         //         low = mid+1;
//         //     }
//         // }
//         // return -1;
//         int low = Math.min(nums1.length == 0 ? Integer.MAX_VALUE : nums1[0],
//                    nums2.length == 0 ? Integer.MAX_VALUE : nums2[0]);

// int high = Math.max(nums1.length == 0 ? Integer.MIN_VALUE : nums1[n1 - 1],
//                     nums2.length == 0 ? Integer.MIN_VALUE : nums2[n2 - 1]);
//         while (low <= high) {
//            int mid = low + (high - low) / 2;
//            int count = floor(nums1, mid) + floor(nums2, mid);
//             if (count < (tot + 1) / 2) {
//                 low = mid + 1;
//             } 
//             else {
//                 high = mid - 1;
//             }
//         }
//         int left = low;
//         if (tot % 2 == 1) {
//             return left;
//         }
//         low = Math.min(nums1[0], nums2[0]);
//         high = left;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             int count = floor(nums1, mid) + floor(nums2, mid);
//             if (count < (tot / 2)+1) {
//                 low = mid + 1;
//             } 
//             else {
//                 high = mid - 1;
//             }
//         }
//         int right = low;
//         return (left + right) / 2.0;
//     }
// }
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int n1 = nums1.length;
        int n2 = nums2.length;
        int low = 0;
        int high = n1;
        while (low <= high) {
            int c1 = (low + high) / 2;
            int c2 = (n1 + n2 + 1) / 2 - c1;
            int l1 = (c1 == 0) ? Integer.MIN_VALUE : nums1[c1 - 1];
            int l2 = (c2 == 0) ? Integer.MIN_VALUE : nums2[c2 - 1];
            int r1 = (c1 == n1) ? Integer.MAX_VALUE : nums1[c1];
            int r2 = (c2 == n2) ? Integer.MAX_VALUE : nums2[c2];
            if (l1 <= r2 && l2 <= r1) {
                if ((n1 + n2) % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else {
                    return Math.max(l1, l2);
                }
            } else if (l1 > r2) {
                high = c1 - 1;
            } else {
                low = c1 + 1;
            }
        }
        return 0.0;
    }
}