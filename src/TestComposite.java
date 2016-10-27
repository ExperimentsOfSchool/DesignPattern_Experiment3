/**
 * Created by Lawrence Lee on 2016/10/27.
 *
 */
import Composite.*;
public class TestComposite {
    public static void main(String[] args) {
        Composite root = new Composite("DIR_ROOT");
        Composite dir_a = new Composite("DIR_A");
        Composite dir_b = new Composite("DIR_B");
        dir_a.addLeaf(new Leaf("File A"));
        dir_a.addLeaf(new Leaf("File B"));
        dir_a.addLeaf(new Leaf("File C"));
        dir_a.addLeaf(new Leaf("File D"));
        dir_a.addLeaf(new Leaf("File E"));
        dir_b.addLeaf(new Leaf("Config File"));
        root.addLeaf(dir_a);
        root.addLeaf(dir_b);
        root.showName(0);
    }
}
