public class Test {
    public String secretVar;

    public Test() {
        secretVar = "aiueo";
    }

    public static void main(String args[]) {
        Test test = new Test();
        System.out.println(test.secretVar);
    }
}
