package Lesson_1.Marathon;

import Lesson_1.Marathon.Courses.*;
import Lesson_1.Marathon.Teams.*;

public class Main {
    public static void main(String[] args) {
        //Competitor[] competitors = {new Human("Боб"), new Human ("Валера"), new Cat("Барсик"), new Dog("Бобик")};
       // Obstacle[] course = {new Cross(80), new Water(2), new Wall(1), new Cross(120)};

        /*for (Competitor c : competitors) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
        for (Competitor c : competitors) {
            c.info();
        }
*/
        Course c = new Course(new Obstacle[]{new Cross(80), new Water(2), new Wall(1), new Cross(120)});                       // Создаем полосу препятствий
        Team team = new Team(new Competitor[]{new Human("Боб"), new Human ("Валера"), new Cat("Барсик"), new Dog("Бобик")});       // Создаем команду
        c.go(team);                 // Просим команду пройти полосу
        team.winnersInfo();           // Показываем результаты
    }
}