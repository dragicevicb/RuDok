package tree;

public class Workspace  extends OCompositeNode{

    public Workspace(String name){
        super(name, null);
    }


    @Override
    public void addChild(ONode o){
        if(o != null && o instanceof Project) {
            Project obj = (Project) o;
            if(!this.getChildren().contains(obj)){
                this.getChildren().add(obj);
            }
        }
    }
}
