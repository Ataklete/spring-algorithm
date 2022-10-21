public class Test1 {
    public void print(Integer i) {
        System.out.println("Integer");
    }

//    public void print(int i) {
//        System.out.println("int");
//    }

    public void print(long i) {
        System.out.println("long");
    }

    public static void main(String args[]) {
        Test1 test = new Test1();
        test.print(10);
        String name = "haile";
        name = "ate";
        changeToHomer(name);
        System.out.println(" first " + name );
    }

    static void changeToHomer(String name) {
        name = "Homer";
        System.out.println("name " + name);
    }
}