package pk.edu.pucit.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {


    private TextView cell0, cell1, cell2, cell3, cell4, cell5, cell6, cell7, cell8, cell9, cell00, cell_del, cell_add, cell_mul, cell_sub, cell_div, cell_dot, cell_ac, cell_equals, cell_percent;
    private TextView cal_equation, cal_result;
    private String currentEquation;
    boolean isDot;
    int count = 0;
    boolean isDigit;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cell0 = findViewById(R.id.cal_0);
        cell1 = findViewById(R.id.cal_1);
        cell2 = findViewById(R.id.cal_2);
        cell3 = findViewById(R.id.cal_3);
        cell4 = findViewById(R.id.cal_4);
        cell5 = findViewById(R.id.cal_5);
        cell6 = findViewById(R.id.cal_6);
        cell7 = findViewById(R.id.cal_7);
        cell8 = findViewById(R.id.cal_8);
        cell9 = findViewById(R.id.cal_9);
        cell00 = findViewById(R.id.cal_00);
        cell_del = findViewById(R.id.cal_del);
        cell_add = findViewById(R.id.cal_add);
        cell_mul = findViewById(R.id.cal_multiply);
        cell_sub = findViewById(R.id.cal_subtract);
        cell_div = findViewById(R.id.cal_divide);
        cell_dot = findViewById(R.id.cal_dot);
        cell_ac = findViewById(R.id.cal_AC);
        cell_equals = findViewById(R.id.cal_equals);
        cell_percent = findViewById(R.id.cal_percent);


        cal_equation = findViewById(R.id.cal_equation);
        cal_result = findViewById(R.id.cal_result);


        cell0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentEquation = cal_equation.getText().toString();
                cal_equation.setText(currentEquation + "0");
            }
        });

        cell1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentEquation = cal_equation.getText().toString();
                cal_equation.setText(currentEquation + "1");
            }
        });

        cell2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentEquation = cal_equation.getText().toString();
                cal_equation.setText(currentEquation + "2");
            }
        });

        cell3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentEquation = cal_equation.getText().toString();
                cal_equation.setText(currentEquation + "3");
            }
        });


        cell4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentEquation = cal_equation.getText().toString();
                cal_equation.setText(currentEquation + "4");
            }
        });


        cell5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentEquation = cal_equation.getText().toString();
                cal_equation.setText(currentEquation + "5");
            }
        });


        cell6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentEquation = cal_equation.getText().toString();
                cal_equation.setText(currentEquation + "6");
            }
        });


        cell7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentEquation = cal_equation.getText().toString();
                cal_equation.setText(currentEquation + "7");
            }
        });


        cell8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentEquation = cal_equation.getText().toString();
                cal_equation.setText(currentEquation + "8");
            }
        });

        cell9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentEquation = cal_equation.getText().toString();
                cal_equation.setText(currentEquation + "9");
            }
        });

        cell00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentEquation = cal_equation.getText().toString();
                cal_equation.setText(currentEquation + "00");
            }
        });

        cell_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentEquation = cal_equation.getText().toString();
                int size = currentEquation.length() - 1;
                if (size + 1 > 0) {
                    char end = currentEquation.charAt(size);
                    if (end == '+' || end == '-' || end == '*' || end == '/' || end == '%') {
                        currentEquation = currentEquation.substring(0, size);
                        cal_equation.setText(currentEquation);
                    }
                    cal_equation.setText(currentEquation + "+");
                    isDot = false;
                    isDigit = true;
                    count = 0;
                }
            }
        });

        cell_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentEquation = cal_equation.getText().toString();
                int size = currentEquation.length() - 1;
                if (size + 1 > 0) {
                    char end = currentEquation.charAt(size);
                    if (end == '+' || end == '-' || end == '*' || end == '/' || end == '%') {
                        currentEquation = currentEquation.substring(0, size);
                        cal_equation.setText(currentEquation);
                    }
                    cal_equation.setText(currentEquation + "/");
                    isDot = false;
                    isDigit = true;
                    count = 0;

                }
            }
        });
        cell_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = cal_equation.getText().toString();
                if (s != "") {
                    Expression expression = new ExpressionBuilder(s).build();
                    try {
                        double result = expression.evaluate();
                        cal_result.setText(Double.toString(result));
                    } catch (ArithmeticException ex) {
                        cal_result.setText("Error");
                    }
                }
            }
        });

        cell_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentEquation = cal_equation.getText().toString();
                int size = currentEquation.length() - 1;
                if (size + 1 > 0) {
                    char end = currentEquation.charAt(size);
                    if (end == '+' || end == '-' || end == '*' || end == '/' || end == '%') {
                        currentEquation = currentEquation.substring(0, size);
                        cal_equation.setText(currentEquation);
                    }
                    cal_equation.setText(currentEquation + "*");
                    isDot = false;
                    isDigit = true;
                    count = 0;

                }
            }
        });
        cell_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentEquation = cal_equation.getText().toString();
                if (count == 0) {
                    cal_equation.setText(currentEquation + ".");
                    isDot = true;
                    isDigit = false;
                    count = 1;
                }
            }
        });
        cell_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_equation.setText("");
                cal_result.setText("");
                count = 0;
            }
        });

        cell_percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentEquation = cal_equation.getText().toString();
                int size = currentEquation.length() - 1;
                if (size + 1 > 0) {
                    char end = currentEquation.charAt(size);
                    if (end == '+' || end == '-' || end == '*' || end == '/' || end == '%') {
                        currentEquation = currentEquation.substring(0, size);
                        cal_equation.setText(currentEquation);
                    }
                    cal_equation.setText(currentEquation + "%");
                    isDot = false;
                    isDigit = true;
                    count = 0;
                }
            }
        });

        cell_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentEquation = cal_equation.getText().toString();
                int size = currentEquation.length() - 1;
                if (size + 1 > 0) {
                    char end = currentEquation.charAt(size);
                    if (end == '+' || end == '-' || end == '*' || end == '/' || end == '%') {
                        currentEquation = currentEquation.substring(0, size);
                        cal_equation.setText(currentEquation);
                    }
                    cal_equation.setText(currentEquation + "-");
                    isDot = false;
                    isDigit = true;
                    count = 0;
                }
            }
        });


        cell_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = cal_equation.getText().toString();
                int length = cal_equation.length();

                if (length > 0) {
                    s = s.substring(0, length - 1);
                    cal_equation.setText(s);
                }
            }
        });
    }
}