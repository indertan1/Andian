package beans.node;

import beans.AllType;


import java.util.List;

/**
 * Created by antonskripacev on 23.03.17.
 */
public class ConstNode extends AbstractNode {
    Integer iVal;//also size array
    Float fVal;
    String sVal;
    Boolean bVal;

    public ConstNode(Integer iVal, Float fVal, String sVal, Boolean bVal, int typeNode) {
        super(typeNode);
        this.iVal = iVal;
        this.fVal = fVal;
        this.sVal = sVal;
        this.bVal = bVal;
    }
}
