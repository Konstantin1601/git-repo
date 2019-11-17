package Lesson_1.Marathon;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
        Obstacle[] course = {new Cross(80), new Water(2), new Wall(1), new Cross(120)};
        for (Competitor c : competitors) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
        for (Competitor c : competitors) {
            c.info();
        }

        Course c = new Course();      // Создаем полосу препятствий
        Team team = new Team();       // Создаем команду
        c.doIt(team);                 // Просим команду пройти полосу
        team.winnersInfo();           // Показываем результаты
    }
}