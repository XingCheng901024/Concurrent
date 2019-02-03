package base;

public class Test {
    final String name;
    public Test(String name){
        this.name = name;
        print(name);
    }
    public void print(String name){
        System.out.println(name);
    }
}
