package tree;

public class Project extends OCompositeNode {

    public Project(String name, ONode parent){
        super(name, parent);
    }

    @Override
    public void addChild(ONode o) {
        if(o != null && o instanceof Document){
            Document obj = (Document) o;
            if(!this.getChildren().contains(obj)){
                this.getChildren().add(obj);
            }
        }
    }
}
