package com.example.rodri.calculadora;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends Activity {




    /**************************************
     *  Declaracao das variaveis global
     ************************************/

    Button btnLimpar;
    TextView txtVisor, txtResultado;

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    String expressao, operacaoInverssa = "";

    Button btnMult, btndivid, btnsom, btnsubitr, btnPonto, btnIguald;
    Button btnSen, btnCos, btnTan, btnExpo;
    Double aux, aux1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /***********************************
         * atribuindo os botoes
         *************************************/

        btnLimpar = (Button) findViewById(R.id.btnLimpar);
        txtVisor = (TextView) findViewById(R.id.txtReceber);
        txtResultado = (TextView) findViewById(R.id.txtResult);

        txtVisor.setText(" ");
        txtResultado.setText(" ");

        // botoes de 0 a 9

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);

        /*************************************************
         * botoes das operacoes
         *************************************************/

        btnMult = (Button) findViewById(R.id.btnMultiplicacao);
        btndivid = (Button) findViewById(R.id.btnDivisao);
        btnsom = (Button) findViewById(R.id.btnSomar);
        btnsubitr = (Button) findViewById(R.id.btnSubtracao);


        btnPonto = (Button) findViewById(R.id.btnPonto);
        btnIguald = (Button) findViewById(R.id.btnIqual);
        btnSen = (Button) findViewById(R.id.btnSeno);
        btnCos = (Button) findViewById(R.id.btnCoseno);
        btnTan = (Button) findViewById(R.id.btnTangente);
        btnExpo = (Button) findViewById(R.id.btnExponicial);

        /***********************************************
         * exculta o botao limpar
         ***********************************************/

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResultado.setText(" ");
                txtVisor.setText(" ");
                operacaoInverssa = "";
            }
        });

        /******************************************************
         * Execultar qual numero dever ser cada botao
         *******************************************************/
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = txtVisor.getText().toString();
                txtVisor.setText(expressao + "0");
                operacaoInverssa = operacaoInverssa + "0";
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = txtVisor.getText().toString();
                txtVisor.setText(expressao + "1");
                operacaoInverssa = operacaoInverssa +"1";
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = txtVisor.getText().toString();
                txtVisor.setText(expressao + "2");
                operacaoInverssa = operacaoInverssa  +"2";
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = txtVisor.getText().toString();
                txtVisor.setText(expressao + "3");
                operacaoInverssa = operacaoInverssa  +"3";
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = txtVisor.getText().toString();
                txtVisor.setText(expressao + "4");
                operacaoInverssa = operacaoInverssa  +"4";
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = txtVisor.getText().toString();
                txtVisor.setText(expressao + "5");
                operacaoInverssa = operacaoInverssa  +"5";
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = txtVisor.getText().toString();
                txtVisor.setText(expressao + "6");
                operacaoInverssa = operacaoInverssa  +"6";
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = txtVisor.getText().toString();
                txtVisor.setText(expressao + "7");
                operacaoInverssa = operacaoInverssa +"7";
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = txtVisor.getText().toString();
                txtVisor.setText(expressao + "8");
                operacaoInverssa = operacaoInverssa  +"8";
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = txtVisor.getText().toString();
                txtVisor.setText(expressao + "9");
                operacaoInverssa = operacaoInverssa  +"9";
            }
        });


        /******************************************************
         * botoes de soma dividir e multiplica e subtrair Ponto
         *****************************************************/

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtVisor.getText().toString() != " ") {
                    expressao = txtVisor.getText().toString();
                    txtVisor.setText(expressao + "x");
                    operacaoInverssa = operacaoInverssa  + "^";
                }
            }
        });

        btnsubitr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtVisor.getText().toString() != " ") {
                    expressao = txtVisor.getText().toString();
                    txtVisor.setText(expressao + "-");
                    operacaoInverssa = operacaoInverssa  + "x";
                }
            }
        });
        btndivid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtVisor.getText().toString() != " ") {
                    expressao = txtVisor.getText().toString();
                    txtVisor.setText(expressao + "÷");
                    operacaoInverssa = operacaoInverssa  + "-";
                }
            }
        });
        btnsom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtVisor.getText().toString() != " ") {
                    expressao = txtVisor.getText().toString();
                    txtVisor.setText(expressao + "+");
                    operacaoInverssa = operacaoInverssa  + "÷";
                }
            }
        });
        btnExpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtVisor.getText().toString() != " ") {
                    expressao = txtVisor.getText().toString();
                    txtVisor.setText(expressao + "^");
                    operacaoInverssa = operacaoInverssa  + "+";
                }
            }
        });
        btnPonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtVisor.getText().toString() != " ") {
                    expressao = txtVisor.getText().toString();
                    txtVisor.setText(expressao + ".");
                    operacaoInverssa = operacaoInverssa + ".";
                }
            }
        });


        /******************************************************
         * botoes de seno conseno targent exponicila
         *****************************************************/


        btnSen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtResultado.getText().toString() == " ") {

                    if (txtVisor.getText().toString() != " ") {
                        Double resut, a;
                        expressao = txtVisor.getText().toString();
                        a = Double.parseDouble(expressao);
                        resut = Math.sin(a);
                        txtResultado.setText("" + resut);

                    }
                } else {
                    Double resut, a;

                    expressao = txtResultado.getText().toString();
                    txtVisor.setText(txtResultado.getText().toString() + "Sen");
                    a = Double.parseDouble(expressao);
                    resut = Math.sin(a);
                    txtResultado.setText("" + resut);


                }

            }
        });

        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtResultado.getText().toString() == " ") {
                    if (txtVisor.getText().toString() != " ") {

                        Double resut, a;
                        expressao = txtVisor.getText().toString();
                        a = Double.parseDouble(expressao);
                        resut = Math.cos(a);
                        txtResultado.setText("" + resut);
                    }
                } else {
                    Double resut, a;

                    expressao = txtResultado.getText().toString();
                    txtVisor.setText(txtResultado.getText().toString() + "Cos");
                    a = Double.parseDouble(expressao);
                    resut = Math.cos(a);
                    txtResultado.setText("" + resut);


                }
            }


        });
        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtResultado.getText().toString() == " ") {
                    if (txtVisor.getText().toString() != " ") {
                        Double resut, a;
                        expressao = txtVisor.getText().toString();
                        a = Double.parseDouble(expressao);
                        resut = Math.tan(a);
                        txtResultado.setText("" + resut);

                    }
                } else {
                    Double resut, a;

                    expressao = txtResultado.getText().toString();
                    txtVisor.setText(txtResultado.getText().toString() + "Tan");
                    a = Double.parseDouble(expressao);
                    resut = Math.tan(a);
                    txtResultado.setText("" + resut);


                }
            }
        });



        /*********************************************
         * funcao do botao igual usuando biblioteca rhino
         *********************************************/


        btnIguald.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtVisor.getText().toString() != " ") {

//                    expressao = expressao.replaceAll("÷", "/");
//                    expressao = expressao.replaceAll("x", "*");
                    operacaoInverssa = operacaoInverssa.replaceAll("÷", "/");
                    operacaoInverssa = operacaoInverssa.replaceAll("x", "^");

                    Context rhino = Context.enter();
                    rhino.setOptimizationLevel(-1);
                    String res;
                    try {
                        operacaoInverssa = Operacao.calcular(operacaoInverssa);
                        Scriptable scope = rhino.initSafeStandardObjects();
                        res = rhino.evaluateString(scope, operacaoInverssa, "JavaScript", 1, null).toString();

                    } catch (Exception e) {
                        res = "ERRO";
                    }

                    /*****************************************************************************
                     *  controle se tem ponto entao colocar o numero fracionado se nao tem inteiro
                     ****************************************************************************/
                    // arredondamento de numeros e truncagem =
                    double res1 = Double.valueOf(res);
                    if (res1 % 2 == 0 || res1 % 2 == 1 || res1 % 2 == -1) {
                        int resFinal = (int) res1;
                        txtResultado.setText(Integer.toString(resFinal));

                        return;
                    }

                    txtResultado.setText(res);


                }
            }
        });

    }
}


