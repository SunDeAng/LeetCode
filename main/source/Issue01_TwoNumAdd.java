/**
 * @Author: Sdaer
 * @Date: 2020-08-12
 * @Desc:
 *
 *Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class Issue01_TwoNumAdd {

    //This is a test.
    public static void main(String[] args) {

        int[] nums = new int[]{2,7,11,15};
        int target = 9;

        TwoNumAdd test = new TwoNumAdd();
        int[] res = test.twoSum(nums, target);

        for (int re : res) {
            System.out.println(re);
        }

    }

}

class TwoNumAdd {
    public int[] twoSum(int[] nums, int target) {

        //The real solution.
        int[] ints = new int[2];
        for(int i= 0;i < nums.length - 1;i++){
            for(int j = i + 1;j < nums.length;j++){
                if(nums[i]+nums[j] == target){
                    ints[0] = i;
                    ints[1] = j;
                    break;
                }
            }
        }
        return ints;
    }
}
