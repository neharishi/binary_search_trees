
public class Main {

	public static void main(String[] args) {
		BST<Integer> t = new BST<Integer>(5); 	
		t.insert(3);
		t.insert(6);
		t.insert(2);
		t.insert(4);
		t.insert(7);
	//	System.out.println(t);
		
		BST<Integer> bsti = new BST<Integer>(12);
		bsti.insert(7);
		bsti.insert(19);
		// If printed in order, the below line should produce 7, 12, 19
		System.out.println(bsti);
		
	//	System.out.println(t.getHeight());
		
		int numNodes = 1000;
		int numTrees = 1000;
		int totalDepth = 0;
		int averageDepth = 0;
		
		for (int i = 0; i < numTrees; i++) {
			Randp r = new Randp(numNodes);
			BST<Integer> tree = new BST<Integer>(r.nextInt());
			
			for (int j = 1; j < numNodes; j++) {
				tree.insert(r.nextInt());
			}
			
			totalDepth += tree.getHeight();
		}
		
		averageDepth = totalDepth / numTrees;
		
		System.out.println("The average depth of 1000 trees is: " + averageDepth);

	}

}

//RANDP CLASS
//
//import java.lang.Math;
//public class Randp { 
//	//FOR BST PROJECT
//    private int[] nums;
//    private int numsLeft;
//	
//    public Randp(int n) {
//       // YOUR_CODE_HERE
//    	initNums(n);
//    }
//	
//   
//    private void initNums(int n) {
//       // YOUR_CODE_HERE
//    	nums = new int[n];
//    	for(int counter = 0; counter < n; counter++) {
//    		nums[counter]= counter + 1;
//    	}
//    	numsLeft = n;
//    }
//	
//    public int nextInt() {
//        // Math.random() should never be called more than once
//        // when this method is called.  Recursion is not allowed.
//      //  YOUR_CODE_HERE
//    	if (numsLeft == 0) {
//    		return 0;
//    	}
//    	int i = (int)(Math.random() * numsLeft);
//    	numsLeft--;
//    	int returnVal = nums[i];
//    	nums[i] = nums[numsLeft];
//    	return returnVal; //returning a place in the array
//    	
//    	
//    }
//}
//
//
//
//
//
//
//
//
//
//BST PROJECT
//BST CLASS
//
//
//public class BST<T extends Comparable<T>> {
//private T datum;
//private BST<T> left; 
//private BST<T> right;  
//
//public BST(T datum) {
//	this.datum = datum;
//	left = null;
//	right = null;
//}
//
//public T getDatum() {
//	return datum;  // returns the datum of a node
//}
//public BST<T> getLeft() {
//	return left;   // returns the left subtree
//}
//public BST<T> getRight() {
//	return right;  // returns the right subtree
//}
//
//public void setLeft(BST<T> tree) {
//	left = tree;
//}
//
//public void setRight(BST<T> tree) {
//	right = tree;
//}
//
//public void insert(T datum) {
//	//YOUR_CODE_HERE
//	if( datum == getDatum()){
//		this.datum = datum; //just wanted to put something here
//	}
//	if(datum.compareTo(getDatum()) < 0) {
//		//if less, then on left side of tree
//		if(getLeft() != null) { 
//			//if there is still something in the left branch
//			getLeft().insert(datum);	
//		}
//		else {
//			//when left is null
//			left = new BST(datum);
//		}
//	}
//
//	if(datum.compareTo(getDatum()) > 0) {
//		//if greater than, then on right side of tree
//		if(getRight() != null) { 
//			//if there is still something in the right branch
//			getRight().insert(datum);	
//		}
//		else {
//			//when right is null
//			right = new BST(datum);
//		}
//	}
//
//}
//
//public int depthLeft(){
//	if(getLeft() == null && getRight() == null) {
//		return 1; //for root node
//	}
//	if(getLeft() == null ) {
//		return 1 + getRight().depthLeft();
//	}
//	//		if(getRight() == null) {
//	//			return getLeft().depthRight();
//	//		}
//	else {
//		return 1 + getLeft().depthLeft();
//	}
//}
//
//public int depthRight() {
//	if(getLeft() == null && getRight() == null) {
//		return 1;
//	}
//	if( getRight() == null) {
//		return 1 + getLeft().depthRight();
//	}
//	else {
//		return 1 + getRight().depthRight();
//	}
//}
//
////depth()   // returns the depth of the tree--one node counts a as depth of 1, not 0
//public int depth() {
//	int leftCounter = 0;
//	int rightCounter = 0;
//
//	if(datum != null) {å
//		leftCounter++;
//		rightCounter++;
//		
//		if(getLeft() != null) {
//			leftCounter = leftCounter + getLeft().depth();
//		}
//		if(getRight() != null) {
//			rightCounter = rightCounter + getRight().depth();
//		}
//	}
//	if(leftCounter < rightCounter) {
//		return rightCounter;
//	}
//	else {
//		return leftCounter;
//	}
//		
//}
//
////EXTRA CREDIT: delete(T datum)   
//// find datum in the binary search tree; if found, delete node,
//// but remember, this must remain a BST after deletion
//
//public void delete(T datum) {
//	//YOUR_CODE_HERE
//	if( datum == getDatum()){
//		this.datum = datum; 
//		//ask for what tree should look like if root taken out
//	}
//	if(datum.compareTo(getDatum()) < 0) {
//		//if less, then on left side of tree
//		if(getLeft() != datum) { 
//			getLeft().delete(datum);	
//		}
//		else { //when left is the datum
//			//	left = new BST(getLeft());
//		}
//	}
//
//	if(datum.compareTo(getDatum()) > 0) {
//		//if greater than, then on right side of tree
//		if(getRight() == null) { 
//			getRight().insert(datum);	
//		}
//		else {
//			right = new BST(datum);
//		}
//	}
//}
//
//public String toString() {
//	String s = "" + datum + ", ";
//
//	if (left != null)
//		s = left.toString() + s;
//	if (right != null)
//		s = s + right.toString();
//	return s;
//}
//}
//
//BST PROJECT MAIN (TESTING)
//3. Create a binary search tree by inserting the numbers 1 ... 10000 in random order. 
//* Try to predict the average depth of such a tree
//* Run your program a few times, record the depths of the trees, and
//compare your prediction to the result
//
//public class Main <T extends Comparable<T>> {
//
//public static void main(String[] args) {
//	BST<Integer> bsti = new BST<Integer>(12);
//	bsti.insert(7);
//	bsti.insert(19);
//	//	bsti.insert(14);
//	//	bsti.insert(16);
//	// If printed in order, the below line should produce 7, 12, 19
//	//	System.out.println(bsti);
////	System.out.println(bsti.depth());
//
//	//int x;	
//	Randp rand = new Randp(1000);
//	BST<Integer> bstii = new BST<Integer>(4);
//	BST<Integer> bb = randInsert(rand, bstii);
////	System.out.println(bb );
//	System.out.println(bb.getDatum());
//	System.out.println(bb.depth());
//
//
////	int t;	
////	Randp randTest = new Randp(4);
////	t = randTest.nextInt();	// randomly returns 5
//// 	System.out.println(t);
////	t = randTest.nextInt();	// randomly returns 2
////	System.out.println(t);
////	t = randTest.nextInt();	// randomly returns 2
////	System.out.println(t);
////	t = randTest.nextInt();	// randomly returns 2
////	System.out.println(t);
////	t = randTest.nextInt();	// randomly returns 2
////	System.out.println(t);
////	t = randTest.nextInt();	// randomly returns 2
////	System.out.println(t);
//	
//}
//
//public static BST<Integer> randInsert(Randp r, BST<Integer> b) {
//	int x = r.nextInt();
//	b = new BST<Integer>(x);
//	//our datum
//	
//	while(x!= 0) {
//		b.insert(x);
//		//System.out.println(x);
//		x = r.nextInt();
//		
//	}
//	return b;
//	
//
//}
//
//}
//
//
//
//
//Q4 ANALYSIS :
//4. Algorithm analysis.
//A)* What is the worst case order of growth for finding a datum in a binary search tree?
//B)* What is the best case?
//C)* What do you think the average case order of growth is?  (In other words, if a tree were created as
//in (3), above, in random order, what would you expect the typical order of growth
//for searching to be?)
//D)* What is the order of growth to insert an element in the tree?
//E)* What is the order of growth to print the tree?
//F)* EXTRA CREDIT: What is the order of growth to delete an element?
//
//My prediction: the depth would be around 30-50
//Reality: depth was around 20-25 each time
//A)The worst case scenario order of growth in a binary search is O(n), if all items are in chronological order.
//B)The best case is is O(1) →(if the datum is the root)
//C)The average order of growth is O(log n)
//D)The order of growth to insert an element is  O(n)
//E)The order of growth to print a tree is O(n)

