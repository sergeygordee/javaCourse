package oop36;

public interface Accountable<T> {
    T getId();
    int getSum();
    void setSum(int sum);
}
