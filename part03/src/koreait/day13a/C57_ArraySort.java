package koreait.day13a;
//�ۼ��� ��ȭ��
public class C57_ArraySort {

	public static void main(String[] args) {
		
		//���� �˰���(��������)
		int[] nums = {34, 77, 19, 56, 45, 9};
		
		for(int i = 0; i < nums.length; i++) {
			for(int k = i + 1; k < nums.length; k++) {
				if(nums[i] > nums[k]) {
					int temp = nums[i];
					nums[i] = nums[k];
					nums[k] = temp;
				}
			}
		}
		
		for(int i = 0; i < nums.length; i++) {
			System.out.printf("%5d", nums[i]);
		}

	}
	
}
