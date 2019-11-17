package Lesson_1.Marathon.Teams;

import Lesson_1.Marathon.Teams.Competitor;

public class Team {
     String nameOfTeam = "Чемпионы";     //название команды

     public Competitor[] competitors;

     public Team(Competitor[] competitors){
        this.competitors = competitors;
    }

    public void winnersInfo() {     //метод вывода информации о членах команды, прошедших дистанцию
        System.out.println("Победители команды " + nameOfTeam + ":");
        for (Competitor c : competitors) {
            if(c.isOnDistance()) {
                c.info();
            }
        }
    }

    public void teamInfo(){   //метод вывода информации обо всех членах команды
        System.out.println("Команда " + nameOfTeam + ":");
        for (Competitor c : competitors) {
            c.info();
        }
    }

}
