import java.util.*;

public class MyOtherClass extends MyClass {
    public List<Character> chars;

    @Override
    public void myMethod(String myString) {
        System.out.println("MyOtherClass.myMethod() called");

        super.myMethod(myString);

        char[] chars = myString.toCharArray();

        for(char c:chars){
            this.chars.add(c);
        }
    }

    public void wrapperMethod1(String myString){
        chars = new ArrayList<>();

        this.myMethod(myString);

        System.out.println(chars);
    }
}
