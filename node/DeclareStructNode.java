package beans.node;


import beans.TableIdRow;

/**
 * Created by antonskripacev on 23.03.17.
 */
public class DeclareStructNode extends AbstractNode {
    TableIdRow id;

    public DeclareStructNode(TableIdRow id, int type) {
        super(type);
        this.id = id;
    }
}
