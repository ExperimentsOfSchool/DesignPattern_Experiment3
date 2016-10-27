package Composite;

/**
 * Created by Lawrence Lee on 2016/10/26.
 * 
 */
public abstract class Node {
    protected String name;
    public Node(String name) {
        this.name = name;
    }
    public abstract void showName(int tabs);
    public abstract void addLeaf(Node node);
    public abstract void removeLeaf(Node node);
}
