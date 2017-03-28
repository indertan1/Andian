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

    private String name;
    private int typeId;//var, arr, func, struct
    private TypeVariable type;//also return value for function, null for struct
    private HashMap<TypeVariable, String> args;//for struct, functions. A tuple is (Type,ID)
    private boolean isInitialised = false;

    public String getName() {
        return name;
    }

    public int getTypeId() {
        return typeId;
    }

    public TypeVariable getType() {
        return type;
    }

    public HashMap<TypeVariable, String> getArgs() {
        return args;
    }

    public boolean isInitialised() {
        return isInitialised;
    }

    public void setInitialised(boolean initialised) {
        isInitialised = initialised;
    }

    public TableIdRow(String name, int typeId, TypeVariable type, HashMap<TypeVariable, String> args) {
        this.name = name;
        this.typeId = typeId;
        this.type = type;
        this.args = args;
    }

    @Override
    public boolean equals(Object obj) {
        TableIdRow row = (TableIdRow)obj;

        return row.name.equals(name) && row.typeId == typeId;
    }
}
