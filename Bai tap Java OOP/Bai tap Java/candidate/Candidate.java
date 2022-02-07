/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidate;



/**
 *
 * @author admin
 */
public class Candidate {
    private int id;
    private String name;
    private String birthday;
    private double scoreMath;
    private double scoreLiterature;
    private double scoreEnglish;

    public Candidate(int id, String name, String birthday, double scoreMath, double scoreLiterature, double scoreEnglish) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.scoreMath = scoreMath;
        this.scoreLiterature = scoreLiterature;
        this.scoreEnglish = scoreEnglish;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }

    public double getScoreLiterature() {
        return scoreLiterature;
    }

    public void setScoreLiterature(double scoreLiterature) {
        this.scoreLiterature = scoreLiterature;
    }

    public double getScoreEnglish() {
        return scoreEnglish;
    }

    public void setScoreEnglish(double scoreEnglish) {
        this.scoreEnglish = scoreEnglish;
    }

    @Override
    public String toString() {
        return "Candidate{" + "id=" + id + ", name=" + name + ", birthday=" + birthday + ", scoreMath=" + scoreMath + ", scoreLiterature=" + scoreLiterature + ", scoreEnglish=" + scoreEnglish + '}';
    }
    
    
}
