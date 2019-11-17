package Lesson_1.Marathon;

public class Course {
    Obstacle[] course = {new Cross(80), new Water(2), new Wall(1), new Cross(120)};

    public void doIt(Competitor[] competitors) {
        for (Competitor c : competitors) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }

    }
}
