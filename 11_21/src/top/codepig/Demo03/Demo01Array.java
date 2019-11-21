package top.codepig.Demo03;

public class Demo01Array {
    public static void main(String[] args) {
        Person[] array = new Person[3];
//        System.out.println(array[0]);
        Person one = new Person("迪丽热巴",18);
        Person two = new Person("古力娜扎",19);
        Person three = new Person("马尔扎哈",38);
        array[0] = one;
        array[1] = two;
        array[2] = three;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=====================");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getName());
        }
        System.out.println(array.length);


    }
}
