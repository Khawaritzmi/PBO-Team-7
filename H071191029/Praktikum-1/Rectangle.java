class Rectangle {
    private int length;
    private int width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle (int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        return length*width;
    }
}
