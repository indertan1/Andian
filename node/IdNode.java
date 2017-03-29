package beans.node;

import beans.TableIdRow;

/**
 * Created by antonskripacev on 29.03.17.
 */
public class IdNode extends ExpNode {
    TableIdRow id;

    public IdNode(int type, TableIdRow id) {
        super(type);
        this.id = id;
    }
}
