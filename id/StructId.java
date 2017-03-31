package beans.id;

import beans.type.TypeVar;

import java.util.HashMap;

/**
 * Created by antonskripacev on 30.03.17.
 */
public class StructId extends IdRow {
    public HashMap<TypeVar, String> properties = new HashMap<TypeVar, String>();
}
