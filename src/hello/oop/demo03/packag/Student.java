package hello.oop.demo03.packag;

public class Student {
    /**
     * 属性私有
     */
    private String name;
    private int id;
    private char sex;
    private int age;

    /**
     * 提供一些可以操作这些属性的方法
     * 提供一些public的get set方法
     */
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 120 || age < 0) {
            this.age = 3;
        } else {
            this.age = age;
        }
    }
}
