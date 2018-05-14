package Code;

public class BinaryTree<K, V> {
    private BinaryTree left;
    private BinaryTree right;
    private Entry<K, V> root;

    public BinaryTree(BinaryTree left, BinaryTree right, Entry<K, V> root){
        this.left = left;
        this.right = right;
        this.root = root;
    }

    public BinaryTree(Entry<K, V> root){
        this(null, null, root);
    }

    public BinaryTree getLeft(){
        return this.left;
    }
    public BinaryTree getRight(){
        return this.right;
    }
    public Entry<K, V> getRoot(){
        return this.root;
    }
    public K getKey(){
        return this.root.key;
    }

    public void setLeft(BinaryTree left){
        this.left = left;
    }

    public void setRight(BinaryTree right){
        this.right = right;
    }

    public void setRoot(Entry<K, V> root){
        this.root = root;
    }
}
