
class Main {
    public static void main(String[] args) {
        MyTreeSet<Integer> test = new MyTreeSet<>();
        test.add(100);
        test.add(135);
        test.add(120);
        test.add(98);
        test.add(20);
        test.add(78);
        test.add(21);
        test.add(34);
        test.add(3);
        test.display();
        test.remove(135);
        test.display();
    }
}