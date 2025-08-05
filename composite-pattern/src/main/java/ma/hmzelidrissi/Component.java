package ma.hmzelidrissi;

/**
 * Component interface that defines the common interface for both leaf and composite objects.
 * This is the core of the Composite pattern.
 */
public interface Component {
    /**
     * Display the component information
     */
    void display();
    
    /**
     * Get the name of the component
     */
    String getName();
    
    /**
     * Get the size of the component
     */
    int getSize();
} 