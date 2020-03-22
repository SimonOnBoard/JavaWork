package list;

public class Main {
    public static void main(String[] args) {
        List list = new List();
//        list.add("Кабинет 310");//0
//        list.add("Кабинет 320");//1
//        list.add("Кабинет 330");//2
        list.add(5);
        list.add(6);
        list.add(5464.43);
        list.printAll();
//        Elem elem = list.getHead();
//        int counter = 0;
//        while(elem != null){
//            if(counter == 2){
//                System.out.println(elem.getValue());
//                break;
//            }
//            else {
//                counter++;
//                elem = elem.getNext();
//            }
//        }
        System.out.println(list.delete(5));
        list.printAll();
        System.out.println("======================================================================================");
        System.out.println(list.insert(3241243,1));
        list.printAll();
    }
}
