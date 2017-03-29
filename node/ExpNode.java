package beans.node;

import beans.TypeVariable;

import java.util.List;

/**
 * Created by antonskripacev on 26.03.17.
 */
public class ExpNode extends StatementNode {
    private TypeVariable typeExp;
    private String operator;
    private ExpNode firstOperand;
    private ExpNode secondOperand;

    public ExpNode(int type) {
        super(type);
    }

    public ExpNode getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(ExpNode firstOperator) {
        this.firstOperand = firstOperand;
    }

    public ExpNode getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(ExpNode secondOperand) {
        this.secondOperand = secondOperand;
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
