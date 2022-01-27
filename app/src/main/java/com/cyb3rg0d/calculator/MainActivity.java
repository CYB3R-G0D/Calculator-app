package com.cyb3rg0d.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bpi,bequal,bplus,bmin,bmul,bdiv,binv,bsqrt,bsquare,bfact,bln,blog,btan,bcos,bsin,bb1,bb2,bc,bac;
    TextView tvmain,tvsec;
    String pi = "3.14159265359";
    ArrayList<String> history = new ArrayList<>();
    ArrayAdapter<String> adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bpi = findViewById(R.id.bpi);
        bdot = findViewById(R.id.bdot);
        bequal = findViewById(R.id.bequal);
        bplus = findViewById(R.id.bplus);
        bmin = findViewById(R.id.bmin);
        bmul = findViewById(R.id.bmul);
        bdiv = findViewById(R.id.bdiv);
        binv = findViewById(R.id.binv);
        bsqrt = findViewById(R.id.bsqrt);
        bsquare = findViewById(R.id.bsquare);
        bfact = findViewById(R.id.bfact);
        bln = findViewById(R.id.bln);
        blog = findViewById(R.id.blog);
        btan = findViewById(R.id.btan);
        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        bc = findViewById(R.id.bc);
        bac = findViewById(R.id.bac);

        tvmain = findViewById(R.id.tvmain);
        tvsec = findViewById(R.id.tvsec);

        //onclick listeners
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().equals("0")) {

                    tvmain.setText("1");
                } else {

                    tvmain.setText(tvmain.getText() + "1");
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tvmain.getText().equals("0")) {

                    tvmain.setText("2");
                } else {

                    tvmain.setText(tvmain.getText()+"2");
                }

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tvmain.getText().equals("0")) {

                    tvmain.setText("3");
                } else {

                    tvmain.setText(tvmain.getText()+"3");
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().equals("0")) {

                    tvmain.setText("4");
                } else {

                    tvmain.setText(tvmain.getText()+"4");
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().equals("0")) {

                    tvmain.setText("5");
                } else {

                    tvmain.setText(tvmain.getText()+"5");
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().equals("0")) {

                    tvmain.setText("6");
                } else {

                    tvmain.setText(tvmain.getText()+"6");
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().equals("0")) {

                    tvmain.setText("7");
                } else {

                    tvmain.setText(tvmain.getText()+"7");
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().equals("0")) {

                    tvmain.setText("8");
                } else {

                    tvmain.setText(tvmain.getText()+"8");
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().equals("0")) {

                    tvmain.setText("9");
                } else {

                    tvmain.setText(tvmain.getText()+"9");
                }
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().equals("0")) {

                    tvmain.setText("0");
                } else {

                    tvmain.setText(tvmain.getText()+"0");
                }
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().equals("")) {

                    tvmain.setText("0.");
                } else {

                    tvmain.setText(tvmain.getText() + ".");
                }
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(100);
                tvmain.setText("0");
                tvsec.setText("");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvmain.getText().equals("")) {
                    tvmain.setText("0");
                }
                else if (tvmain.getText().equals("Infinity")) {
                    tvmain.setText("0");
                }
                else if (tvmain.getText().equals("-Infinity")) {
                    tvmain.setText("0");
                }
                else if (tvmain.getText().equals("NaN")) {
                    tvmain.setText("0");
                }
                else if (tvmain.getText().equals("sin")) {
                    tvmain.setText("0");
                }
                else if (tvmain.getText().equals("tan")) {
                    tvmain.setText("0");
                }
                else if (tvmain.getText().equals("cos")) {
                    tvmain.setText("0");
                }
                else if (tvmain.getText().equals("log")) {
                    tvmain.setText("0");
                }
                else if (tvmain.getText().equals("ln")) {
                    tvmain.setText("0");
                }
                else {
                    int len = tvmain.getText().length();
                    String s = tvmain.getText().toString();
                    if (s.charAt(len - 1) == '.') {
                        tvmain.setText(tvmain.getText().subSequence(0, tvmain.getText().length() - 1));

                    } else {
                        tvmain.setText(tvmain.getText().subSequence(0, tvmain.getText().length() - 1));
                    }
                }
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(100);

                if (tvmain.getText().equals("")) {

                    tvmain.setText("0"+"+");
                } else {

                    tvmain.setText(tvmain.getText()+"+");
                }

            }
        });
        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(100);

                if (tvmain.getText().equals("")) {

                    tvmain.setText("0"+"-");
                } else {

                    tvmain.setText(tvmain.getText()+"-");
                }

            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(100);

                if (tvmain.getText().equals("")) {

                    tvmain.setText("0"+"×");
                } else {

                    tvmain.setText(tvmain.getText()+"×");
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(100);

                if (tvmain.getText().equals("")) {

                    tvmain.setText("0"+"÷");
                } else {

                    tvmain.setText(tvmain.getText()+"÷");
                }
            }
        });
        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(100);

                if (tvmain.getText().equals("")) {

                    tvmain.setText("0");
                } else {

                    String val = tvmain.getText().toString();
                    double r = Math.sqrt(Double.parseDouble(val));
                    tvmain.setText(String.valueOf(r));
                }
            }
        });
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"(");
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+")");
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(100);
                tvsec.setText(bpi.getText());
                tvmain.setText(tvmain.getText()+pi);
            }
        });
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(100);
                tvmain.setText("sin"+tvmain.getText());
            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(100);
                tvmain.setText("cos"+tvmain.getText());
            }
        });
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(100);
                tvmain.setText("tan"+tvmain.getText());
            }
        });
        binv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(100);
                if (tvmain.getText().equals("")) {

                    tvmain.setText("0"+"^"+"(-1)");
                } else {

                    tvmain.setText(tvmain.getText()+"^"+"(-1)");
                }
            }
        });
        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(100);

                if (tvmain.getText().equals("")) {

                    tvmain.setText("0");
                } else {

                    String val = tvmain.getText().toString();
                    double r = Double.parseDouble((val));
                    int i = Integer.parseInt(val) - 1;

                    while (i > 0) {
                        r = r * i;
                        i--;
                    }

                    tvmain.setText(r+"");
                }
            }
        });
        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(100);

                if (tvmain.getText().equals("")) {

                    tvmain.setText("0");
                } else {

                    double d = Double.parseDouble(tvmain.getText().toString());
                    double square = d*d;
                    tvmain.setText(String.valueOf(square));
                    tvsec.setText(d+"²");
                }
            }
        });
        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText("ln"+tvmain.getText());
                vibe.vibrate(100);
            }
        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText("log"+tvmain.getText());
                vibe.vibrate(100);
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int len = tvmain.getText().length();
                String s = tvmain.getText().toString();
                vibe.vibrate(100);


                if (tvmain.getText().equals("")) {

                    tvmain.setText("0");
                }
                else  if (s.charAt(len - 1) == '+') {
                    tvmain.setText("0");

                }
                else  if (s.charAt(len - 1) == '-') {
                    tvmain.setText("0");

                }
                else  if (s.charAt(len - 1) == '×') {
                    tvmain.setText("0");

                }
                else  if (s.charAt(len - 1) == '÷') {
                    tvmain.setText("0");

                }
                else if (tvmain.getText().equals("sin")) {

                    tvmain.setText("0");
                }
                else if (tvmain.getText().equals("cos")) {

                    tvmain.setText("0");
                }
                else if (tvmain.getText().equals("tan")) {

                    tvmain.setText("0");
                }
                else if (tvmain.getText().equals("log")) {

                    tvmain.setText("0");
                }
                else if (tvmain.getText().equals("ln")) {

                    tvmain.setText("0");
                }
                else if (tvmain.getText().equals("(")) {

                    tvmain.setText("0");
                }
                else if (tvmain.getText().equals(")")) {

                    tvmain.setText("0");
                }
                else if (tvmain.getText().equals("Infinity")) {

                    tvmain.setText("Infinity");
                }
                else if (tvmain.getText().equals("-Infinity")) {

                    tvmain.setText("-Infinity");
                }
                else if (tvmain.getText().equals("NaN")) {

                    tvmain.setText("NaN");
                }
                else {

                    String val = tvmain.getText().toString();
                    String replacedstr = val.replace('÷','/').replace('×','*');
                    double result = eval(replacedstr);
                    tvmain.setText(String.valueOf(result));
                    tvsec.setText(val);
                    history.add(String.valueOf(val));;
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int item_id = item.getItemId();
        if (item_id==R.id.about){
            Intent intent = new Intent(this, About.class);
            startActivity(intent);
        } else if (item_id==R.id.history){
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
            View rowList = getLayoutInflater().inflate(R.layout.row, null);
            listView = rowList.findViewById(R.id.listView);
            adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, history);
            listView.setAdapter(adapter);
            adapter.notifyDataSetChanged();
            if(adapter.getCount()>0)
            {
                alertDialog.setTitle("History");
                alertDialog.setPositiveButton("clear", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        history.clear();
                        Toast.makeText(MainActivity.this,"History cleared",Toast.LENGTH_LONG).show();
                    }
                });
                alertDialog.setView(rowList);
                AlertDialog dialog = alertDialog.create();
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String  itemValue    = (String) listView.getItemAtPosition(position);
                        dialog.dismiss();
                        tvsec.setText(null);
                        tvmain.setText(itemValue);
                    }
                });
                dialog.show();
            }
            else
            {
                Toast.makeText(this, "History is empty", Toast.LENGTH_SHORT).show();
            }
        }
        return true;
    }

    //factorial function
    int factorial(int n)
    {
        return n == 1 || n == 0 ? 1 : n*factorial(n-1);
    }


    //eval function
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}