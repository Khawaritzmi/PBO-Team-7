package AtBeCo;

class Box {
    // ATTRIBUTE
    private double width;
    private double height;
    private double depth;
    private double mass;
    private double density;


    // CONSTRUCTOR
	public Box(double width, double heigth, double depth) {
        setDepth(depth);
        setHeight(height);
        setWidth(width);
        // this.width = width;
        // this.height = heigth;
        // this.depth = depth;
    }
    
    // BEHAVIOUR
	public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setDepth(double depth) {
        this.depth = depth;
    }
    public void setMass(double mass) {
        this.mass = mass;
    }
    public double getDensity() {
        return mass/(width*depth*height);
    }
}