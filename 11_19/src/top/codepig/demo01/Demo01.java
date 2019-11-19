package top.codepig.demo01;

/*public class Demo01 {
    *//*public static void main(String[] args) {*//*
*//*        for (int j = 0; j < 5; j++) {
            for(int i = 0;i<20; i++){
//            System.out.println("*");
                System.out.print("*");
            }
            System.out.println();
        }

    }*//*
    }*/

/*
方法的定义格式:
public static void 方法名称(){
    方法体
}
注意事项:
方法定义不能嵌套
 */
public class Demo01{
        public static void main(String[] args) {
            printMethod();
        }
        public static void printMethod() {
            for (int j = 0; j < 5; j++) {
                for (int i = 0; i < 20; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }


        }
}
