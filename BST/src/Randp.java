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



