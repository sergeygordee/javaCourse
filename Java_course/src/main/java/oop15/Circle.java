package oop15;

public class Circle  extends Figure{
    private float radius;
    private float circleLength;

    private float pi = 3;

    Circle(float x, float y, float radius, float circleLength){
        super(x,y);
        this.circleLength = circleLength;
        this.radius = radius;
    }
    public float getPerimetr(){
        return 2 * radius * pi;
    }
    public float getArea(){
        return (pi * radius * radius);
    }
}
