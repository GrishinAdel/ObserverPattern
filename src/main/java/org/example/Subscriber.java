package org.example;

import java.util.List;

public class Subscriber implements Observer {
    String nameSubscriber;

    public Subscriber(String nameSubscriber) {
        this.nameSubscriber = nameSubscriber;
    }

    @Override
    public void handleEvent(List<String> discounts) {
        System.out.println("Уважаемый, " + nameSubscriber + "\nУ нас изменились действуйющие скидки.");
        System.out.println("Актуальные скидки: " + discounts + "\n");
    }
}
