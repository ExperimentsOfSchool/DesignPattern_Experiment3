package Builder;

/**
 * Created by Lawrence Lee on 2016/10/27.
 */
public class LeafBuilder extends TreeBuilder {
    public LeafBuilder(int maxDepth, int currentDepth) {
        super(maxDepth, currentDepth);
    }
    @Override
    public void showLeftChild() {
//        System.out.print("_1");
    }
    @Override
    public void showRightChild() {
//        System.out.print("_2");
    }
}
