package org.example;

public class Main {
    public static void main(String[] args) {
        new Thread()
        {
            @Override
            public void run() {
                try {
                    PyaterochkaSite pyaterochkaSite = new PyaterochkaSite();

                    pyaterochkaSite.addDiscount("Скидка на бананы 30%");
                    pyaterochkaSite.addDiscount("Скидка на яблоки 20%");
                    pyaterochkaSite.addDiscount("Скидка на молоко 40%");

                    Observer Alexandr = new Subscriber("Александр Бронников");
                    Observer Adel = new Subscriber("Адель Гришин");
                    Observer Sergei = new Subscriber("Сергей Сулятецкий");

                    pyaterochkaSite.addObserver(Alexandr);
                    pyaterochkaSite.addObserver(Adel);
                    pyaterochkaSite.addObserver(Sergei);

                    System.out.println("Добавляем скидку на картофель...");;
                    Thread.sleep(3000);
                    pyaterochkaSite.addDiscount("Скидка на картофель 3%");

                    pyaterochkaSite.removeObserver(Adel);
                    pyaterochkaSite.removeObserver(Sergei);

                    pyaterochkaSite.addObserver(new Subscriber("Чапкин Николай Сергеевич"));

                    Thread.sleep(1000);
                    System.out.println("Удаляем скидку на яблоки...");;
                    Thread.sleep(3000);
                    pyaterochkaSite.removeDiscount("Скидка на яблоки 20%");
                    Thread.sleep(3000);
                }
                catch (Exception exception) {

                }
            }
        }.start();
    }
}