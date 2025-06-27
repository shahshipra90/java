class Engine {
    void startEngine() {
        System.out.println("Engine started");
    }
}

class CarWithEngine {
    private Engine eng;

    CarWithEngine() {
        eng = new Engine();
    }

    void startCar() {
        System.out.println("Car started");
        eng.startEngine();
    }
}

public class Composition {
    public static void main(String[] args) {
        CarWithEngine car = new CarWithEngine();
        car.startCar();
    }
}
