import java.util.HashSet;
import java.util.Set;

public class Intersection {
	
	public static int[] intersection(int[] nums1, int[] nums2){
		int count =0;
		Set<Integer> temp = new HashSet<Integer>();
		for(int i=0;i<nums1.length;i++){
			for(int j=0;j<nums2.length;j++){
				if(nums1[i] == nums2[j])
					{temp.add(nums1[i]);
					//System.out.println(nums1[i]);
					}
			}
		}
		int[] result = new int[temp.size()]; 
		for( int t : temp)
			result[count++] = t;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{1,2,2,1};
		int[] b = new int[]{2,2};
		int[] result = intersection(a,b);
		for(int i =0 ; i < result.length; i++)
			System.out.println(result[i]);
	}

}
