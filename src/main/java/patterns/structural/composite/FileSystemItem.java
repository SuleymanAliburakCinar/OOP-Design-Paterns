package patterns.structural.composite;

public abstract class FileSystemItem {

    private String name;
    private Directory parent;

    protected FileSystemItem(String name) {
        this.name = name;
    }

    public abstract void display(String prefix);

    public abstract long getSize();

    public abstract boolean delete();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Directory getParent() {
        return parent;
    }

    public void setParent(Directory parent) {
        this.parent = parent;
    }
}
