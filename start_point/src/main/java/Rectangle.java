
public class Rectangle {
    private int length;
    private int width;
    private int area;

    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        return this.length * this.width;
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


