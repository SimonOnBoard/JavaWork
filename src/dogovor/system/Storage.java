package dogovor.system;

public class Storage {
    private static final int CAPACITY = 1000;
    private Dogovor[] dogovors;
    private static int counter = 0;

    public Storage() {
        this.dogovors =new Dogovor[CAPACITY];
    }

    public void add(Dogovor dogovor){
        dogovors[counter] = dogovor;
        counter++;
    }
    public void printAllInfo(){
        for(Dogovor dogovor: dogovors){
            dogovor.getInfo();
        }
    }
}
