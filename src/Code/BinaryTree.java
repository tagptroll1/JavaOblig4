package Code;

import Exception.EmptyTreeException;

public class BinaryTree<T> {
    private BinaryNode<T> root;

    public BinaryTree(){
        this.root = null;
    }

    public BinaryTree(T root){
        this.root = new BinaryNode<>(root);
    }

    public BinaryTree(T data, BinaryTree<T> leftTree, BinaryTree<T> rightTree){
        privateSetTree(data, leftTree, rightTree);
    }

    public void setTree(T data){
        root = new BinaryNode<>(data);
    }

    public void setTree(T data, BinaryTree<T> leftTree, BinaryTree<T> rightTree){
        privateSetTree(data, leftTree, rightTree);
    }

    private void privateSetTree(T data, BinaryTree<T> leftTree, BinaryTree<T> rightTree){
        root = new BinaryNode<>(data);

        if ((leftTree != null) && !leftTree.isEmpty()){
            root.setLeft(leftTree.root);
        }
        if ((rightTree != null) && !rightTree.isEmpty()){
            if (rightTree != leftTree){
                root.setRight(rightTree.root);
            } else {
                root.setRight(rightTree.root.copy());
            }
        }
        if ((leftTree != null) && (leftTree != this)){
            leftTree.clear();
        }
        if ((rightTree != null) && (rightTree != this)){
            rightTree.clear();
        }
    }

    public T getRootData(){
        if (isEmpty()){
            throw new EmptyTreeException();
        } else {
            return root.getData();
        }
    }

    public BinaryNode<T> getRootNode(){
        return this.root;
    }

    public void setRoot(T data){
        this.root.setData(data);
    }

    public void setRootNode(BinaryNode<T> node){
        this.root = node;
    }

    public int getHeight(){
        return this.root.getHeight();
    }

    public int getNumberOfNodes(){
        return this.root.getNumberOfNodes();
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void clear(){
        this.root = null;
    }

}
