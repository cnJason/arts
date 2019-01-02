import java.util.HashMap;
import java.util.Map;

/**
 * @author jason
 */
public class TowSum {


	/**
	 * main method.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int[] result = twoSum(new int[]{2, 7, 11, 15}, 9);
		System.out.println("index 0 is:  " + result[0] + " and index 1 is :" + result[1]);
		result = twoSum(new int[]{7, 1, 3, 22}, 10);
		System.out.println("index 0 is:  " + result[0] + " and index 1 is :" + result[1]);
		result = twoSum(new int[]{1, 12, 4, 3}, 5);
		System.out.println("index 0 is:  " + result[0] + " and index 1 is :" + result[1]);
		result = twoSum(new int[]{99, 5, 31, 23}, 28);
		System.out.println("index 0 is:  " + result[0] + " and index 1 is :" + result[1]);
		result = twoSum(new int[]{12, 4, 2, 12}, 24);
		System.out.println("index 0 is:  " + result[0] + " and index 1 is :" + result[1]);
	}

	/**
	 * nums = [2, 7, 11, 15],target=9,return[0, 1]
	 *
	 * @param nums   数字数组
	 * @param target 目标值
	 * @return 返回相加的数组.
	 */
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[]{map.get(complement), i};
			}
			map.put(nums[i], i);
		}
		return null;
	}
}
