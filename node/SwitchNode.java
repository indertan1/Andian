package beans.node;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by antonskripacev on 31.03.17.
 */
public class SwitchNode extends StatementNode {
    public HashMap<String, ArrayList<StatementNode>> cases = new HashMap<String, ArrayList<StatementNode>>();

    public SwitchNode(int type) {
        super(type);
    }
}
