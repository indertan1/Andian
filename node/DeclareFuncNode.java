package beans.node;


import beans.TableIdRow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by antonskripacev on 23.03.17.
 */
public class DeclareFuncNode extends AbstractNode {
    private TableIdRow id;
    private List<StatementNode> statementNodes = new ArrayList<StatementNode>();
    private List<String> labels = new ArrayList<String>();

    public TableIdRow getId() {
        return id;
    }

    public List<String> getLabels() {
        return labels;
    }

    public List<StatementNode> getStatementNodes() {
        return statementNodes;
    }

    public DeclareFuncNode(TableIdRow id, int type) {
        super(type);
        this.id = id;
    }
}
