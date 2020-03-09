package nis1;

class Box{
    private double width;
    private double height;
    private double depth;
    private double mass;

    public Box (Double width, Double height){
        this.width = width;
        this.height = height;
    }

    public Box (double width, double height, double depth, double mass){
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.mass = mass;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight (double height){
        this.height = height;

    }
    public void setDepth (double depth){
        this.depth = depth;
    }
    public double getDensity(){
        return mass / (width*height*depth);

    }


}