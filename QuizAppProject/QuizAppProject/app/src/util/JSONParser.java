/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;


import model.*;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JSONParser {

    public static List<Question> loadQuestions(String filePath) {
        List<Question> questions = new ArrayList<>();
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            JSONArray jsonArray = new JSONArray(content);

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject obj = jsonArray.getJSONObject(i);
                String type = obj.getString("type");
                String text = obj.getString("text");
                String difficulty = obj.getString("difficulty");

                if (type.equals("MCQ")) {
                    JSONArray options = obj.getJSONArray("options");
                    List<String> optionList = new ArrayList<>();
                    for (int j = 0; j < options.length(); j++) {
                        optionList.add(options.getString(j));
                    }
                    int correctOption = obj.getInt("correctOption");
                    questions.add(new MCQ(text, optionList, correctOption, difficulty));
                } else if (type.equals("TFQ")) {
                    int correctAnswer = obj.getInt("correctAnswer");
                    questions.add(new TFQ(text, correctAnswer, difficulty));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return questions;
    }
}
