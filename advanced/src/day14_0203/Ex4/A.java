package day14_0203.Ex4;

// default access modifier is - package-private
public class A {
    protected String field1;

    protected A() {

    }

    protected A(String field1) {
        this.field1 = field1;
    }

    protected void method1() {
        System.out.println("class A method1");
    }
}
