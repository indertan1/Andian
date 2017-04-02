package beans.node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 * Created by antonskripacev on 31.03.17.
 */
public class SwitchNode extends StatementNode {
    public LinkedHashMap<String, ArrayList<StatementNode>> cases = new LinkedHashMap<String, ArrayList<StatementNode>>();

    public SwitchNode(int type) {
        super(type);
    }
}
