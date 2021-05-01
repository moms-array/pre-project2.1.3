package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    private Animal animal;
    private Animal dog;

    @Autowired
    private Timer timer;

    public Timer getTimer() {
        return timer;
    }

    @Autowired
    @Qualifier("cat")
    public void setAnimal(Animal animal){
        this.animal = animal;
    }

    @Autowired
    @Qualifier("dog")
    public void setDog(Animal dog){
        this.dog = dog;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");

        System.out.println("Say:");
        System.out.println(dog.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}
