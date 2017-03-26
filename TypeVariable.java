package beans;

/**
 * Created by antonskripacev on 25.03.17.
 */
public class TypeVariable {
    public static final int TYPE_PRIMITIVE = 0;
    public static final int TYPE_ARRAY = 1;
    public static final int TYPE_STRUCT = 2;

    private int type;
    private AllType name;// for primitives
    private TableIdRow ref;//for struct

    public int getType() {
        return type;
    }

    public AllType getName() {
        return name;
    }

    public TableIdRow getRef() {
        return ref;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setName(AllType name) {
        this.name = name;
    }

    public void setRef(TableIdRow ref) {
        this.ref = ref;
    }

    public TypeVariable(int type, AllType name, TableIdRow ref) {
        this.type = type;
        this.name = name;
        this.ref = ref;
    }

    @Override
    public boolean equals(Object t) {
        TypeVariable t1 = (TypeVariable)t;
        return t1.type == type && name == t1.name && ref.name == t1.ref.name;
    }
}
