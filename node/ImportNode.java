package beans.node;

/**
 * Created by antonskripacev on 25.03.17.
 */
public class ImportNode extends AbstractNode {
    public static final int TYPE = 1;
    private  String fName;

    public ImportNode(String fName) {
        super(TYPE);
        this.fName = fName;
    }

    public String getFileName() {
        return fName;
    }
}
