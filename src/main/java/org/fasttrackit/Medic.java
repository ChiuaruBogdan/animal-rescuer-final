package org.fasttrackit;


//inheritance sau "is-a" cu Medic
public class Medic extends Person{

    private String specialization;
    private int skill;

    public Medic(String name, int money, String job, String specialization, int skill) {
        super(name, money, job);
        this.specialization = specialization;
        this.skill = skill;
    }

    public Medic(String name, int age, String specialization, String gender){

        this.getName();
        this.getAge();
        this.getSpecialization();
        this.getGender();
    }
    public Medic() {

    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public String getSpecialization() {
        return specialization;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }
    public int getSkill() {
        return skill;
    }



}
