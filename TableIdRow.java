package beans;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;

/**
 * Created by antonskripacev on 23.03.17.
 */
public class TableIdRow {
    public static final int TYPE_VAR = 0;
    public static final int TYPE_FUNC = 2;
    public static final int TYPE_STRUCT = 3;

    String name;
    int typeId;//var, arr, func, struct
    TypeVariable type;//also return value for function, null for struct
    HashMap<TypeVariable, String> args;//for struct, functions. A tuple is (Type,ID)

    public TableIdRow(String name, int typeId, TypeVariable type, HashMap<TypeVariable, String> args) {
        this.name = name;
        this.typeId = typeId;
        this.type = type;
        this.args = args;
    }
}
