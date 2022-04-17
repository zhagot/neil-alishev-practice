package marafon_java.day07;

/**
 * 1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
 * В классе Самолет реализовать статический метод compareAirplanes, который в качестве аргументов принимает два объекта
 * класса Airplane (два самолета) и выводит сообщение в консоль о том, какой из самолетов длиннее.
 */
public class Task1 {
    public static void main(String[] args) {
        Airplane airplaneOne = new Airplane("Boeing 777", 1995, 74, 155500);
        Airplane airplaneTwo = new Airplane("ИЛ 96", 1998, 55, 117000);
        Airplane.compareAirplanes(airplaneOne, airplaneTwo);
    }
}
