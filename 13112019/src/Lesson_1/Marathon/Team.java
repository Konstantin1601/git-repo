package Lesson_1.Marathon;

 class Team {
    String nameOfTeam = "Чемпионы";     //название команды
    Competitor[] competitors = {new Human("Боб"), new Human ("Валера"), new Cat("Барсик"), new Dog("Бобик")};     //массив из 4 участников

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
