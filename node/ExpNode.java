package beans.node;

import beans.TypeVariable;

import java.util.List;

/**
 * Created by antonskripacev on 26.03.17.
 */
public class ExpNode extends StatementNode {
    private TypeVariable typeExp;
    private String operator;
    private ExpNode firstOperator;
    private ExpNode secondOperator;

    public ExpNode(int type) {
        super(type);
    }

    public ExpNode getFirstOperator() {
        return firstOperator;
    }

    public void setFirstOperator(ExpNode firstOperator) {
        this.firstOperator = firstOperator;
    }

    public ExpNode getSecondOperator() {
        return secondOperator;
    }

    public void setSecondOperator(ExpNode secondOperator) {
        this.secondOperator = secondOperator;
    }

    public void setTypeExp(TypeVariable typeExp) {
        this.typeExp = typeExp;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public TypeVariable getTypeExp() {
        return typeExp;
    }
}
