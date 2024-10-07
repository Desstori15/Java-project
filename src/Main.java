public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(1, 2));
        Subtractor subtractor = new Subtractor();
        System.out.println(subtractor.subtract(6, 3));


    }
}

class Adder {
    // created new branch and make extremely valuable contribution
    public Adder(){}
    public int add(int a, int b){
        return a + b;
    }
}