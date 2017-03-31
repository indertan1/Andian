package beans.node.exp;

import beans.id.FuncId;
import beans.node.exp.ExpNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by antonskripacev on 31.03.17.
 */
public class FuncCallNode extends ExpNode {
    public List<ExpNode> args = new ArrayList<ExpNode>();
    public FuncId func;

    public FuncCallNode(int type) {
        super(type);
    }
}
