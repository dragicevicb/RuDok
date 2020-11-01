package tree;

import java.util.Objects;

public abstract class ONode {
    private String name;
    private ONode parent;

    public ONode(String name, ONode parent){
        this.name = name;
        this.parent = parent;
    }

    @Override
    public boolean equals(Object o) {
        if(o != null && o instanceof ONode){
            ONode obj = (ONode) o;
            return this.getName().equals(obj.getName());
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ONode getParent() {
        return parent;
    }

    public void setParent(ONode parent) {
        this.parent = parent;
    }
}
