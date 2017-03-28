package beans.node;

import beans.TypeVariable;

/**
 * Created by antonskripacev on 26.03.17.
 */
public class ConstNode extends ExpNode {
    private String value;
    private TypeVariable typeNode;

    public ConstNode(int type, String value, TypeVariable typeNode) {
        super(type);
        this.value = value;
        this.typeNode = typeNode;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TypeVariable getTypeNode() {
        return typeNode;
    }

    public void setTypeNode(TypeVariable typeNode) {
        this.typeNode = typeNode;
    }
}
