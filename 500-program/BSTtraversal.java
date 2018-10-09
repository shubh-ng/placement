import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
class Node{
    int data;
    Node left;
    Node right;
    
    public Node(int data){
        this.data = data;
        left = null;
        right  = null;
    }
}

public class Solution{
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right, data);
                root.right =cur;
            }
            return root;
        }
    }
    
    public static void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    
    public static void preOrder(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    
    public static void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }

    public static void levelOrder(Node root){
        Queue queue = new LinkedList(); //for traversing
        if(root != null){
            queue.add(root);
            while(!queue.isEmpty()){
                Node visited = (Node)queue.poll();
                System.out.print(visited.data+" ");
                if(visited.left != null){
                    queue.add(visited.left);
                }
                if(visited.right != null){
                    queue.add(visited.right);
                }
            }
        }
    }

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root=null;
        while(t-- > 0){
            int data = scan.nextInt();
            root = insert(root, data);
        }
        System.out.print("Level order traversal: ");
        levelOrder(root);
        System.out.print("\nInorder traversal: ");
        inOrder(root);
        System.out.print("\nPreorder traversal: ");
        preOrder(root);
        System.out.print("\nPostorder traversal: ");
        postOrder(root);
    }
}
