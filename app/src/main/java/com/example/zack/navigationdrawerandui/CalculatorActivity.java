package com.example.zack.navigationdrawerandui;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorActivity extends AppCompatActivity {

    static String EMPTY = "";
    TextView txtDisplay;
    TextView calcDisplay;
    TextView opDisplay;
    TextView varDisplay;
    String aVal = "";
    String bVal = "";
    float a;
    float b;
    float result;
    Button btnNum1;
    Button btnNum2;
    Button btnNum3;
    Button btnNum4;
    Button btnNum5;
    Button btnNum6;
    Button btnNum7;
    Button btnNum8;
    Button btnNum9;
    Button btnNum0;
    Button btnDecPoint;
    Button btnPlus;
    Button btnMinus;
    Button btnMult;
    Button btnDiv;
    Button btnClear;
    Button btnCalc;
    boolean isFirstVar;
    boolean isDiv;
    boolean isMult;
    boolean isPlus;
    boolean isMinus;
    boolean hasEvaluated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);



        txtDisplay = (TextView) findViewById(R.id.var1);
        varDisplay = (TextView) findViewById(R.id.var2);
        opDisplay = (TextView) findViewById(R.id.operation);
        calcDisplay = (TextView) findViewById(R.id.result);
        // Bind all the buttons
        btnNum1 = (Button) findViewById(R.id.one);
        btnNum2 = (Button) findViewById(R.id.two);
        btnNum3 = (Button) findViewById(R.id.three);
        btnNum4 = (Button) findViewById(R.id.four);
        btnNum5 = (Button) findViewById(R.id.five);
        btnNum6 = (Button) findViewById(R.id.six);
        btnNum7 = (Button) findViewById(R.id.seven);
        btnNum8 = (Button) findViewById(R.id.eight);
        btnNum9 = (Button) findViewById(R.id.nine);
        btnNum0 = (Button) findViewById(R.id.zero);
        btnDecPoint = (Button) findViewById(R.id.point);
        btnPlus = (Button) findViewById(R.id.plus);
        btnMinus = (Button) findViewById(R.id.minus);
        btnMult = (Button) findViewById(R.id.multiply);
        btnDiv = (Button) findViewById(R.id.divide);
        btnClear = (Button) findViewById(R.id.clear);
        btnCalc = (Button) findViewById(R.id.calc);
        isFirstVar = true;
        hasEvaluated = false;


        //Set the listeners
        btnNum1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           if (hasEvaluated) {
                                               reset();
                                           }
                                           bVal += "1";
                                           if (isFirstVar) {
                                               String currentDisplay = txtDisplay.getText().toString();
                                               txtDisplay.setText(currentDisplay + "1");
                                           } else {
                                               String currentDisplay = varDisplay.getText().toString();
                                               varDisplay.setText(currentDisplay + "1");
                                           }
                                       }
                                   }

        );

        btnNum2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           if (hasEvaluated) {
                                               reset();
                                           }
                                           bVal += "2";
                                           if (isFirstVar) {
                                               String currentDisplay = txtDisplay.getText().toString();
                                               txtDisplay.setText(currentDisplay + "2");
                                           } else {
                                               String currentDisplay = varDisplay.getText().toString();
                                               varDisplay.setText(currentDisplay + "2");
                                           }

                                       }
                                   }

        );

        btnNum3.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           if (hasEvaluated) {
                                               reset();
                                           }
                                           bVal += "3;";
                                           if (isFirstVar) {
                                               String currentDisplay = txtDisplay.getText().toString();
                                               txtDisplay.setText(currentDisplay + "3");
                                           } else {
                                               String currentDisplay = varDisplay.getText().toString();
                                               varDisplay.setText(currentDisplay + "3");
                                           }

                                       }
                                   }

        );

        btnNum4.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           if (hasEvaluated) {
                                               reset();
                                           }
                                           bVal += "4";
                                           if (isFirstVar) {
                                               String currentDisplay = txtDisplay.getText().toString();
                                               txtDisplay.setText(currentDisplay + "4");
                                           } else {
                                               String currentDisplay = varDisplay.getText().toString();
                                               varDisplay.setText(currentDisplay + "4");
                                           }

                                       }
                                   }

        );

        btnNum5.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           if (hasEvaluated) {
                                               reset();
                                           }
                                           bVal += "5";
                                           if (isFirstVar) {
                                               String currentDisplay = txtDisplay.getText().toString();
                                               txtDisplay.setText(currentDisplay + "5");
                                           } else {
                                               String currentDisplay = varDisplay.getText().toString();
                                               varDisplay.setText(currentDisplay + "5");
                                           }

                                       }
                                   }

        );

        btnNum6.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           if (hasEvaluated) {
                                               reset();
                                           }
                                           bVal += "6";
                                           if (isFirstVar) {
                                               String currentDisplay = txtDisplay.getText().toString();
                                               txtDisplay.setText(currentDisplay + "6");
                                           } else {
                                               String currentDisplay = varDisplay.getText().toString();
                                               varDisplay.setText(currentDisplay + "6");
                                           }

                                       }
                                   }

        );

        btnNum7.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           if (hasEvaluated) {
                                               reset();
                                           }
                                           bVal += "7";
                                           if (isFirstVar) {
                                               String currentDisplay = txtDisplay.getText().toString();
                                               txtDisplay.setText(currentDisplay + "7");
                                           } else {
                                               String currentDisplay = varDisplay.getText().toString();
                                               varDisplay.setText(currentDisplay + "7");
                                           }

                                       }
                                   }

        );

        btnNum8.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           if (hasEvaluated) {
                                               reset();
                                           }
                                           bVal += "8";
                                           if (isFirstVar) {
                                               String currentDisplay = txtDisplay.getText().toString();
                                               txtDisplay.setText(currentDisplay + "8");
                                           } else {
                                               String currentDisplay = varDisplay.getText().toString();
                                               varDisplay.setText(currentDisplay + "8");
                                           }

                                       }
                                   }

        );

        btnNum9.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           if (hasEvaluated) {
                                               reset();
                                           }
                                           bVal += "9";
                                           if (isFirstVar) {
                                               String currentDisplay = txtDisplay.getText().toString();
                                               txtDisplay.setText(currentDisplay + "9");
                                           } else {
                                               String currentDisplay = varDisplay.getText().toString();
                                               varDisplay.setText(currentDisplay + "9");
                                           }

                                       }
                                   }

        );

        btnNum0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hasEvaluated) {
                    reset();
                }
                bVal += "0";
                if (isFirstVar) {
                    String currentDisplay = txtDisplay.getText().toString();
                    txtDisplay.setText(currentDisplay + "0");
                } else {
                    String currentDisplay = varDisplay.getText().toString();
                    varDisplay.setText(currentDisplay + "0");
                }

            }
        });

        btnDecPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hasEvaluated) {
                    reset();
                }
                bVal += ".";
                if (isFirstVar) {
                    String currentDisplay = txtDisplay.getText().toString();
                    txtDisplay.setText(currentDisplay + ".");
                } else {
                    String currentDisplay = varDisplay.getText().toString();
                    varDisplay.setText(currentDisplay + ".");
                }

            }
        });


        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aVal = bVal;
                bVal = EMPTY;
                isPlus = true;
                isFirstVar = false;
                opDisplay.setText("+");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aVal = bVal;
                bVal = EMPTY;
                isMinus = true;
                isFirstVar = false;
                opDisplay.setText("-");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aVal = bVal;
                bVal = EMPTY;
                isDiv = true;
                isFirstVar = false;
                opDisplay.setText("÷");
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aVal = bVal;
                bVal = EMPTY;
                isMult = true;
                isFirstVar = false;
                opDisplay.setText("x");
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtDisplay.setText(EMPTY);
                calcDisplay.setText(EMPTY);
                opDisplay.setText(EMPTY);
                varDisplay.setText(EMPTY);
                isPlus = false;
                isDiv = false;
                isMinus = false;
                isMult = false;
                isFirstVar = true;
                aVal = EMPTY;
                bVal = EMPTY;
            }
        });
        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Float.parseFloat(aVal);
                b = Float.parseFloat(bVal);

                DecimalFormat df = new DecimalFormat("#.######");
                df.setRoundingMode(RoundingMode.DOWN);
                if (isPlus) {
                    result = (a + b);
                    String c = df.format(result);
                    calcDisplay.setText(c);
                    hasEvaluated = true;
                } else if (isMinus) {
                    result = ((a) - (b));
                    String c = df.format(result);
                    calcDisplay.setText(c);
                    hasEvaluated = true;
                } else if (isMult) {
                    result = ((a) * (b));
                    String c = df.format(result);
                    calcDisplay.setText(c);
                    hasEvaluated = true;
                } else if (isDiv) {
                    result = (float) a / b;
                    String c = df.format(result);
                    calcDisplay.setText(c);
                    hasEvaluated = true;
                } else {
                    calcDisplay.setText("Try again.");
                    hasEvaluated = true;
                }


            }
        });


    }

    private void reset() {
        txtDisplay.setText(EMPTY);
        opDisplay.setText(EMPTY);
        calcDisplay.setText(EMPTY);
        varDisplay.setText(EMPTY);
        isPlus = false;
        isDiv = false;
        isMinus = false;
        isMult = false;
        isFirstVar = true;
        aVal = EMPTY;
        bVal = EMPTY;
        hasEvaluated = false;
    }


}
