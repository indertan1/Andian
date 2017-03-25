package beans.node;


import beans.TypeControl;

import java.util.List;

/**
 * Created by antonskripacev on 23.03.17.
 */
public class ControlNode {
    TypeControl typeControl;
    AssignNode declaration; // for(int i = 0;.....
    List<ExpNode> exps;//only one for if, while, dowhile,for; several for switch
    AssignNode assign; // for(......i = i + 1)
    List<StatementNode> statements;

    public ControlNode(TypeControl typeControl, AssignNode declaration, List<ExpNode> exps, AssignNode assign, List<StatementNode> statements) {
        this.typeControl = typeControl;
        this.declaration = declaration;
        this.exps = exps;
        this.assign = assign;
        this.statements = statements;
    }
}
