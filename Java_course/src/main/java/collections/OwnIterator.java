package collections;

public interface OwnIterator<E>{
    E next();
    boolean hasNext();
    void remove();
}
