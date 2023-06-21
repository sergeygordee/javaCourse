package oop26;

public class Program {
    public static void main(String[] args) {
        Type[] types  = Type.values();
        for (Type s: types) {
            System.out.println(s);
        }
        System.out.println();
        for (int i = 0; i < types.length; i++){
            System.out.println(types[i]);
        }
    }
}

enum Type {
    SCIENCE,
    PHANTASY,
    TECHNICAL
}