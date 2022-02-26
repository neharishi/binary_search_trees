
public class BST<T extends Comparable<T>> {
	
	private T datum;
	private BST<T> left;
	private BST<T> right;
	

	public BST() {
		datum = null;
	}
	
	public BST(T datum) {
		this.datum = datum;
	}
	
	public BST(BST<T> left, T datum, BST<T> right) {
		this.left = left;
		this.datum = datum;
		this.right = right;
		
	}
	
	public T getDatum() {
		return datum;
	}
	
	public BST<T> getLeft(){
		return left;
	}
	
	public BST<T> getRight(){
		return right;
	}
	
	public boolean isEmpty() {
		if (datum == null) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public void setLeft(BST<T> t) {
		left = t;
	}
	
	public void setRight(BST<T> t) {
		right = t;
	}
	
	public void insert(T datum) {
		
		if(datum.compareTo(this.datum) == 0) {
			System.out.println("Already in tree");
		}
		
		else if (this.datum.compareTo(datum) > 0) {
			if (left != null) {
				left.insert(datum);
			} else {
				//left = new BST<T>(datum);
				setLeft(new BST<T>(datum));
			}
		} else if (this.datum.compareTo(datum) < 0) {
			if (right != null) {
				right.insert(datum);
			} else {
				setRight(new BST<T>(datum));
			}
		}
	}
	
	public int getHeight() {
		    if (isEmpty()) return 0;
		    else {
				return (1 + (Math.max(
					left == null ? 0 : left.getHeight(),
					right == null ? 0 : right.getHeight())));
				}
				
			}
		
	
	
	
	public String toString() {
		String d = "" + datum + ", ";
		if (left != null) {
			d = left.toString() + d;
		}
		if (right != null) {
			d = d + right.toString();
		}
		
		return d;
	}

}



