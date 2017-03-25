package beans.node;

import java.util.HashMap;
import java.util.List;

/**
 * Created by antonskripacev on 23.03.17.
 */

public class AbstractNode {
    public static final int INT = 0;
    public static final int FLOAT = 1;
    public static final int STRING = 2;
    public static final int BOOLEAN = 3;
    public static final int INT_ARR = 4;
    public static final int FLOAT_ARR = 5;
    public static final int STRING_ARR = 6;
    public static final int BOOLEAN_ARR = 7;
    public static final int STRUCT = 8;
    public static final int VOID = 9;

    public static final int ASSIGN_NODE = 0;
    public static final int LEFT_NODE = 1;
    public static final int EXP_NODE = 2;


    int typeNode;
    Class classNode;

    public AbstractNode(int typeNode) {
        this.typeNode = typeNode;
    }
}









