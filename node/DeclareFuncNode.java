package beans.node;


import beans.id.FuncId;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by antonskripacev on 23.03.17.
 */
public class DeclareFuncNode extends AbstractNode {
    private FuncId id;
    private List<StatementNode> statementNodes = new ArrayList<StatementNode>();
    private List<String> labels = new ArrayList<String>();

    public FuncId getId() {
        return id;
    }

    public List<String> getLabels() {
        return labels;
    }

    public List<StatementNode> getStatementNodes() {
        return statementNodes;
    }

    public DeclareFuncNode(FuncId id, int type) {
        super(type);
        this.id = id;
    }
}
