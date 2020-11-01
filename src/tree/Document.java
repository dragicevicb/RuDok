package tree;

public class Document extends OCompositeNode {

    public Document(String name, ONode parent){
        super(name,parent);
    }
    @Override
    public void addChild(ONode o){
        if(o != null && o instanceof Page){
            Page obj = (Page) o;
            if(!this.getChildren().contains(obj)){
                this.getChildren().add(obj);
            }
        }
    }
}
