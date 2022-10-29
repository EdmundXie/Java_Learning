package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Projectname: Java_exercise
 * @Filename: MergeSort
 * @Author: EdmundXie
 * @Data:2022/10/16 20:16
 * @Email: 609031809@qq.com
 * @Description:
 * 归并排序
 * 平均O(nlogn)
 */
public class MergeSort {
    public static void main(String[] args) {
//        int[] a = {1,4,3,2,5,6};
//        mergesort(a,0,a.length-1);
//        for(int i = 0;i<a.length;i++){
//            System.out.println(a[i]);
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("22", "11");
        map.put("33", "22");
        map.put("11", "33");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue());
    }
    public static void mergesort(int[] nums,int L,int R){
        if(L==R)return;
        int mid = L + ((R-L)>>1);
        mergesort(nums, L, mid);
        mergesort(nums, mid+1, R);
        merge(nums, L, mid, R);
    }
    public static void merge(int[] arr,int L,int mid, int R){
        int i = L,j = mid+1;
        int h = 0;
        int[] help = new int[R-L+1];
        while(i<=mid&&j<=R){
            help[h++] = arr[i]<=arr[j]?arr[i++]:arr[j++];
        }
        while(i<=mid){
            help[h++] = arr[i++];
        }
        while(j<=R){
            help[h++] = arr[j++];
        }
        for (int a=0;a<R-L+1;a++){
            arr[L+a] = help[a];
        }
    }
}
