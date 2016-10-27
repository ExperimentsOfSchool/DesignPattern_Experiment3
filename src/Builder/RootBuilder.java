package Builder;

/**
 * Created by Lawrence Lee on 2016/10/27.
 *
 */
public class RootBuilder extends TreeBuilder {
    private TreeBuilder leftChild, rightChild;
    public RootBuilder(int maxDepth, int currentDepth) {
        super(maxDepth, currentDepth);
        if(currentDepth + 1 == maxDepth) {
            leftChild = new LeafBuilder(maxDepth, currentDepth + 1);
            rightChild = new LeafBuilder(maxDepth, currentDepth + 1);
        } else {
            leftChild = new RootBuilder(maxDepth, currentDepth + 1);
            rightChild = new RootBuilder(maxDepth, currentDepth + 1);
        }
    }
    @Override
    public void showLeftChild() {
        this.leftChild.level += (this.level.indexOf("_", 6) != -1 ? this.level.substring(this.level.indexOf("_", 6), this.level.length()) : "") + "_1";
        leftChild.showLevel();
    }
    @Override
    public void showRightChild() {
        this.rightChild.level += (this.level.indexOf("_", 6) != -1 ? this.level.substring(this.level.indexOf("_", 6), this.level.length()) : "") + "_2";
        rightChild.showLevel();
    }
}
