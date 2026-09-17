class private_constructor_A {

    int a;
    String s;
    boolean b;

    private private_constructor_A() {
        a = 10;
        s = "ritesh";
        b = true;

        System.out.println(a + " " + s + " " + b);
    }

    public static void main(String[] args) {

    	private_constructor_A sc = new private_constructor_A();

    }
}
