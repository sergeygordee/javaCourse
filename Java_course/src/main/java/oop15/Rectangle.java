package oop15;

public class Rectangle extends Figure{
    private float width;
    private  float height;
    Rectangle(float x, float y, float width, float height){
        super(x,y);
        this.width = width;
        this.height = height;
    }
    public float getPerimetr(){
        return width * 2 + height * 2;
    }
    public float getArea(){
        return (width * height);
    }
}
