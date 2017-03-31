package beans.type;

import beans.AllType;
import beans.id.StructId;
import org.jetbrains.annotations.Nullable;

/**
 * Created by antonskripacev on 30.03.17.
 */
public class ArrayType extends  TypeVar{
    @Nullable public StructId structId;//if array is type of Struct
    @Nullable public AllType primitiveType;//if array is primitive type
    public int levels;//[][][] - levels = 3
}
