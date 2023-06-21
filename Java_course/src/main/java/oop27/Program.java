package oop27;

public class Program {
    public static void main(String[] args) {
        System.out.println(Colors.RED.getCode());
    }
}

enum Colors{
    RED("123"),
    GREEN("456"),
    BLACK("789");
    private String code;
    Colors(String code){
        this.code = code;
    }
    public String getCode(){
        return code;
    }
}
