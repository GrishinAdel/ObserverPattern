package org.example;

import java.util.List;

public interface Observer {
    public void handleEvent(List<String> discounts);
}
