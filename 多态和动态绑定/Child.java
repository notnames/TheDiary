class Child extends Parent {
    int value = 20;  // 隐藏父类的value字段，而非覆盖

    @Override
    void display() {
        // 这里访问的是子类自己的value字段
        System.out.println("Child Display: " + value);
    }
}
