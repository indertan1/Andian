package beans.node;

import beans.AllType;
import beans.TableIdRow;

/**
 * Created by antonskripacev on 23.03.17.
 */
public class LeftNode extends AbstractNode {
    AllType type; //int....int[].....Struct
    String idStruct;//T a = new T(); T - idStruct
    TableIdRow id;//T a = new T(); a - id
    String operator;// a.b .....  a[b]; . - operator, [] - operator
    TableIdRow subId;//a.b; b - subId

    public LeftNode(AllType type, String idStruct, TableIdRow id, String operator, TableIdRow subId, int typeNode, Class classNode) {
        super(typeNode);
        this.type = type;
        this.idStruct = idStruct;
        this.id = id;
        this.operator = operator;
        this.subId = subId;
    }
}
