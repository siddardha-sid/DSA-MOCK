package Problems;

public class ZeroAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,5,0,2,0,7};
int[] nums=test(arr);
for(int num : nums) {
	System.out.print(num+" ");
}
	}
	public static int[] test(int[] arr) {
		int index=0;
		for(int num : arr) {
			if(num!=0) {
				arr[index++]=num;
			}
		}
		while(index<arr.length) {
			arr[index++]=0;
		}
		return arr;
	}

}
