public class Rectangle implements RectangleInterface, Comparable<Rectangle> { 
    
    private double length;
    private double width;
     
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;    
    } 
    
    public double getLength() {
        return length;
    }
	
    public double getWidth() {
        return width;
    }
    
    public double getPerimeter(){
        return 2*(width + length);
    }
    
    public int compareTo(Rectangle other) {
        return Double.compare(getPerimeter(), other.getPerimeter());
    }   
}
