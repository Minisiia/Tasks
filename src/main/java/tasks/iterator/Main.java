package tasks.iterator;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {

//        List<String> fruits = new LinkedList<>();
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Grapes");
//        Iterator<String> iterator = fruits.iterator();
//        while (iterator.hasNext()) {
//            String fruit = iterator.next();
//            if (fruit.equals("Banana")) {
//                fruits.add("Mango");
//            }
//        }
//        System.out.println(fruits);

//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//        Iterator<Integer> iterator = numbers.iterator();
//        while (iterator.hasNext()) {
//            int number = iterator.next();
//            System.out.print(number + " ");
//            iterator.remove();
//        }
//        System.out.println();
//        System.out.println(numbers);

//        List<String> colors = new ArrayList<>();
//        colors.add("Red");
//        colors.add("Green");
//        colors.add("Blue");
//        Iterator<String> iterator = colors.iterator();
//        while (iterator.hasNext()) {
//            String color = iterator.next();
//            if (color.equals("Green")) {
//                iterator.remove();
//            } else if (color.equals("Red")) {
//                colors.set(1, "Yellow");
//            }
//        }
//        System.out.println(colors);

//        List<String> fruits = new LinkedList<>();
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Grapes");
//        Iterator<String> iterator = fruits.iterator();
//        String fruit = iterator.next();
//        System.out.println(fruit);

//        String[] names = {"Alice", "Bob", "Charlie"};
//        Iterator<String> iterator = Arrays.asList(names).iterator();
//        while (iterator.hasNext()) {
//            String name = iterator.next();
//            System.out.print(name + " ");
//        }

//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        Iterator<Integer> iterator = numbers.iterator();
//        iterator.next();
//        iterator.remove();
//        iterator.remove();
//        System.out.println(numbers);

//        // задание на изменение коллекции и перебор
//
//        ArrayList<Integer> al = new ArrayList<>();
//        //CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList<>();
//
//        al.add(2);
//        al.add(5);
//        al.add(8);
//        System.out.println(al);
//
//        // удаление элемента коллекции с помощью removeIf, цикла foreach и лямбда
//        //al.removeIf(a -> a.equals(5));
//
//        // удаление элемента коллекции с помощью removeIf, цикла foreach и анонимного класса
////        Predicate<Integer> lessThanFive = new Predicate<Integer>() {
////            @Override
////            public boolean test(Integer i) {
////                return i == 2;
////            }
////        };
////        al.removeIf(lessThanFive);
//
//        Iterator<Integer> iterator = al.iterator();
//
//        // изменить коллекцию после создания итератора
//        al.removeIf(a -> a.equals(5));
//
//        while (iterator.hasNext()) {
//            Integer temp = iterator.next();
//            //удаление с помощью итератора
//            //if (temp == 5) iterator.remove();
//            System.out.println(temp);
//        }
//        System.out.println("------------------");
    }
}
