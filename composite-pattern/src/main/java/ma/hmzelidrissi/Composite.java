package ma.hmzelidrissi;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite class represents composite objects that can contain other components.
 * It implements the Component interface and manages a collection of child components.
 */
public class Composite implements Component {
    private String name;
    private List<Component> children;
    
    public Composite(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }
    
    /**
     * Add a child component to this composite
     */
    public void add(Component component) {
        children.add(component);
    }
    
    /**
     * Remove a child component from this composite
     */
    public void remove(Component component) {
        children.remove(component);
    }
    
    /**
     * Get a child component by index
     */
    public Component getChild(int index) {
        return children.get(index);
    }
    
    @Override
    public void display() {
        System.out.println("Composite: " + name + " (Total Size: " + getSize() + ")");
        for (Component child : children) {
            System.out.print("  ");
            child.display();
        }
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public int getSize() {
        int totalSize = 0;
        for (Component child : children) {
            totalSize += child.getSize();
        }
        return totalSize;
    }
    
    /**
     * Get the number of children in this composite
     */
    public int getChildCount() {
        return children.size();
    }
} 