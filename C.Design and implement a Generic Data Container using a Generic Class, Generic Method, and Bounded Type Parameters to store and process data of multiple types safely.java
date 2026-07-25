class Data<T> {

    T value;

    Data(T value) {
        this.value = value;
    }

    void display() {
        System.out.println(value);
    }

    public static void main(String[] args) {

        Data<Integer> d1 = new Data<>(100);
        Data<String> d2 = new Data<>("Hello");

        d1.display();
        d2.display();
    }
}
