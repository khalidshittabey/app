/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class TFQ extends Question {

    private int correctAnswer;

    public TFQ(String text, int correctAnswer, String difficulty) {
        super(text, difficulty);
        this.correctAnswer = correctAnswer;
    }

    public int isCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean checkAnswer(int answer) {
        return answer == correctAnswer;
    }
}
