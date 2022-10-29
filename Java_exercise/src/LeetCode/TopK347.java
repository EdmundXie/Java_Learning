package LeetCode;

import java.util.*;

/**
 * @Projectname: Java_exercise
 * @Filename: TopK347
 * @Author: EdmundXie
 * @Data:2022/10/17 20:52
 * @Email: 609031809@qq.com
 * @Description:
 */
public class TopK347 {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == k) return nums;

        Map<Integer,Integer> cmap = new HashMap<>();

        // it stores frequency of each element
        for(int i: nums)
            cmap.put(i, cmap.getOrDefault(i,0)+1);

        Queue<Integer> que = new PriorityQueue<>(k, Comparator.comparingInt(cmap::get));

        for(int i: cmap.keySet()){
            que.add(i);
            if(que.size()>k)
                que.poll();
        }

        return que.stream().mapToInt(Integer::valueOf).toArray();
    }
}
