//package abstact;
//
//import java.util.Date;
//
//public class Phone extends Device implements Cloneable {
//    public Phone(String name) throws CloneNotSupportedException {
//        super(name);
//        game();
//    }
//    //Переопределить статический метод в наследнике нельзя
//    //НИКАК
////    @Override
//////    public static void printInfo(){
//////
//////    }
//    public void game() throws Throwable {
//        Phone phone = (Phone) this.clone();
//        phone.finalize();
//    }
//
//}
