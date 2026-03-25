public class Rectangle {
    // length 
    // width 

    private int length; 
    private int width; 


    public Rectangle (int length, int width) {
        this.length = length; 
        this.width = width; 
    }

    public int getArea() {

        return length * width; 

    }

    public int getPerimeter() {
        return (length * 2) + (width * 2); 
        // add another rectangle? 
    }

    public boolean rectangleSize(Rectangle s2) {
    
        if (this.getArea() > s2.getArea()) {
            return true;
        } else{
            return false;
        }
    }

    public boolean isSquare(){
        if(this.length == this.width){
            return true;
        } else{
            return false;
        }


    }
    
    
    public static void main (String [] args) {
        Rectangle s1 = new Rectangle(3, 3);
        Rectangle s2 = new Rectangle(5, 6);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.rectangleSize(s2));
        System.out.println(s1.isSquare());
    }


}