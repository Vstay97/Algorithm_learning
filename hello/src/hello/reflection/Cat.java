package hello.reflection;

public class Cat {
    private String name = "招财猫";
    public int age = 10;

    public Cat(){}

    public Cat(String name){
        this.name = name;
    }

    public void say(){
        System.out.println("我是"+name);
    }

    public void cry(){
        System.out.println(name+"哭了~");
    }

}
