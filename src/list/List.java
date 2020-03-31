package list;

public class List<T> {
    private Elem<T> head;
    private Elem<T> tail;
    public Elem<T> getHead() {
        return head;
    }

    public List() {
    }

    public void add(T value){
        Elem<T> elem = new Elem(value,null);
        if(head == null){
            head = elem;
            tail = head;
            return;
        }
        tail.setNext(elem);
        tail = elem;
    }
    public boolean delete(T value){
        if(this.head == null) return false;
        Elem prev = this.head;
        if(prev.getNext() == null){
            boolean check = checkElement(prev,value);
            if(check) {
                head = null;
                tail = null;
                return true;
            }
            return false;
        } else{
            boolean check = checkElement(prev,value);
            if(check) {
                head = head.getNext();
                return true;
            }
        }
        Elem current = this.head.getNext();
        while (current != null){
            if (current.getValue().equals(value)){
                prev.setNext(current.getNext());
                return true;
            }
            else {
                prev = current;
                current = current.getNext();
            }
        }
        return false;
    }
    public void printAll(){
        int position = 0;
        Elem elem = this.head;
        while (elem != null){
            System.out.println(elem +  " Position " + position);
            position++;
            elem = elem.getNext();
        }
    }
    private boolean checkElement(Elem prev, T value) {
        if(prev.getValue().equals(value)){
            return true;
        }
        else {
            return false;
        }
    }
    public static void printAll(List<?> list){
        int position = 0;
        Elem elem = list.getHead();
        while (elem != null){
            System.out.println(elem +  " Position " + position);
            position++;
            elem = elem.getNext();
        }
    }
//    public boolean delete(int number){
//
//    }
    public boolean insert(T value,int position){
        int counter = 1;
        if(head == null && position != 0) return false;
        if(head == null) { this.add(value);}
        if(position == 0) { Elem elem = new Elem(value); elem.setNext(head); head = elem; return true;}
        Elem prev = this.head;
        Elem current = prev.getNext();
        while (current != null){
            if(counter == position){
                Elem<T> elem = new Elem(value);
                elem.setNext(current);
                prev.setNext(elem);
                return true;
            }
            else{
                prev = current;
                current = current.getNext();
                counter++;
            }
        }
        if(counter == position){
            Elem elem = new Elem(value);
            prev.setNext(elem);
            return true;
        }
        return false;
    }
}
