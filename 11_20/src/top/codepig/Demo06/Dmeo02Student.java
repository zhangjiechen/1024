package top.codepig.Demo06;

public class Dmeo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student();//无参构造
        System.out.println("============");
       Student stu2 = new Student("张洁晨",20);//全参构造
        System.out.println("姓名：" + stu2.getName()+"，年龄：" + stu2.getAge());
        //如果需要改变对象当中的成员变量数据内容，还是需要Setter
        stu2.setAge(21);
        System.out.println("姓名：" + stu2.getName()+"，年龄：" + stu2.getAge());
    }
}
