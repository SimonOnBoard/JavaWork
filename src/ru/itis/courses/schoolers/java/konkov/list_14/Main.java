package ru.itis.courses.schoolers.java.konkov.list_14;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("Ahahah");
        list.add("btw");
        list.add("xxxx");
        list.printAll();
        list.printAllReverseOrder();
        System.out.println("______________________________");
        MyList<Number> doubleMyList = new MyList<>();
        doubleMyList.add(234.43);
        doubleMyList.add(6536.53);
        doubleMyList.add(345254);
        doubleMyList.add(421324215);
        doubleMyList.printAllReverseOrder();
        
    }
}
