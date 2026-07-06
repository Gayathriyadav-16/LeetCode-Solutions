class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m+n];
        for(int i=0;i<nums1.length;i++){
             nums3[i]=nums1[i];   
        }
        for(int i=0;i<nums2.length;i++){
                nums3[m+i]=nums2[i];
        }
        Arrays.sort(nums3);
        //return nums3;
        for(int i=0; i<m+n; i++){
            nums1[i] = nums3[i];
        }
        // int i=0;
        // while(i<m){
        //     nums3[i] = nums1[i];
        //     i++;
        // }
        // for(int j=0;j<n;j++){
        //     nums3[i] = nums2[j];
        //     i++;
        // }
        // Arrays.sort(nums3);
        // for(int k=0;k<m;k++){
        //     nums1[k] = nums3[k]; 
        // }

        }
    }
