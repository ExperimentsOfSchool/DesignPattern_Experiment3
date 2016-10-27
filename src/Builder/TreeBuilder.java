package Builder;

/**
 * Created by Lawrence Lee on 2016/10/27.
 *
 */
public abstract class TreeBuilder {
    protected int maxDepth;
    protected int currentDepth;
    protected String level;
    public TreeBuilder(int maxDepth, int currentDepth) {
        this.maxDepth = maxDepth;
        this.currentDepth = currentDepth;
        this.level = "Level_" + currentDepth;
    }
    public abstract void showLeftChild();
    public abstract void showRightChild();
    public void showLevel() {
        for(int i = 0; i < this.currentDepth - 1; i++) {
            System.out.print("\t");
        }
        System.out.print(this.level);
        System.out.println("");
        this.showLeftChild();
        this.showRightChild();
    }
}
