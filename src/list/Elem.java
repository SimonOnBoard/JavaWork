package list;

public class Elem<N> {
    private N value;
    private Elem next;

    public Elem(N value, Elem next) {
        this.value = value;
        this.next = next;
    }

    public Elem(N value) {
        this(value,null);
    }

    public N getValue() {
        return value;
    }

    public void setValue(N value) {
        this.value = value;
    }

    public Elem getNext() {
        return next;
    }

    public void setNext(Elem next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Elem{" +
                "value='" + value + '\'' +
                ", next=" + next +
                '}';
    }
}
