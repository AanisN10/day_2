
public class Rectangle {
    private int length;
    private int width;
    private int area;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        return length * width;
    }

    public boolean isSquare(){
         if (length==width){
             return true;
         }
         else {
             return false;
         }
    }

    }


