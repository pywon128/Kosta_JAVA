package exam04;

import java.util.ArrayList;

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sayHello(){
        System.out.println("hello,"+name);
    }
}

/*
    ArrayList list = new ArrayList();
    와 같이 리스트를 생성하면 리스트에 온갖 자료형을 담을 수 있음
    리스트에 Person, shape, Employee 등을 담았을 때 리스트에 담긴
    데이터의 수 만큼 반복하여 그 요소에 따라 일처리를 시켜야하는데
    하나하나 instanceof 연산자로 확인하고 형변환 후 해당 클래스에 메서드를 호출해야 함 => 번거로움
    가능하면 Object 보다는 만든 class의 상속관계로 범위를 제한
    리스트에 담는 자료형 제한 => 제네릭

    ArrayList<Person> list < = new ArrayList<Person>;
    Person 만 담을 수 있음

 */

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(100);
        list.add("자바");
        list.add(true);
        list.add(new Person("홍길동", 20));
        list.add(2024);
        list.add(new Person("이순신", 21));

        for (int i = 0; i < list.size() ; i++) {
            Object obj = list.get(i);
            System.out.println(obj);
            // 리스트에 담긴 요소가 만약에 Person 이면 sayHello 동작을 실행하고 싶음
            if (obj instanceof Person){
                ((Person)obj).sayHello();
            }
        }

    }
}
