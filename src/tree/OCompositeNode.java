package tree;

import java.lang.reflect.Array;
import java.util.ArrayList;

public  abstract class OCompositeNode extends ONode {
    ArrayList<ONode> children;

    public OCompositeNode(String name, ONode parent){
        super(name, parent);
        this.children = new ArrayList<>();
    }

    public OCompositeNode(String name, ONode parent, ArrayList<ONode> children){
        super(name, parent);
        this.children = children;
    }

    public abstract void addChild(ONode child);

    public ArrayList<ONode> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<ONode> children) {
        this.children = children;
    }
}
