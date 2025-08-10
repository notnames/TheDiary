class Parent {
    int value = 10;

    void setValue(int newValue) {
        this.value = newValue;  // 修改的是Parent类的value字段
    }

    void display() {
        System.out.println("Parent Display: " + value);
    }
}
