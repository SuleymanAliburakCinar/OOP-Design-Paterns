package patterns.structural.composite;

import java.util.Random;

public class File extends FileSystemItem {

    private static final Random RANDOM = new Random();
    private long size;

    public File(String name) {
        super(name);
        size = RANDOM.nextLong(999);
    }

    @Override
    public void display(String prefix) {
        System.out.println(prefix + "--" + getName() + " (" + getSize() + " mb)");
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public boolean delete() {
        Directory parent = getParent();
        if (parent != null) {
            parent.remove(this);
        }
        return true;
    }
}
