package patterns.structural.composite;

public class Driver {
    public static void main(String[] args) {
        Directory dir = new Directory("Directory");

        Directory s1 = new Directory("Sub 1");
        Directory s2 = new Directory("Sub 2");
        Directory s3 = new Directory("Sub 3");

        File file1 = new File("File 1");
        File file2 = new File("File 2");
        File file3 = new File("File 3");
        File file4 = new File("File 4");
        File file5 = new File("File 5");
        File file6 = new File("File 6");
        File file7 = new File("File 7");
        File file8 = new File("File 8");
        File file9 = new File("File 9");

        s3.add(file9);

        s2.add(file8);
        s2.add(file7);
        s2.add(s3);

        s1.add(file6);
        s1.add(file5);
        s1.add(file4);

        dir.add(file3);
        dir.add(file2);
        dir.add(file1);
        dir.add(s1);
        dir.add(s2);

        dir.display();

        s1.delete();
        System.out.println("\n--------------------------------------------\n");
        dir.display();

        s2.delete();
        System.out.println("--------------------------------------------\n");
        dir.display();
    }
}
