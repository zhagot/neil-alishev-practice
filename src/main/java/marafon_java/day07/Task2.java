package marafon_java.day07;

import java.util.Random;

/**
 * 2. Дворовый футбол.
 * Для игры в футбол во дворе требуется 6 человек (3х3). Класс Игрок (англ. Player) содержит следующие поля:
 * Поле “выносливость” (англ. stamina), разное для каждого экземпляра, инициализируется через конструктор.
 * Константы “максимальная выносливость” (англ. MAX_STAMINA) со значением 100 и “минимальная выносливость”
 * (англ. MIN_STAMINA) со значением 0, единые для всех экземпляров.
 * Статическое поле countPlayers, которое считает количество игроков на футбольном поле
 * (изначально их 0, выходом на поле считается создание экземпляра класса, уходом - когда игрок устал).
 * Геттеры для полей “выносливость” и “количество игроков”.
 *
 * и следующие методы:
 * run() - игрок бежит при вызове этого метода. Этот метод уменьшает выносливость игрока на 1 при однократном вызове.
 * Когда выносливость достигает 0, игроку нужен отдых и он уходит с поля.
 * info() -  выводит сообщение в зависимости от количества игроков на поле. Если игроков меньше 6, то выводит сообщение:
 * “Команды неполные. На поле еще есть ... свободных мест”, иначе: “На поле нет свободных мест”.
 * Грамматикой русского языка пренебречь, т.е. фраза “еще есть 1 свободных мест” допустима.
 *
 * Задание: Создать класс Player по вышеописанному шаблону. В методе main() создать объект класса Random,
 * который будет генерировать случайные числа. Создать 6 игроков, передавая им в качестве аргумента в конструктор
 * случайно сгенерированные числа от 90 до 100. Вызвать метод info().
 * При попытке создать 7,8 … n игрока, количество игроков на поле меняться не должно, проверить это.
 * Примените к одному игроку метод run(), пока он полностью не выдохнется
 * (отрицательное значение выносливости не допускается). Вывести количество игроков на поле.
 *
 * *По желанию: доработать метод info() так, чтобы при выводе в консоль грамматика русского языка учитывалась.
 */
public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 90;
        int max = 100;

        Player player1 = new Player(random.nextInt(max - min + 1) + min);
        player1.info();
        Player player2 = new Player(random.nextInt(max - min + 1) + min);
        player2.info();
        Player player3 = new Player(random.nextInt(max - min + 1) + min);
        player3.info();
        Player player4 = new Player(random.nextInt(max - min + 1) + min);
        player4.info();
        Player player5 = new Player(random.nextInt(max - min + 1) + min);
        player5.info();
        Player player6 = new Player(random.nextInt(max - min + 1) + min);
        player6.info();
        Player player7 = new Player(random.nextInt(max - min + 1) + min);
        player7.info();
        Player player8 = new Player(random.nextInt(max - min + 1) + min);
        player8.info();

        System.out.println("Количество стамины у 1 игрока: " + player1.getStamina());

        for (int i = player1.getStamina(); i > 0; i--) {
            player1.run();
            System.out.println("Игрок пробежал и у него осталось стамины: " + player1.getStamina());
        }
        System.out.println("Количество игроков на поле: " + Player.getCountPlayers());
        player1.info();

        // Проверяем вызов метода run после ухода игрока с поля.
        System.out.println("У 1 игрока стамины: " + player1.getStamina() + ". Количество игроков на поле: " + Player.getCountPlayers());
        player1.run();
        System.out.println("У 1 игрока стамины: " + player1.getStamina() + ". Количество игроков на поле: " + Player.getCountPlayers());

    }

}
