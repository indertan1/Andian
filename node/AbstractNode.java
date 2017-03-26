package beans.node;

import java.util.HashMap;
import java.util.List;

/**
 * Created by antonskripacev on 23.03.17.
 */

public class AbstractNode {
    public static final int STRUCT = 1;
    public static final int FUNC = 2;
    public static final int IMPORT = 3;
    public static final int LABEL = 4;

    int typeNode;

    public AbstractNode(int typeNode) {
        this.typeNode = typeNode;
    }
}









