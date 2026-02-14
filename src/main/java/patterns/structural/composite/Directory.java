package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemItem {

    private final List<FileSystemItem> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void add(FileSystemItem item) {
        children.add(item);
        item.setParent(this);
    }

    public void remove(FileSystemItem item) {
        children.remove(item);
        item.setParent(null);
    }

    @Override
    public void display(String prefix) {
        System.out.println(prefix + getName() + " (" + getSize() + " mb)");
        for (FileSystemItem child : children) {
            child.display(prefix + "    ");
        }
    }

    public void display() {
        display("");
    }

    @Override
    public long getSize() {
        long size = 0;
        for (FileSystemItem child : children) {
            size += child.getSize();
        }
        return size;
    }

    @Override
    public boolean delete() {
        for (FileSystemItem child : new ArrayList<>(children)) {
            child.delete();
        }

        Directory parent = getParent();
        if (parent != null) {
            parent.remove(this);
        }

        return true;
    }
}
