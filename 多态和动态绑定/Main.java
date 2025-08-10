public class Main {
    public static void main(String[] args) {
        Parent parentRef = new Child();  // 父类引用指向子类对象

        System.out.println("Before set:");
        // 字段访问由引用类型决定（Parent），所以输出10
        System.out.println("parentRef.value: " + parentRef.value);  
        // 方法调用由实际对象类型决定（Child），所以输出子类的display
        parentRef.display();  

        parentRef.setValue(30);  // 调用Parent类的方法，修改Parent的value

        System.out.println("\nAfter set:");
        // 仍然通过Parent引用访问，此时Parent的value已被改为30
        System.out.println("parentRef.value: " + parentRef.value);  
        // 方法仍然调用子类的实现，子类的value未被修改，还是20
        parentRef.display();  

        // 强制类型转换为子类引用
        Child childRef = (Child) parentRef;
        // 通过子类引用访问子类的value，输出20
        System.out.println("childRef.value: " + childRef.value);  
        // 强制转换为Parent引用，访问父类的value，输出30
        System.out.println("((Parent)childRef).value: " + ((Parent)childRef).value);  
    }
}
