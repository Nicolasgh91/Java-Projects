class Outer {
    String name = "Outer";

    // Nested inner class
    class Inner {
        String name = "Inner";

        public void printTypeMethod() {
            System.out.println(name); // Inner
            System.out.println(Outer.this.name); // Outer
        }
    }
}

class Main {
    // Main driver method
    public static void main(String[] args) {
        Outer outerObj = new Outer();
        Outer.Inner innerObj  = outerObj.new Inner();
        innerObj.printTypeMethod();
    }
}