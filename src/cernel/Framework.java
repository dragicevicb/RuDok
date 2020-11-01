package cernel;

public abstract class Framework {
    protected View view;
    protected Tree tree;

    public void initalise(View view, Tree tree){
        this.tree=tree;
        this.view=view;
    }

    public abstract void start();
}
