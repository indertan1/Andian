package beans.node;


import beans.TableIdRow;
import java.util.List;

/**
 * Created by antonskripacev on 23.03.17.
 */
public class DeclareFuncNode extends AbstractNode {
    TableIdRow id;
    List<StatementNode> statements;

    public DeclareFuncNode(TableIdRow id, List<StatementNode> statements, int typeNode, Class classNode) {
        super(typeNode);
        this.id = id;
        this.statements = statements;
    }
}
