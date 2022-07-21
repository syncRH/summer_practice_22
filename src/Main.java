import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = List.of(
                new Cat("Серый", (float) 13.3333, (float) 2.77778, true, true),
                new Dog("Черный", (float) 4.8, (float) 2.5, true, true),
                new Horse("Бело-черный", (float) 24.4444, (float) 3.0, true, true),
                new Snail("В", (float) 0.013333333, (float) 0.0244445, true, false)
        );

        float metres = 5000;
        System.out.println("Время, за которое животные пройдут" + metres + "метров, равно:");
        for (var animal:animals){
            animal.getTimeOfTheRoute(metres);
        }
    }
}
