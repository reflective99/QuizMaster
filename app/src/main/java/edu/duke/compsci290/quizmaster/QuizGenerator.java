package edu.duke.compsci290.quizmaster;

import java.util.ArrayList;

/**
 * Created by ola on 1/26/17.
 */

public class QuizGenerator {
    public class Question {
        String myQuery;
        String myCorrectAnswer;
        String myWrongAnswer;

        public Question(String q, String correct, String wrong) {
            myQuery = q;
            myCorrectAnswer = correct;
            myWrongAnswer = wrong;
        }
        public String getQuery(){
            return myQuery;
        }
        public String getMyCorrectAnswer(){
            return myCorrectAnswer;
        }
        public String getMyWrongAnswer(){
            return myWrongAnswer;
        }
    }
    private ArrayList<Question> myQuestions;
    private int myQuestionIndex;

    public QuizGenerator(){
        myQuestions = new ArrayList<>();
        makeQuiz();
    }

    private void makeQuiz() {
        myQuestions.add(
                new Question("What's the capital of North Carolina",
                             "Raleigh",
                             "Charlotte"));
        myQuestions.add(
                new Question("How many feet in a mile",
                        "5,280",
                        "7,186"));
        myQuestions.add(
                new Question("Why do birds fly south?",
                        "It's too far to walk",
                        "Migratory patterns are ingrained"));
    }
    public Question getQuestion(){
        if (myQuestionIndex < myQuestions.size()) {
            Question q = myQuestions.get(myQuestionIndex);
            myQuestionIndex++;
            return  q;
        }
        return null;
    }
}
