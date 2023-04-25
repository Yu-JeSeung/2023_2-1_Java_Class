package middle_test;

public class JGenericEx {
    public static void main(String[] args) {
        JGeneric<String>js = new JGeneric<String>("Hello","Java");
        System.out.println(js.first());
        System.out.println(js.second());
        System.out.println("두 매개변수가 같나요? (true/false) "+js.equal());
    }
}
class JGeneric<W> {
    private W x, y;
    public JGeneric(W x, W y) {
        this.x = x;
        this.y = y;
    }

    public W first(){
        return x;
    }
    public W second(){
        return y;
    }
    public boolean equal(){
        return x.equals(y);
    }
}