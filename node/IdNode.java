package beans.node;

import beans.AllType;
import beans.TableIdRow;
import beans.node.ExpNode;

import java.util.List;

/**
 * Created by antonskripacev on 23.03.17.
 */
public class IdNode extends ExpNode {
    TableIdRow id;

    public IdNode(TableIdRow id, AllType type, String operator, List<ExpNode> operands, Class expClass, int typeNode, Class classNode) {
        super(type, operator, operands, expClass, typeNode, classNode);
        this.id = id;
    }
}
