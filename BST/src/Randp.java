public class Randp {
	
   private int[] nums;
   private int numsLeft;
	
   public Randp(int n) {
       initNums(n);
   }
	
   private void initNums(int n) {
	   
	   nums = new int[n];
	   for (int i = 0; i < n; i++) {
		   nums[i] = i + 1;
	   }
	   
	   numsLeft = n;
   }
   
	
   public int nextInt() {
        
	  if (numsLeft == 0) {
		  return 0;
	  }
	   
	   int index = (int)(numsLeft * Math.random());
	   
	   numsLeft = numsLeft - 1;
	   
	   int num = nums[index];
	   
	  
	   
	   nums[index] = nums[numsLeft];
	   
	   return num;
	  
	   
	   
   }
}

//public class RandP {
//	private int counter;
//	private int[] nums;
//	
//	public RandP(int n) {
//		nums = new int[n];
//		initNums(nums);
//		counter = n;
//	}
//
//	//Fills an array with consecutive numbers from 1 to nums.length
//	public void initNums(int[] nums) {
//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = i+1;
//		}
//	}
//	
//	public int size() {
//		return nums.length;
//	}
//
//	public void swap(int[] arr, int a, int b) {
//		int temp = arr[a];
//		arr[a] = arr[b];
//		arr[b] = temp;
//	}
//	
//	public int nextInt() {
//		if (counter == 0) return 0;
//		
//		//selects a random index number to be used in the array
//		int position = (int) (counter * Math.random());
//		
//		//decrease the counter so that it is the last index in the array
//		counter--;
//		
//		//get the return value 
//		int returnValue = nums[position];
//		
//		//swap the numbers at nums[position] and nums[counter]
//		swap(nums, position, counter);
//		
//		//return the value
//		return returnValue;
//	}
//}

