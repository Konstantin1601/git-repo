package Lesson_1.Marathon.Courses;

import Lesson_1.Marathon.Courses.Obstacle;
import Lesson_1.Marathon.Teams.Competitor;

public class Course {
    public Obstacle[] course;

    public Course(Obstacle[] course){
        this.course = course;
    }

    public void go(Competitor[] competitors) {
        for (Competitor c : competitors) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }

    }
}
