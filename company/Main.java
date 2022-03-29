package com.company;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        //Задания 1 и 2
        ArrayList<String> car = new ArrayList<String>();
        car.add("car_1");
        car.add("car_2");
        car.add("car_3");
        car.add("car_4");
        car.add(4, "car_5");
        car.add(5, "car_6");
        car.add(6, "car_7");

        System.out.printf("ArrayList has %d elements \n", car.size());
        for (String p : car) {

            System.out.println(p);
        }
        // проверяем наличие элемента
        if (car.contains("car_1")) {

            System.out.println("ArrayList contains car_1");
        }
        if (car.indexOf("car_5") == 4) {

            System.out.println("ArrayList contains car_5");
        }
        System.out.println(car.get(5));
        car.remove("car_1");
        car.remove(5);

        //Задания 3; 4; 6; 8; 9
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(23);
        num.add(43);
        num.add(23);
        num.add(216);
        num.add(53);
        num.add(23);
        num.add(4);
        num.add(6);
        num.add(33);
        num.add(45);
        num.add(67);
        num.add(2);
        int b=0,m=0;

        System.out.printf("ArrayList has %d elements \n", num.size());
      for (Integer p : num) {
    System.out.println(p);
}
      for (int i=0;i<num.size();i++) {
          if (num.get(i) > 45) {
              b++;
          }
      }
        for (int i=0;i<num.size();i++) {
            if (num.get(i) < 45) {
                m++;
            }
        }

          System.out.println("Чисел больше чем 45 - " + b);
          System.out.println("Чисел меньше чем 45 - " + m);
          System.out.println("Максимальный элемент списка - " + (Collections.max(num)));
          System.out.println("Минимальный элемент списка - " + (Collections.min(num)));
          Collections.sort(num);
          System.out.println("Отсортированный список:");
          for (Integer p : num) {
              System.out.println(p);
          }


   //     Задание 5
        List<String> city = new ArrayList<String>(Arrays.asList(
                "LA",
                "New York",
                "San Francisco",
                "Paris",
                "Moscow",
                "Tokyo",
                "Philadelphia"));
        city.forEach((n) -> System.out.println("В позиции " + city.indexOf(n) + " содержится " + n));

        //     Задание 7
        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(3,9,2,12,4,5,11,13));
        Integer sum = 0;
        for (Integer value : numbers) {
            sum += (value+3);
        }
        System.out.println("Результат: " + sum);

    // Задание 10

        List<Person> student = new ArrayList<Person>();
        student.add(new Person("Atai",19));
        student.add(new Person("Nursultan", 17));
        student.add(new Person("Erjan",20));
        student.add(new Person("Erbol",21));
        student.add(new Person("Ramazan",15));
        student.add(new Person("Dastan", 21));
        student.add(new Person("Aida", 26));
        student.add(new Person("Kairat",40));
        student.add(new Person("Aibek",12));
        student.add(new Person("Adelya",21));
        student.add(new Person("Aidana", 15));

        for (Person st:student){
            System.out.println("Name of Student:   " + st.getName()+"  students age:  " + st.getAge());
        }
        System.out.println("Student, who is then 18 age");
        int i=0;
        for (Person st:student){
            if (st.getAge()>=18) {
                i++;
                System.out.println("Name of Student:   " + st.getName()+"  students age:  " + st.getAge());
            }
        }
        System.out.println("Count of Student, who is then 18 age - " + i);

//        //Полиморфизм Задание 1
//        MathOperation math = new MathOperation();
//        System.out.println(math.add(2, 2));
//        System.out.println(math.add(3, 3, 3));
//        System.out.println(math.add(4, 4, 4, 4));
//
//        //Полиморфизм Задание 2
//        Shape rect = new Rectangle(4.0,5.0);
//        System.out.println("Периметр: "+ rect.calculatePerimeter());
//        System.out.println("Площадь: "+ rect.calculateArea());
//        Shape circle = new Circle(2.0);
//        System.out.println("Периметр: "+ circle.calculatePerimeter());
//        System.out.println("Площадь: "+ circle.calculateArea());
//
//        //Полиморфизм Задание 3
//        Animal cat = new Cat("Peter", "Whiskas");
//        Animal dog = new Dog("Rocky", "Meat");
//        System.out.println(cat.manageSelf());
//        System.out.println(dog.manageSelf());
    }
}




