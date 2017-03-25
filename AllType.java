package beans;

/**
 * Created by antonskripacev on 23.03.17.
 */
public enum AllType {
    INT("int"),
    FLOAT("float"),
    STRING("String"),
    BOOLEAN("boolean"),
    VOID("void");

    String value;

    AllType(String value) {
        this.value = value;
    }

    public static AllType getTypeByString(String valueL) {
        for(AllType t : AllType.values()) {
            if(t.value.equals(valueL)) {
                return t;
            }
        }

        return null;
    }
}
