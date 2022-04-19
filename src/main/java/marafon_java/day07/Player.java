package marafon_java.day07;

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
 * info() - выводит сообщение в зависимости от количества игроков на поле. Если игроков меньше 6, то выводит сообщение:
 * “Команды неполные. На поле еще есть ... свободных мест”, иначе: “На поле нет свободных мест”.
 * Грамматикой русского языка пренебречь, т.е. фраза “еще есть 1 свободных мест” допустима.
 */
public class Player {
    private int stamina;
    private static final int MIN_STAMINA = 0;
    private static final int MAX_STAMINA = 100;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina > 0) stamina--;
        if (stamina == 1) countPlayers--;
    }

    public void info() {
        int fullTeam = 6;
        int freePlaces = fullTeam - countPlayers;
        if (freePlaces < fullTeam && freePlaces > 0) {
            System.out.println("Команды неполные. На поле еще есть " + freePlaces + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест " + freePlaces);
        }
    }
}
