package com.example.android_assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Question4 extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bc,badd,bneg,bmul,bdiv,enter;
    TextView text,outtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_question4);
        b0=findViewById(R.id.button0);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        b7=findViewById(R.id.button7);
        b8=findViewById(R.id.button8);
        b9=findViewById(R.id.button9);
        bdot=findViewById(R.id.buttondot);
        bc=findViewById(R.id.buttonc);
        badd=findViewById(R.id.buttonadd);
        bneg=findViewById(R.id.buttonneg);
        bmul=findViewById(R.id.buttonmul);
        bdiv=findViewById(R.id.buttondiv);
        enter=findViewById(R.id.button);
        text=findViewById(R.id.textView);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText()+"0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText()+"9");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Can not enter operater first.",Toast.LENGTH_SHORT).show();
                }
                else {
                    text.setText(text.getText()+".");
                }

            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Can not enter operater first.",Toast.LENGTH_SHORT).show();
                }
                else {
                    text.setText(text.getText()+"+");
                }

            }
        });

        bneg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Can not enter operater first.",Toast.LENGTH_SHORT).show();
                }
                else {
                    text.setText(text.getText()+"-");
                }
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Can not enter operater first.",Toast.LENGTH_SHORT).show();
                }
                else {
                    text.setText(text.getText()+"*");
                }
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Can not enter operater first.",Toast.LENGTH_SHORT).show();
                }
                else {
                    text.setText(text.getText()+"/");
                }
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                String[] operator=text.getText().toString().split("(?=[-+*/])");
                String[] operator = text.getText().toString().split("(?<=[-+*/])|(?=[-+*/])");
                if (operator.length % 2 == 0) {
                    Toast.makeText(getApplicationContext(),"Can not end with operater.",Toast.LENGTH_SHORT).show();

//                    for (int i = 0; i < operator.length-3; i+=2) {
//                        Log.d("operator["+ i +"] : ", operator[i]);
//                        if(operator[i+1].equals("+")) {
//                            operator[i+2]=String.valueOf(Float.parseFloat(operator[i])+Float.parseFloat(operator[i+2]));
//                        } else if (operator[i+1].equals("-")) {
//                            operator[i+2]=String.valueOf(Float.parseFloat(operator[i])-Float.parseFloat(operator[i+2]));
//
//                        }else if(operator[i+1].equals("*")){
//                            operator[i+2]=String.valueOf(Float.parseFloat(operator[i])*Float.parseFloat(operator[i+2]));
//
//                        }else if(operator[i+1].equals("/")){
//                            operator[i+2]=String.valueOf(Float.parseFloat(operator[i])/Float.parseFloat(operator[i+2]));
//                        }
//
//                    }
//                    Log.d("Out put : ",operator[operator.length-2]);

                } else {
                    for(int i = 0; i < operator.length;i++){
                        Log.d("Operater : ",operator[i]);
                    }
                    for (int i = 0; i < operator.length-2; i+=2) {
                        Log.d("operator["+ i +"] : ", operator[i]);

                        if(operator[i+1].equals("+")) {
                            operator[i+2]=String.valueOf(Float.parseFloat(operator[i])+Float.parseFloat(operator[i+2]));
                        } else if (operator[i+1].equals("-")) {
                            operator[i+2]=String.valueOf(Float.parseFloat(operator[i])-Float.parseFloat(operator[i+2]));

                        }else if(operator[i+1].equals("*")){
                            operator[i+2]=String.valueOf(Float.parseFloat(operator[i])*Float.parseFloat(operator[i+2]));

                        }else if(operator[i+1].equals("/")){
                            operator[i+2]=String.valueOf(Float.parseFloat(operator[i])/Float.parseFloat(operator[i+2]));
                        }

                    }

                    text.setText(operator[operator.length-1]);
                    Log.d("Out put : ",operator[operator.length-1]);
                }
            }

        });






    }
}