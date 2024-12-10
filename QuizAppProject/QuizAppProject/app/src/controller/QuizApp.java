/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


 
import model.*;
import java.util.ArrayList;
import java.util.List;

public class QuizApp {

    private List<Question> questions;
    private User user;
    private int currentQuestionIndex;

    public QuizApp(User user) {
        this.user = user;
        this.questions = new ArrayList<>();
        this.currentQuestionIndex = 0;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public int totalQuestions() {
        return questions.size();
    }

    public User getUser() {
        return user;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public Question getNextQuestion() {
        if (currentQuestionIndex < questions.size()) {
            return questions.get(currentQuestionIndex++);
        }
        return null;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public boolean hasMoreQuestions() {
        return currentQuestionIndex < questions.size();
    }

    public int getScore() {
        return user.getScore();
    }

    public void setScore(int score) {
        user.setScore(score);
    }

    public int getCurrentQuestionIndex() {
        return currentQuestionIndex - 1;
    }

    public Question getCurrentQuestion() {
        if (!hasMoreQuestions()) {
            return null;
        }
        return questions.get(currentQuestionIndex - 1);
    }

    public List<Question> filterQuestionsByDifficulty(String difficulty) {
        List<Question> filteredQuestions = new ArrayList<>();
        for (Question question : questions) {
            if (question.getDifficulty().equalsIgnoreCase(difficulty)) {
                filteredQuestions.add(question);
            }
        }
        return filteredQuestions;
    }

}
