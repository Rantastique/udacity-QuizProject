package com.example.android.quizproject;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override

    //makes sure that the app won't be resetted to the onCreate state if the phone
    //is switched to landscape mode

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        //changes the font of the given Views' texts to a custom font

        TextView nameQuestion = (TextView)findViewById(R.id.nameQuestion);
        TextView questionOne = (TextView) findViewById(R.id.questionOne);
        TextView questionTwo = (TextView) findViewById(R.id.questionTwo);
        TextView questionThree = (TextView) findViewById(R.id.questionThree);
        TextView questionFour = (TextView) findViewById(R.id.questionFour);
        TextView questionFive = (TextView) findViewById(R.id.questionFive);
        TextView questionSix = (TextView) findViewById(R.id.questionSix);
        TextView questionSeven = (TextView) findViewById(R.id.questionSeven);
        TextView questionEight = (TextView) findViewById(R.id.questionEight);
        TextView questionNine = (TextView) findViewById(R.id.questionNine);
        TextView questionTen = (TextView) findViewById(R.id.questionTen);
        TextView questionEleven = (TextView) findViewById(R.id.questionEleven);
        TextView questionTwelve = (TextView) findViewById(R.id.questionTwelve);
        Button submitAnswers = (Button) findViewById(R.id.submitAnswers);
        Button resetQuiz = (Button) findViewById(R.id.resetQuiz);
        Typeface harryFont = Typeface.createFromAsset(getAssets(), "fonts/harryp.ttf");
        nameQuestion.setTypeface(harryFont);
        questionOne.setTypeface(harryFont);
        questionTwo.setTypeface(harryFont);
        questionThree.setTypeface(harryFont);
        questionFour.setTypeface(harryFont);
        questionFive.setTypeface(harryFont);
        questionSix.setTypeface(harryFont);
        questionSeven.setTypeface(harryFont);
        questionEight.setTypeface(harryFont);
        questionNine.setTypeface(harryFont);
        questionTen.setTypeface(harryFont);
        questionEleven.setTypeface(harryFont);
        questionTwelve.setTypeface(harryFont);
        submitAnswers.setTypeface(harryFont);
        resetQuiz.setTypeface(harryFont);
    }


    //global variables that store the number of questions and the user's score

    int totalQuestions = 12;
    int totalScore = 0;

    //submits user's answers
    //displays user's score and message as a toast to the screen

    public void submitAnswer (View view) {
        checkAnswers();
        EditText name = (EditText) findViewById(R.id.name);
        Toast.makeText(this, createToastText(totalQuestions, totalScore, name), Toast.LENGTH_LONG).show();
        totalScore = 0;
    }


    //checks the given answers

    private void checkAnswers() {
        TextView questionOne = (TextView) findViewById(R.id.questionOne);
        CheckBox a1R1 = (CheckBox) findViewById(R.id.a1R1);
        CheckBox a1R2 = (CheckBox) findViewById(R.id.a1R2);
        CheckBox a1W1 = (CheckBox) findViewById(R.id.a1W1);
        CheckBox a1W2 = (CheckBox) findViewById(R.id.a1W2);
        checkAnswerCheckBox(a1R1.isChecked(),a1R2.isChecked(),a1W1.isChecked(),a1W2.isChecked(), questionOne);

        TextView questionTwo = (TextView) findViewById(R.id.questionTwo);
        RadioButton a2R = (RadioButton) findViewById(R.id.a2R);
        checkAnswerRadioButton(a2R.isChecked(), questionTwo);

        TextView questionThree = (TextView) findViewById(R.id.questionThree);
        CheckBox a3R1 = (CheckBox) findViewById(R.id.a3R1);
        CheckBox a3R2 = (CheckBox) findViewById(R.id.a3R2);
        CheckBox a3W1 = (CheckBox) findViewById(R.id.a3W1);
        CheckBox a3W2 = (CheckBox) findViewById(R.id.a3W2);
        checkAnswerCheckBox(a3R1.isChecked(),a3R2.isChecked(),a3W1.isChecked(),a3W2.isChecked(), questionThree);

        TextView questionFour = (TextView) findViewById(R.id.questionFour);
        EditText input4A = (EditText) findViewById(R.id.input4Answer);
        checkAnswerInput(input4A, "helga", questionFour);

        TextView questionFive = (TextView) findViewById(R.id.questionFive);
        RadioButton a5R = (RadioButton) findViewById(R.id.a5R);
        checkAnswerRadioButton(a5R.isChecked(), questionFive);

        TextView questionSix = (TextView) findViewById(R.id.questionSix);
        RadioButton a6R = (RadioButton) findViewById(R.id.a6R);
        checkAnswerRadioButton(a6R.isChecked(), questionSix);

        TextView questionSeven = (TextView) findViewById(R.id.questionSeven);
        CheckBox a7R1 = (CheckBox) findViewById(R.id.a7R1);
        CheckBox a7R2 = (CheckBox) findViewById(R.id.a7R2);
        CheckBox a7W1 = (CheckBox) findViewById(R.id.a7W1);
        CheckBox a7W2 = (CheckBox) findViewById(R.id.a7W2);
        checkAnswerCheckBox(a7R1.isChecked(),a7R2.isChecked(),a7W1.isChecked(),a7W2.isChecked(), questionSeven);

        TextView questionEight = (TextView) findViewById(R.id.questionEight);
        CheckBox a8R1 = (CheckBox) findViewById(R.id.a8R1);
        CheckBox a8R2 = (CheckBox) findViewById(R.id.a8R2);
        CheckBox a8W1 = (CheckBox) findViewById(R.id.a8W1);
        CheckBox a8W2 = (CheckBox) findViewById(R.id.a8W2);
        checkAnswerCheckBox(a8R1.isChecked(),a8R2.isChecked(),a8W1.isChecked(),a8W2.isChecked(), questionEight);

        TextView questionNine = (TextView) findViewById(R.id.questionNine);
        EditText input9A = (EditText) findViewById(R.id.input9Answer);
        checkAnswerInput(input9A, "bezoar", questionNine);

        TextView questionTen = (TextView) findViewById(R.id.questionTen);
        CheckBox a10R1 = (CheckBox) findViewById(R.id.a10R1);
        CheckBox a10R2 = (CheckBox) findViewById(R.id.a10R2);
        CheckBox a10W1 = (CheckBox) findViewById(R.id.a10W1);
        CheckBox a10W2 = (CheckBox) findViewById(R.id.a10W2);
        checkAnswerCheckBox(a10R1.isChecked(),a10R2.isChecked(),a10W1.isChecked(),a10W2.isChecked(), questionTen);

        TextView questionEleven = (TextView) findViewById(R.id.questionEleven);
        RadioButton a11R = (RadioButton) findViewById(R.id.a11R);
        checkAnswerRadioButton(a11R.isChecked(), questionEleven);

        TextView questionTwelve = (TextView) findViewById(R.id.questionTwelve);
        RadioButton a12R = (RadioButton) findViewById(R.id.a12R);
        checkAnswerRadioButton(a12R.isChecked(), questionTwelve);
    }

    //checks if the selected answers from a group of checkboxes are right
    //if the answers are right, the method adds a point to the user's score
    //tints the question related to the answer(s) red if the answer is not correct
    //@param rightAnswerOne: boolean value for first right answer
    //@param rightAnswerTwo: boolean value for second right answer
    //@param wrongAnswerOne: boolean value for first wrong answer
    //@param wrongAnswerTwo: boolean value for second wrong answer
    //@param question is the TextView with the related question
    //answers must be put into the method in the right order (right, right, wrong, wrong), regardless of the order in the layout!

    private void checkAnswerCheckBox(boolean rightAnswerOne, boolean rightAnswerTwo, boolean wrongAnswerOne, boolean wrongAnswerTwo, TextView question) {
        if (rightAnswerOne && rightAnswerTwo && !wrongAnswerOne && !wrongAnswerTwo) {
            totalScore +=1;
            int colorPrimaryLight = ContextCompat.getColor(this, R.color.colorPrimaryLight);
            question.setTextColor(colorPrimaryLight);
        }
        else {
            int colorMistake = ContextCompat.getColor(this, R.color.colorMistake);
            question.setTextColor(colorMistake);
        }
    }

    //checks if the selected answer from a RadioGroup is correct
    //tints the question related to the answer(s) red if the answer is not correct
    //@param rightAnswer: boolean for the selected RadioButton
    //@param question is the TextView with the related question

    private void checkAnswerRadioButton(boolean rightAnswer, TextView question) {
        if (rightAnswer) {
            totalScore +=1;
            int colorPrimaryLight = ContextCompat.getColor(this, R.color.colorPrimaryLight);
            question.setTextColor(colorPrimaryLight);
        }
        else {
            int colorMistake = ContextCompat.getColor(this, R.color.colorMistake);
            question.setTextColor(colorMistake);
        }
    }
    //checks if the answer the user typed into the input field is right
    //tints the question related to the answer(s) red if the answer is not correct
    //changes the color (back) if answered correct
    //@param inputAnswer is the text we get from the EditText view
    //@param rightAnswer is the correct answer in lower case
    //@param question is the TextView with the related question

    private void checkAnswerInput(EditText inputAnswer, String rightAnswer, TextView question) {
        String answerTyped = inputAnswer.getText().toString().toLowerCase();
        if (answerTyped.equals(rightAnswer)) {
            totalScore += 1;
            int colorPrimaryLight = ContextCompat.getColor(this, R.color.colorPrimaryLight);
            question.setTextColor(colorPrimaryLight);
        }
        else {
            int colorMistake = ContextCompat.getColor(this, R.color.colorMistake);
            question.setTextColor(colorMistake);
        }
    }

    //composes the text for the toast
    //@param numberOfQuestions is the number of questions in the quiz
    //@param Score is the score the user got for their answers
    //@param name ist the input we get from the username EditText view

    private String createToastText(int numberOfQuestions, int Score, EditText name){
        String userName = name.getText().toString();
        String toastText = "";
        if (numberOfQuestions == Score) {
            toastText += "Congratulations, " + userName ;
            toastText += "!\nYour answers were all correct! Your score is " + Score;
            toastText += ".\nHave you gone to Hogwarts with Harry together?";
            return toastText;
        }
        else if (numberOfQuestions > Score && Score >=8) {
            toastText += "You did really well, " + userName;
            toastText += "!\nYour personal score is " + Score;
            toastText += ".\nLooks like you know a lot about Harry Potter!";
            return toastText;
        }
        else if (8 > Score && Score >=4) {
            toastText += "You did okay, " + userName;
            toastText += ".\nYour personal score is " + Score;
            toastText += ".\nMaybe you want to do a reread?";
            return toastText;
        }
        else {
            toastText += "Your score is " + Score;
            toastText += ".\nSeems like you are a real muggle, " + userName;
            toastText += "...\nBut it's never to late to learn about the magical world!";
            return toastText;
        }
    }

    //resets the quiz to the onCreate state

    public void resetQuiz(View view) {
        Intent i = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage(getBaseContext().getPackageName());
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        totalScore = 0;
    }
}