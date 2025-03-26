package Mutable;
public  class parent {
    private final int age;
    private final String name;
    public parent(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    // public void setAge(int age) {
    //     this.age = age;
    // }
    public String getName() {
        return name;
    }
    // public void setName(String name) {
    //     this.name = name;
    // }
    
    void fun(){
        System.out.println("Fun1");
    }

    public static void fun1(){
        System.out.println("Parent class fun1 is called");
    }

}
