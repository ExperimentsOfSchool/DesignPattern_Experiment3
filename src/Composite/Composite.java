package Composite;

import java.util.ArrayList;

/**
 * Created by Lawrence Lee on 2016/10/27.
 */
public class Composite extends Node {
    private ArrayList<Node> leaves;
    public Composite(String name) {
        super(name);
        this.leaves = new ArrayList<Node>();
    }
    @Override
    public void showName(int tabs) {
        for(int i = 0; i < tabs; i++) {
            System.out.print("\t");
        }
        System.out.println(this.name);
        for(Node leaf : leaves) {
            leaf.showName(tabs + 1);
        }
    }
    @Override
    public void addLeaf(Node node) {
        this.leaves.add(node);
    }
    @Override
    public void removeLeaf(Node node) {
        this.leaves.remove(node);
    }
}
