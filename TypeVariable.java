package beans;

/**
 * Created by antonskripacev on 25.03.17.
 */
public class TypeVariable {
    public static final int TYPE_PRIMITIVE = 0;
    public static final int TYPE_ARRAY = 0;
    public static final int TYPE_STRUCT = 0;

    private int type;
    private AllType name;// for primitives
    private TableIdRow ref;//for struct

    public TypeVariable(int type, AllType name, TableIdRow ref) {
        this.type = type;
        this.name = name;
        this.ref = ref;
    }
}
