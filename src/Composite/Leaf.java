package Composite;

/**
 * Created by Lawrence Lee on 2016/10/26.
 *
 */
public class Leaf extends Node {
    public Leaf(String name) {
        super(name);
    }
    @Override
    public void showName(int tabs) {
        for(int i = 0; i < tabs; i++) {
            System.out.print("\t");
        }
        System.out.println(this.name);
    }
    @Override
    public void addLeaf(Node node) {
        System.err.println("Cannot add any node under a leaf node.");
    }
    @Override
    public void removeLeaf(Node node) {
        System.err.println("Cannot remove any node under a leaf node.");
    }
}
