
public class Main {

	public static void main(String[] args) {
		BST<Integer> t = new BST<Integer>(5); 	
		t.insert(3);
		t.insert(6);
		t.insert(2);
		t.insert(4);
		t.insert(7);
		System.out.println(t);
		
		BST<Integer> bsti = new BST<Integer>(12);
		bsti.insert(7);
		bsti.insert(19);
		System.out.println(bsti);
		
		System.out.println(t.getHeight());
		
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



