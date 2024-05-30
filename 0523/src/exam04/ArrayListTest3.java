package exam04;

import java.util.ArrayList;

class Human{
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sayHello(){
        System.out.println("hello,"+name);
    }
}


public class ArrayListTest3 {
    public static void main(String[] args) {
        ArrayList<Human> list = new ArrayList();
        list.add(new Human("A",10));
        list.add(new Human("B",15));
        list.add(new Human("C", 20));

        for (Human human : list){
            human.sayHello();
        }

    }
}
