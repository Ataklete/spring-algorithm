public class MyOuterClass {

    private MyInner inner;
    public MyInner getMyInner(){
        return inner;
    }

    private class MyInner {
        private int innerInt;
        MyInner(int x ){
            innerInt = x;
        }
    }

    public static void main(String[] args) {
        MyOuterClass mc = new MyOuterClass();
        MyInner mi = mc.new MyInner(5);
//        mi.getMyInner();
        System.out.println(mi.innerInt);
    }
}
