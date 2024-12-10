/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

public class MCQ extends Question {

    private List<String> options;
    private int correctOption;

    public MCQ(String text, List<String> options, int correctOption, String difficulty) {
        super(text, difficulty);
        this.options = options;
        this.correctOption = correctOption;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public int getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(int correctOption) {
        this.correctOption = correctOption;
    }

    @Override
    public boolean checkAnswer(int answer) {
        return answer == correctOption;
    }

}
