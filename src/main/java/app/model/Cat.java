package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cat")
public class Cat extends Animal {

    @Override
    public String toString() {
        return "Im a Cat";
    }
}
