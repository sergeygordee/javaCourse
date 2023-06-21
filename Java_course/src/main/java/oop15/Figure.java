package oop15;

abstract class Figure {
    float x;
    float y;

    Figure(float x, float y){
        this.x = x;
        this.y = y;
    }
    public abstract float getPerimetr();
    public abstract float getArea();

}
