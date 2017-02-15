import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionofTwoArrayII {

	public static int[] intersect(int[] nums1, int[] nums2){
		
		List<Integer> temp = new ArrayList();
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<nums1.length; i++){
			if(!map.containsKey(nums1[i]))
				map.put(nums1[i], 1);
			else
				map.put(nums1[i], map.get(nums1[i])+1);
		}
		for(int j=0; j<nums2.length; j++){
			if(map.containsKey(nums2[j]) && map.get(nums2[j]) > 0){
				temp.add(nums2[j]);
				map.replace(nums2[j], map.get(nums2[j])-1);
			}
		}
		int[] result = new int[temp.size()];
		for(int k=0;k<temp.size();k++){
			result[k] = temp.get(k);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] a = new int[]{1,2,2,1};
			int[] b = new int[]{1,2,2};
			int[] result = intersect(a,b);
			for(int i=0;i<result.length;i++)
				System.out.println(result[i]);
	}

}
