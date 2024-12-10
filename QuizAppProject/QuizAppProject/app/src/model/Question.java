/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public abstract class Question {

    private String text;
    private String difficulty;

    // Constructor
    public Question(String text, String difficulty) {
        this.text = text;
        this.difficulty = difficulty;
    }

    // Getters and Setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public String getDifficulty(){
        return difficulty;
    }


    public abstract boolean checkAnswer(int answer);
    
}
