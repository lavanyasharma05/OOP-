class Parent {
    final int x = 10;

    void show() {
        System.out.println("Value of x: " + x);
        //  Error if we try: x = 20;
    }
}

//output

class FinalVariableDemo {
    // final variable
    final int speedLimit = 90;

    void changeLimit() {
         speedLimit = 120;  
        System.out.println("Speed Limit is: " + speedLimit);
    }

    public static void main(String[] args) {
        FinalVariableDemo obj = new FinalVariableDemo();
        obj.changeLimit();
    }
}

//output
//error
