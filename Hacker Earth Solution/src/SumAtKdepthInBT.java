import java.util.Scanner;

class Node{
	int value;
	Node left;
	Node right;
	Node(int value){
		this.value = value;
		left = null;
		right = null;
	}
}

class BTree{
	Node root;
	BTree(){
		root = null;
	}
	
	void insert(int data){
		root = insert(root,data);
	}
	
	Node insert(Node root,int data){
		if (root == null)
            root = new Node(data);
        else
        {
            if (root.left == null)
                root.left = insert(root.left, data);
            else
                root.right = insert(root.right, data);             
        }
        return root;
    }    
}

public class SumAtKdepthInBT {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char s[] = scan.nextLine().toCharArray();
		
	}

}
