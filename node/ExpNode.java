package beans.node;

import beans.AllType;

import java.util.List;

/**
 * Created by antonskripacev on 23.03.17.
 */
public class ExpNode extends AbstractNode {
    AllType type;
    String operator;
    List<ExpNode> operands;
    Class expClass;

    public ExpNode(AllType type, String operator, List<ExpNode> operands, Class expClass, int typeNode, Class classNode) {
        super(typeNode);
        this.type = type;
        this.operator = operator;
        this.operands = operands;
        this.expClass = expClass;
    }
}
