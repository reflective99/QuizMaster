package edu.duke.compsci290.quizmaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button myLeftButton;
    private Button myRightButton;
    private static int ourButtonCount;
    private QuizGenerator myQuiz;
    private TextView myQuestionView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myQuiz = new QuizGenerator();
        myQuestionView = (TextView) this.findViewById(R.id.question_text);
        myLeftButton = (Button) this.findViewById(R.id.left_button);
        myRightButton = (Button) this.findViewById(R.id.right_button);
    }

    @Override
    protected void onStart(){
        super.onStart();
        QuizGenerator.Question q = myQuiz.getQuestion();
        myQuestionView.setText(q.getQuery());
        myLeftButton.setText(q.getMyCorrectAnswer());
        myRightButton.setText(q.getMyWrongAnswer());
    }

    public void leftClick(View button){
        ourButtonCount++;
        Toast.makeText(MainActivity.this,
                "left click, total = "+ourButtonCount,
                Toast.LENGTH_SHORT).show();
    }

    public void rightClick(View button){
        ourButtonCount++;
        Toast.makeText(MainActivity.this,
                "right click, total = "+ourButtonCount,
                Toast.LENGTH_SHORT).show();
    }
}
