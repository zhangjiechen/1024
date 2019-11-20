package top.codepig.Demo05;

public class Demo01Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();
        System.out.println("==================");
        person.name = "张洁晨" ;
        person.setAge(-20);
        person.show();
    }
}
