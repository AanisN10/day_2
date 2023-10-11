public class Rectangle {

    private int length;
    private int width;

    Rectangle(int length, int width){

        this.length = length;
        this.width = width;
    }

    public int area(){
        return length * width;
    }

    public boolean isRectangle(){
        if (length != width){
            return true;
        }else{
            return false;
        }
    }
}
