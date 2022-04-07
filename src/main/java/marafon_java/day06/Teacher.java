package marafon_java.day06;

import java.util.Random;

public class Teacher {
    private String name;
    private String predmet;

    void evaluate(Student student) {
        int minEstimation = 2;
        int maxEstimation = 5;
        int estimation = minEstimation + (int) (Math.random() * ((maxEstimation - minEstimation) + 1));
        String resultEstimation;
        switch (estimation) {
            case (2):
                resultEstimation = "неудовлетворительно";
                break;
            case (3):
                resultEstimation = "удовлетворительно";
                break;
            case (4):
                resultEstimation = "хорошо";
                break;
            default:
                resultEstimation = "отлично";
                break;
        }

        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + predmet + " на оценку " + resultEstimation + ".");
    }

    public Teacher(String name, String predmet) {
        this.name = name;
        this.predmet = predmet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }
}
