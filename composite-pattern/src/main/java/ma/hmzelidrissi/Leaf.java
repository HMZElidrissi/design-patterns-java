package ma.hmzelidrissi;

/**
 * Leaf class represents individual objects in the Composite pattern.
 * Leaf objects have no children and implement the Component interface.
 */
public class Leaf implements Component {
    private String name;
    private int size;
    
    public Leaf(String name, int size) {
        this.name = name;
        this.size = size;
    }
    
    @Override
    public void display() {
        System.out.println("Leaf: " + name + " (Size: " + size + ")");
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public int getSize() {
        return size;
    }
} 