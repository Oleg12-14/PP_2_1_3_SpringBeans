package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {

    private String say;

    public Dog(String say) {
        this.say = say;
    }

    @Override
    void saying() {
        System.out.println(say);
    }

    @Override
    public String toString() {
        return "Im a Dog";
    }
}

