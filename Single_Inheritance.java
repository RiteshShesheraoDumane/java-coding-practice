
class father {
    void show() {
        System.out.println("This is show method of father class");
    }
}

class boy extends father {
    void disp() {
        System.out.println("This is disp method of child class");
    }
}

public class Single_Inheritance {
    public static void main(String[] args) {
        boy c = new boy();

        c.show();   // inherited method
        c.disp();   // child method
    }
}
