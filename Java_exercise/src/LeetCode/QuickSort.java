package LeetCode;

/**
 * @Projectname: Java_exercise
 * @Filename: QuickSort
 * @Author: EdmundXie
 * @Data:2022/10/17 12:13
 * @Email: 609031809@qq.com
 * @Description:
 * 快速排序平均O(nlogn) 最坏O(n^2)
 * quicksort前需判断if(L<R)！！！不然会数组越界
 */
public class QuickSort {
    public static void main(String[] args){
        int[] a = {1,4,3,2,5,6};
        quickSort(a,0,a.length-1);
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void quickSort(int[] nums,int L,int R){
        if(nums==null)return;
        if(L<R){
            swap(nums,L+(int)(Math.random()*(R-L+1)),R);
            int[] p = partition(nums, L, R);
            quickSort(nums,L,p[0]-1);
            quickSort(nums,p[1]+1,R);
        }
    }
    public static void swap(int[] nums,int L,int R){
        int temp = nums[L];
        nums[L] = nums[R];
        nums[R] = temp;
    }
    public static int[] partition(int[] nums,int L,int R){
        int less = L-1;
        int more = R;
        while(L<more){
            if (nums[L]<nums[R]){
                swap(nums,L++,++less);
            }
            else if(nums[L]>nums[R]){
                swap(nums,--more,L);
            }
            else{
                L++;
            }
        }
        swap(nums,more,R);
        return new int[]{less+1,more};
    }
}
