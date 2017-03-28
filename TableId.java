package beans;

import beans.node.AbstractNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by antonskripacev on 23.03.17.
 */
public class TableId {
    private TableId parent;
    private List<TableIdRow> ids = new ArrayList<TableIdRow>();
    private boolean isHidden = false;
    private List<TableId> childTables;

    public void setHidden(boolean hidden) {
        isHidden = hidden;
    }

    public TableId getParent() {
        return parent;
    }

    public List<TableIdRow> getIds() {
        return ids;
    }

    public boolean isHidden() {
        return isHidden;
    }

    public List<TableId> getChildTables() {
        return childTables;
    }

    public TableId(TableId parent) {
        this.parent = parent;
    }

    /*
         0 - переменная
         1 - массив
         2 - функция
         3 - структура
         */
    public TableIdRow lookupUserIdTable(String varName, int typeId, TypeVariable type) {
        if(varName.equals("") || this.isHidden) {
            return null;
        }

        for(TableIdRow id : this.ids) {
            if(varName.equals(id.getName()) && type.equals(id.getType()) && typeId == id.getTypeId()) {
                return id;
            }
        }

        return null;
    }

    public static TableIdRow lookupUserIdTableRecursive(TableId table, String varName, int typeId) {
        if(table == null || varName.equals("") || table.isHidden) {
            return null;
        }

        for(TableIdRow id : table.ids) {
            if(varName.equals(id.getName()) && typeId == id.getTypeId()) {
                return id;
            }
        }

        return lookupUserIdTableRecursive(table.parent, varName, typeId);
    }
}
