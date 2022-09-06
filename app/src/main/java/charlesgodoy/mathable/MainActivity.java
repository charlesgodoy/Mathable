package charlesgodoy.mathable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Context mContext;

    private TextView tvX, tvOperator, tvY, tvEquals, tvQuestionMark;
    private TextView tvAnswerBox;
    private Button btnOne, btnTwo, btnThree,btnFour,btnFive,btnSix, btnSeven, btnEight, btnNine, btnZero;
    private Button btnEnter;

//    private ArrayList<Integer> answer = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

        initViews();
        initButtons();

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        startMathable();
    }

    private void initButtons() {

        btnZero.setOnClickListener(new ButtonClick());
        btnOne.setOnClickListener(new ButtonClick());
        btnTwo.setOnClickListener(new ButtonClick());
        btnThree.setOnClickListener(new ButtonClick());
        btnFour.setOnClickListener(new ButtonClick());
        btnFive.setOnClickListener(new ButtonClick());
        btnSix.setOnClickListener(new ButtonClick());
        btnSeven.setOnClickListener(new ButtonClick());
        btnEight.setOnClickListener(new ButtonClick());
        btnNine.setOnClickListener(new ButtonClick());

        btnEnter.setOnClickListener(new ButtonClick());

    }

    private void startMathable() {

        tvX.setText(String.valueOf(getRandomNumber()));
        tvY.setText(String.valueOf(getRandomNumber()));
        tvOperator.setText(String.valueOf(getRandomOperator()));
        checkValidEquation();
    }

    private void checkValidEquation() {

        int temp = 0;

        String xValue = tvX.getText().toString();
        int x = Integer.parseInt(xValue);

        String yValue = tvY.getText().toString();
        int y = Integer.parseInt(yValue);

        if (tvOperator.getText().toString() == "-") {
            if (y > x) {

                temp = x;
                x = y;
                y = temp;

                tvX.setText(String.valueOf(x));
                tvY.setText(String.valueOf(y));
                return;

            }
        }

        if (tvOperator.getText() == "÷") {

            Random r = new Random();

            switch (r.nextInt(10)) {

                case 0: tvX.setText("12");
                    tvY.setText("6");
                    break;

                case 1: tvX.setText("12");
                    tvY.setText("3");
                    break;

                case 2: tvX.setText("10");
                    tvY.setText("5");
                    break;

                case 3: tvX.setText("10");
                    tvY.setText("2");
                    break;

                case 4: tvX.setText("9");
                    tvY.setText("3");
                    break;

                case 5: tvX.setText("8");
                    tvY.setText("4");
                    break;

                case 6: tvX.setText("8");
                    tvY.setText("2");
                    break;

                case 7: tvX.setText("6");
                    tvY.setText("3");
                    break;

                case 8: tvX.setText("6");
                    tvY.setText("2");
                    break;

                case 9: tvX.setText("4");
                    tvY.setText("2");
                    break;

                case 10: switch (r.nextInt(9)) {

                    case 0: tvX.setText("1");
                        tvY.setText("1");
                        break;

                    case 1: tvX.setText("2");
                        tvY.setText("2");
                        break;

                    case 2: tvX.setText("3");
                        tvY.setText("3");
                        break;

                    case 3: tvX.setText("4");
                        tvY.setText("4");
                        break;

                    case 4: tvX.setText("5");
                        tvY.setText("5");
                        break;

                    case 5: tvX.setText("6");
                        tvY.setText("6");
                        break;

                    case 6: tvX.setText("7");
                        tvY.setText("7");
                        break;

                    case 7: tvX.setText("8");
                        tvY.setText("8");
                        break;

                    case 8: tvX.setText("9");
                        tvY.setText("9");
                        break;

                    default:
                }

                default:

            }

        }

    }

    private String getRandomOperator() {

        String operator = "?";
        Random randomOperator = new Random();

        switch (randomOperator.nextInt(4)) {

            case  0: operator = "+";
                break;

            case  1: operator = "-";
                break;

            case  2: operator = "x";
                break;

            case  3: operator = "÷";
                break;

            default:

        }

        return operator;

    }

    private int getRandomNumber() {

        int min = 0;
        int max = 9;
        int randomNumber = new Random().nextInt((max - min) + 1) + min;
        return randomNumber;

    }

    private void initViews() {

        tvX = findViewById(R.id.first_number);
        tvOperator = findViewById(R.id.sign);
        tvY = findViewById(R.id.second_number);
        tvEquals = findViewById(R.id.equals);
        tvQuestionMark = findViewById(R.id.question_mark);

        tvAnswerBox = findViewById(R.id.answer_input);

        btnZero = findViewById(R.id.button_zero);
        btnOne = findViewById(R.id.button_one);
        btnTwo = findViewById(R.id.button_two);
        btnThree = findViewById(R.id.button_three);
        btnFour = findViewById(R.id.button_four);
        btnFive = findViewById(R.id.button_five);
        btnSix = findViewById(R.id.button_six);
        btnSeven = findViewById(R.id.button_seven);
        btnEight = findViewById(R.id.button_eight);
        btnNine = findViewById(R.id.button_nine);

        btnEnter = findViewById(R.id.enter_button);

    }

    public class ButtonClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            switch (v.getId()) {

                case R.id.button_zero:
                    String textZero = tvAnswerBox.getText().toString();
                    String buttonZero = btnZero.getText().toString();
                    String valueZero = textZero + buttonZero;
                    tvAnswerBox.setText(valueZero);
                    break;

                case R.id.button_one:
                    String textOne = tvAnswerBox.getText().toString();
                    String buttonOne = btnOne.getText().toString();
                    String valueOne = textOne + buttonOne;
                    tvAnswerBox.setText(valueOne);
                    break;

                case R.id.button_two:
                    String textTwo = tvAnswerBox.getText().toString();
                    String buttonTwo = btnTwo.getText().toString();
                    String valueTwo = textTwo + buttonTwo;
                    tvAnswerBox.setText(valueTwo);
                    break;

                case R.id.button_three:
                    String textThree = tvAnswerBox.getText().toString();
                    String buttonThree = btnThree.getText().toString();
                    String valueThree = textThree + buttonThree;
                    tvAnswerBox.setText(valueThree);
                    break;

                case R.id.button_four:
                    String textFour = tvAnswerBox.getText().toString();
                    String buttonFour = btnFour.getText().toString();
                    String valueFour = textFour + buttonFour;
                    tvAnswerBox.setText(valueFour);
                    break;

                case R.id.button_five:
                    String textFive = tvAnswerBox.getText().toString();
                    String buttonFive = btnFive.getText().toString();
                    String valueFive = textFive + buttonFive;
                    tvAnswerBox.setText(valueFive);
                    break;

                case R.id.button_six:
                    String textSix = tvAnswerBox.getText().toString();
                    String buttonSix = btnSix.getText().toString();
                    String valueSix = textSix + buttonSix;
                    tvAnswerBox.setText(valueSix);
                    break;

                case R.id.button_seven:
                    String textSeven = tvAnswerBox.getText().toString();
                    String buttonSeven = btnSeven.getText().toString();
                    String valueSeven = textSeven + buttonSeven;
                    tvAnswerBox.setText(valueSeven);;
                    break;

                case R.id.button_eight:
                    String textEight = tvAnswerBox.getText().toString();
                    String buttonEight = btnEight.getText().toString();
                    String valueEight = textEight + buttonEight;
                    tvAnswerBox.setText(valueEight);
                    break;

                case R.id.button_nine:
                    String textNine = tvAnswerBox.getText().toString();
                    String buttonNine = btnNine.getText().toString();
                    String valueNine = textNine + buttonNine;
                    tvAnswerBox.setText(valueNine);
                    break;

                case R.id.enter_button:

                    if (tvAnswerBox.getText().toString().equals("")) {
                        Toast.makeText(mContext, "Answer required", Toast.LENGTH_SHORT).show();
                        return;
                    } else {
                        checkAnswer(Integer.parseInt(tvAnswerBox.getText().toString()));
                    }
                    startMathable();
                    break;

                default:

            }

        }
    }

    private void checkAnswer(int userAnswer) {

        int correctAnswer = 0;
        String currentOperator = tvOperator.getText().toString();

        String xValue = tvX.getText().toString();
        int x = Integer.parseInt(xValue);

        String yValue = tvY.getText().toString();
        int y = Integer.parseInt(yValue);

        if (currentOperator == "+") {
            correctAnswer = x + y;
        }

        if (currentOperator == "-") {
            correctAnswer = x - y;
        }

        if (currentOperator == "x") {
            correctAnswer = x * y;
        }

        if (currentOperator == "÷") {
            correctAnswer = x / y;
        }

        if (correctAnswer == Integer.parseInt(tvAnswerBox.getText().toString())) {
            Toast.makeText(mContext, "Correct Answer", Toast.LENGTH_SHORT).show();
            tvAnswerBox.setText(null);
        } else {
            Toast.makeText(mContext, "Wrong Answer", Toast.LENGTH_SHORT).show();
            tvAnswerBox.setText(null);
        }

    }
}