package com.example.user.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ComponentInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Scanner;

import static com.example.user.myapplication.PlayerStorage.owin;
import static com.example.user.myapplication.PlayerStorage.win;
import static com.example.user.myapplication.PlayerStorage.xwin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView x = findViewById(R.id.x);
        TextView o = findViewById(R.id.o);
        PlayerStorage player = new PlayerStorage();
        xwin=player.getXwin();
        owin=player.getOwin();
        String a = String.valueOf(xwin);
        String b = String.valueOf(owin);

        if((xwin==owin)&(xwin==0)){
            x.setText("0");
            o.setText("0");
        }
        else{
            x.setText(a);
            o.setText(b);
        }
    }

    public void c00(View view) {


        PlayerStorage player = new PlayerStorage();
        String currentPlayer = player.getCurrentPlayer();
        String c00 = player.getC00();
        Button button00 = (Button) findViewById(R.id.button);
        CharSequence empty = button00.getText();
        System.out.println(empty);
        int xwin = player.getXwin();
        int owin = player.getOwin();
        int win = player.getWin();

        if ((empty!="X")&(empty!="O")) {

            if (currentPlayer == null) {
                currentPlayer = "X";
            }

            switch (currentPlayer) {
                case "X":
                    button00.setVisibility(View.VISIBLE);
                    button00.setText("X");
                    currentPlayer = "O";
                    c00 = "X";
                    break;
                case "O":
                    button00.setVisibility(View.VISIBLE);
                    button00.setText("O");
                    currentPlayer = "X";
                    c00="O";
                    break;
            }
            System.out.println(currentPlayer);
            player.setCurrentPlayer(currentPlayer);
            System.out.println(player.getCurrentPlayer());
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Клетка занята", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();        }
        player.setC00(c00);
        String winner = player.getWinner();
        win = player.getWin();
        if (win == 1) {
            if (winner == "X") {
                Toast toast = Toast.makeText(getApplicationContext(), "Победа крестиков!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                xwin = player.getXwin();
                xwin = xwin+1;
                player.setXwin(xwin);
            }
            if (winner == "O") {
                Toast toast = Toast.makeText(getApplicationContext(), "Победа ноликов!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                owin = player.getOwin();
                owin = owin+1;
                player.setOwin(owin);

            }
            System.out.println(winner);
            if (winner == "none") {
                Toast toast = Toast.makeText(getApplicationContext(), "Победила дружба!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();

            }
            Button button1 = (Button) findViewById(R.id.button6);
            Button button2 = (Button) findViewById(R.id.button7);
            Button button3 = (Button) findViewById(R.id.button8);
            Button button4 = (Button) findViewById(R.id.button9);
            Button button5 = (Button) findViewById(R.id.button10);
            Button button6 = (Button) findViewById(R.id.button5);
            Button button7 = (Button) findViewById(R.id.button11);
            Button button8 = (Button) findViewById(R.id.button4);
            Button button9 = (Button)findViewById(R.id.button) ;
            button9.setText(null);
            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            TextView x = findViewById(R.id.x);
            TextView o = findViewById(R.id.o);
           xwin= player.getXwin();
           owin = player.getOwin();
            String a = String.valueOf(xwin);
            String b = String.valueOf(owin);
            x.setText(a);
            o.setText(b);
            win=0;
            player.setWin(win);
        }
    }

    public void c22(View view) {

        PlayerStorage player = new PlayerStorage();
        int xwin = player.getXwin();
        int owin = player.getOwin();
        String currentPlayer = player.getCurrentPlayer();
        String c22 = player.getC22();
        Button button00 = (Button) findViewById(R.id.button6);
        int win = player.getWin();
        CharSequence empty = button00.getText();
        if ((empty!="X")&(empty!="O")) {
            if (currentPlayer == null) {
                currentPlayer = "X";
            }

            switch (currentPlayer) {
                case "X":
                    button00.setVisibility(View.VISIBLE);
                    button00.setText("X");
                    currentPlayer = "O";
                    c22 = "X";
                    break;
                case "O":
                    button00.setVisibility(View.VISIBLE);
                    button00.setText("O");
                    currentPlayer = "X";
                    c22="O";
                    break;
            }
            System.out.println(currentPlayer);
            player.setCurrentPlayer(currentPlayer);
            System.out.println(player.getCurrentPlayer());
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Клетка занята", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();        }
        player.setC22(c22);

        String winner = player.getWinner();
        win = player.getWin();
        if (win == 1) {
            if (winner == "X") {
                Toast toast = Toast.makeText(getApplicationContext(), "Победа крестиков!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                xwin = player.getXwin();
                xwin = xwin+1;
                player.setXwin(xwin);
            }
            if (winner == "O") {
                Toast toast = Toast.makeText(getApplicationContext(), "Победа ноликов!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                owin = player.getOwin();
                owin = owin+1;
                player.setOwin(owin);
            }
            Button button9 = (Button)findViewById(R.id.button) ;
            button9.setText(null);
            Button button1 = (Button) findViewById(R.id.button6);
            Button button2 = (Button) findViewById(R.id.button7);
            Button button3 = (Button) findViewById(R.id.button8);
            Button button4 = (Button) findViewById(R.id.button9);
            Button button5 = (Button) findViewById(R.id.button10);
            Button button6 = (Button) findViewById(R.id.button5);
            Button button7 = (Button) findViewById(R.id.button11);
            Button button8 = (Button) findViewById(R.id.button4);
            button00.setText(null);
            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            TextView x = findViewById(R.id.x);
            TextView o = findViewById(R.id.o);
            xwin= player.getXwin();
            owin = player.getOwin();
            String a = String.valueOf(xwin);
            String b = String.valueOf(owin);
            x.setText(a);
            o.setText(b);
            win=0;
            player.setWin(win);
        }
    }

    public void c21(View view) {
        PlayerStorage player = new PlayerStorage();
        int xwin = player.getXwin();
        int owin = player.getOwin();
        String currentPlayer = player.getCurrentPlayer();
        String c21 = player.getC21();
        Button button00 = (Button) findViewById(R.id.button7);
        int win = player.getWin();
        CharSequence empty = button00.getText();
        if ((empty!="X")&(empty!="O")) {
            if (currentPlayer == null) {
                currentPlayer = "X";
            }

            switch (currentPlayer) {
                case "X":
                    button00.setVisibility(View.VISIBLE);
                    button00.setText("X");
                    currentPlayer = "O";
                    c21 = "X";
                    break;
                case "O":
                    button00.setVisibility(View.VISIBLE);
                    button00.setText("O");
                    currentPlayer = "X";
                    c21="O";
                    break;
            }
            System.out.println(currentPlayer);
            player.setCurrentPlayer(currentPlayer);
            System.out.println(player.getCurrentPlayer());
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Клетка занята", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();        }
        player.setC21(c21);

        String winner = player.getWinner();
        win = player.getWin();
        if (win == 1) {
            if (winner == "X") {
                Toast toast = Toast.makeText(getApplicationContext(), "Победа крестиков!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                xwin = player.getXwin();
                xwin = xwin+1;
                player.setXwin(xwin);
            }
            if (winner == "O") {
                Toast toast = Toast.makeText(getApplicationContext(), "Победа ноликов!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                owin = player.getOwin();
                owin = owin+1;
                player.setOwin(owin);

            }
            Button button9 = (Button)findViewById(R.id.button) ;
            button9.setText(null);
            Button button1 = (Button) findViewById(R.id.button6);
            Button button2 = (Button) findViewById(R.id.button7);
            Button button3 = (Button) findViewById(R.id.button8);
            Button button4 = (Button) findViewById(R.id.button9);
            Button button5 = (Button) findViewById(R.id.button10);
            Button button6 = (Button) findViewById(R.id.button5);
            Button button7 = (Button) findViewById(R.id.button11);
            Button button8 = (Button) findViewById(R.id.button4);
            button00.setText(null);
            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            TextView x = findViewById(R.id.x);
            TextView o = findViewById(R.id.o);
            xwin= player.getXwin();
            owin = player.getOwin();
            String a = String.valueOf(xwin);
            String b = String.valueOf(owin);
            x.setText(a);
            o.setText(b);
            win=0;
            player.setWin(win);
        }

    }


    public void c20(View view) {
        PlayerStorage player = new PlayerStorage();
        int xwin = player.getXwin();
        int owin = player.getOwin();
        String currentPlayer = player.getCurrentPlayer();
        String c20 = player.getC20();
        int win = player.getWin();
        Button button00 = (Button) findViewById(R.id.button8);

        CharSequence empty = button00.getText();
        if ((empty!="X")&(empty!="O")) {
            if (currentPlayer == null) {
                currentPlayer = "X";
            }

            switch (currentPlayer) {
                case "X":
                    button00.setVisibility(View.VISIBLE);
                    button00.setText("X");
                    currentPlayer = "O";
                    c20 = "X";
                    break;
                case "O":
                    button00.setVisibility(View.VISIBLE);
                    button00.setText("O");
                    currentPlayer = "X";
                    c20="O";
                    break;
            }
            System.out.println(currentPlayer);
            player.setCurrentPlayer(currentPlayer);
            System.out.println(player.getCurrentPlayer());
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Клетка занята", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();        }
        player.setC20(c20);
        String winner = player.getWinner();
        win = player.getWin();
        if (win == 1) {
            if (winner == "X") {
                Toast toast = Toast.makeText(getApplicationContext(), "Победа крестиков!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                xwin = player.getXwin();
                xwin = xwin+1;
                player.setXwin(xwin);
            }
            if (winner == "O") {
                Toast toast = Toast.makeText(getApplicationContext(), "Победа ноликов!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                owin = player.getOwin();
                owin = owin+1;
                player.setOwin(owin);
            }
            Button button9 = (Button)findViewById(R.id.button) ;
            button9.setText(null);
            Button button1 = (Button) findViewById(R.id.button6);
            Button button2 = (Button) findViewById(R.id.button7);
            Button button3 = (Button) findViewById(R.id.button8);
            Button button4 = (Button) findViewById(R.id.button9);
            Button button5 = (Button) findViewById(R.id.button10);
            Button button6 = (Button) findViewById(R.id.button5);
            Button button7 = (Button) findViewById(R.id.button11);
            Button button8 = (Button) findViewById(R.id.button4);
            button00.setText(null);
            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            TextView x = findViewById(R.id.x);
            TextView o = findViewById(R.id.o);
            xwin= player.getXwin();
            owin = player.getOwin();
            String a = String.valueOf(xwin);
            String b = String.valueOf(owin);
            x.setText(a);
            o.setText(b);
            win=0;
            player.setWin(win);
        }
    }

    public void c12(View view) {
        PlayerStorage player = new PlayerStorage();
        int xwin = player.getXwin();
        int owin = player.getOwin();
        String currentPlayer = player.getCurrentPlayer();
        String c12 = player.getC12();
        Button button00 = (Button) findViewById(R.id.button9);
        int win = player.getWin();
        CharSequence empty = button00.getText();
        if ((empty!="X")&(empty!="O")) {
            if (currentPlayer == null) {
                currentPlayer = "X";
            }

            switch (currentPlayer) {
                case "X":
                    button00.setVisibility(View.VISIBLE);
                    button00.setText("X");
                    currentPlayer = "O";
                    c12 = "X";
                    break;
                case "O":
                    button00.setVisibility(View.VISIBLE);
                    button00.setText("O");
                    currentPlayer = "X";
                    c12="O";
                    break;
            }
            System.out.println(currentPlayer);
            player.setCurrentPlayer(currentPlayer);
            System.out.println(player.getCurrentPlayer());
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Клетка занята", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();        }
        player.setC12(c12);

        String winner = player.getWinner();
        win = player.getWin();
        if (win == 1) {
            if (winner == "X") {
                Toast toast = Toast.makeText(getApplicationContext(), "Победа крестиков!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                xwin = player.getXwin();
                xwin = xwin+1;
                player.setXwin(xwin);
            }
            if (winner == "O") {
                Toast toast = Toast.makeText(getApplicationContext(), "Победа ноликов!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                owin = player.getOwin();
                owin = owin+1;
                player.setOwin(owin);
            }
            Button button9 = (Button)findViewById(R.id.button) ;
            button9.setText(null);
            Button button1 = (Button) findViewById(R.id.button6);
            Button button2 = (Button) findViewById(R.id.button7);
            Button button3 = (Button) findViewById(R.id.button8);
            Button button4 = (Button) findViewById(R.id.button9);
            Button button5 = (Button) findViewById(R.id.button10);
            Button button6 = (Button) findViewById(R.id.button5);
            Button button7 = (Button) findViewById(R.id.button11);
            Button button8 = (Button) findViewById(R.id.button4);
            button00.setText(null);
            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            TextView x = findViewById(R.id.x);
            TextView o = findViewById(R.id.o);
            xwin= player.getXwin();
            owin = player.getOwin();
            String a = String.valueOf(xwin);
            String b = String.valueOf(owin);
            x.setText(a);
            o.setText(b);
            win=0;
            player.setWin(win);
        }
    }

    public void c11(View view) {
        PlayerStorage player = new PlayerStorage();
        String currentPlayer = player.getCurrentPlayer();
        int xwin = player.getXwin();
        int owin = player.getOwin();
        String c11 = player.getC11();
        Button button00 = (Button) findViewById(R.id.button10);
        int win = player.getWin();
        CharSequence empty = button00.getText();
        if ((empty!="X")&(empty!="O")) {
            if (currentPlayer == null) {
                currentPlayer = "X";
            }

            switch (currentPlayer) {
                case "X":
                    button00.setVisibility(View.VISIBLE);
                    button00.setText("X");
                    currentPlayer = "O";
                    c11 = "X";
                    break;
                case "O":
                    button00.setVisibility(View.VISIBLE);
                    button00.setText("O");
                    currentPlayer = "X";
                    c11="O";
                    break;
            }
            System.out.println(currentPlayer);
            player.setCurrentPlayer(currentPlayer);
            System.out.println(player.getCurrentPlayer());
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Клетка занята", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();        }
        player.setC11(c11);

        String winner = player.getWinner();
        win = player.getWin();
        if (win == 1) {
            if (winner == "X") {
                Toast toast = Toast.makeText(getApplicationContext(), "Победа крестиков!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                xwin = player.getXwin();
                xwin = xwin+1;
                player.setXwin(xwin);
            }
            if (winner == "O") {
                Toast toast = Toast.makeText(getApplicationContext(), "Победа ноликов!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                owin = player.getOwin();
                owin = owin+1;
                player.setOwin(owin);
            }
            Button button9 = (Button)findViewById(R.id.button) ;
            button9.setText(null);
            Button button1 = (Button) findViewById(R.id.button6);
            Button button2 = (Button) findViewById(R.id.button7);
            Button button3 = (Button) findViewById(R.id.button8);
            Button button4 = (Button) findViewById(R.id.button9);
            Button button5 = (Button) findViewById(R.id.button10);
            Button button6 = (Button) findViewById(R.id.button5);
            Button button7 = (Button) findViewById(R.id.button11);
            Button button8 = (Button) findViewById(R.id.button4);
            button00.setText(null);
            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            TextView x = findViewById(R.id.x);
            TextView o = findViewById(R.id.o);
            xwin= player.getXwin();
            owin = player.getOwin();
            String a = String.valueOf(xwin);
            String b = String.valueOf(owin);
            x.setText(a);
            o.setText(b);
            win=0;
            player.setWin(win);
        }
    }

    public void c10(View view) {
        PlayerStorage player = new PlayerStorage();
        int xwin = player.getXwin();
        int owin = player.getOwin();
        String currentPlayer = player.getCurrentPlayer();
        String c10 = player.getC10();
        Button button00 = (Button) findViewById(R.id.button11);
        int win = player.getWin();
        CharSequence empty = button00.getText();
        if ((empty!="X")&(empty!="O")) {
            if (currentPlayer == null) {
                currentPlayer = "X";
            }

            switch (currentPlayer) {
                case "X":
                    button00.setVisibility(View.VISIBLE);
                    button00.setText("X");
                    currentPlayer = "O";
                    c10 = "X";
                    break;
                case "O":
                    button00.setVisibility(View.VISIBLE);
                    button00.setText("O");
                    currentPlayer = "X";
                    c10="O";
                    break;
            }
            System.out.println(currentPlayer);
            player.setCurrentPlayer(currentPlayer);
            System.out.println(player.getCurrentPlayer());
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Клетка занята", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();        }
        player.setC10(c10);

        String winner = player.getWinner();
        win = player.getWin();
        if (win == 1) {
            if (winner == "X") {
                Toast toast = Toast.makeText(getApplicationContext(), "Победа крестиков!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                xwin = player.getXwin();
                xwin = xwin+1;
                player.setXwin(xwin);
            }
            if (winner == "O") {
                Toast toast = Toast.makeText(getApplicationContext(), "Победа ноликов!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                owin = player.getOwin();
                owin = owin+1;
                player.setOwin(owin);
            }
            Button button9 = (Button)findViewById(R.id.button) ;
            button9.setText(null);
            Button button1 = (Button) findViewById(R.id.button6);
            Button button2 = (Button) findViewById(R.id.button7);
            Button button3 = (Button) findViewById(R.id.button8);
            Button button4 = (Button) findViewById(R.id.button9);
            Button button5 = (Button) findViewById(R.id.button10);
            Button button6 = (Button) findViewById(R.id.button5);
            Button button7 = (Button) findViewById(R.id.button11);
            Button button8 = (Button) findViewById(R.id.button4);
            button00.setText(null);
            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            TextView x = findViewById(R.id.x);
            TextView o = findViewById(R.id.o);
            xwin= player.getXwin();
            owin = player.getOwin();
            String a = String.valueOf(xwin);
            String b = String.valueOf(owin);
            x.setText(a);
            o.setText(b);
            win=0;
            player.setWin(win);
        }
    }

    public void c02(View view) {
        PlayerStorage player = new PlayerStorage();
        int xwin = player.getXwin();
        int owin = player.getOwin();
        String currentPlayer = player.getCurrentPlayer();
        String c02 = player.getC02();
        Button button00 = (Button) findViewById(R.id.button5);
        int win = player.getWin();
        CharSequence empty = button00.getText();
        if ((empty!="X")&(empty!="O")) {
            if (currentPlayer == null) {
                currentPlayer = "X";
            }

            switch (currentPlayer) {
                case "X":
                    button00.setVisibility(View.VISIBLE);
                    button00.setText("X");
                    currentPlayer = "O";
                    c02 = "X";
                    break;
                case "O":
                    button00.setVisibility(View.VISIBLE);
                    button00.setText("O");
                    currentPlayer = "X";
                    c02="O";
                    break;
            }
            System.out.println(currentPlayer);
            player.setCurrentPlayer(currentPlayer);
            System.out.println(player.getCurrentPlayer());
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Клетка занята", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();        }
        player.setC02(c02);

        String winner = player.getWinner();
        win = player.getWin();
        if (win == 1) {
            if (winner == "X") {
                Toast toast = Toast.makeText(getApplicationContext(), "Победа крестиков!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                xwin = player.getXwin();
                xwin = xwin+1;
                player.setXwin(xwin);
            }
            if (winner == "O") {
                Toast toast = Toast.makeText(getApplicationContext(), "Победа ноликов!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                owin = player.getOwin();
                owin = owin+1;
                player.setOwin(owin);
            }
            Button button9 = (Button)findViewById(R.id.button) ;
            button9.setText(null);
            Button button1 = (Button) findViewById(R.id.button6);
            Button button2 = (Button) findViewById(R.id.button7);
            Button button3 = (Button) findViewById(R.id.button8);
            Button button4 = (Button) findViewById(R.id.button9);
            Button button5 = (Button) findViewById(R.id.button10);
            Button button6 = (Button) findViewById(R.id.button5);
            Button button7 = (Button) findViewById(R.id.button11);
            Button button8 = (Button) findViewById(R.id.button4);
            button00.setText(null);
            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            TextView x = findViewById(R.id.x);
            TextView o = findViewById(R.id.o);
            xwin= player.getXwin();
            owin = player.getOwin();
            String a = String.valueOf(xwin);
            String b = String.valueOf(owin);
            x.setText(a);
            o.setText(b);
            win=0;
            player.setWin(win);
        }
    }

    public void c01(View view) {

        PlayerStorage player = new PlayerStorage();
        int xwin = player.getXwin();
        int owin = player.getOwin();
        String currentPlayer = player.getCurrentPlayer();
        String c01 = player.getC01();
        Button button00 = (Button) findViewById(R.id.button4);
        int win = player.getWin();
        CharSequence empty = button00.getText();
        if ((empty!="X")&(empty!="O")) {
            if (currentPlayer == null) {
                currentPlayer = "X";
            }

            switch (currentPlayer) {
                case "X":
                    button00.setVisibility(View.VISIBLE);
                    button00.setText("X");
                    currentPlayer = "O";
                    c01 = "X";
                    break;
                case "O":
                    button00.setVisibility(View.VISIBLE);
                    button00.setText("O");
                    currentPlayer = "X";
                    c01="O";
                    break;
            }
            System.out.println(currentPlayer);
            player.setCurrentPlayer(currentPlayer);
            System.out.println(player.getCurrentPlayer());
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Клетка занята", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
        player.setC01(c01);

        String winner = player.getWinner();
        win = player.getWin();
        if (win == 1) {
            if (winner == "X") {
                Toast toast = Toast.makeText(getApplicationContext(), "Победа крестиков!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                xwin = player.getXwin();
                xwin = xwin+1;
                player.setXwin(xwin);
            }
            if (winner == "O") {
                Toast toast = Toast.makeText(getApplicationContext(), "Победа ноликов!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                owin = player.getOwin();
                owin = owin+1;
                player.setOwin(owin);
            }
            Button button9 = (Button)findViewById(R.id.button) ;
            button9.setText(null);
            Button button1 = (Button) findViewById(R.id.button6);
            Button button2 = (Button) findViewById(R.id.button7);
            Button button3 = (Button) findViewById(R.id.button8);
            Button button4 = (Button) findViewById(R.id.button9);
            Button button5 = (Button) findViewById(R.id.button10);
            Button button6 = (Button) findViewById(R.id.button5);
            Button button7 = (Button) findViewById(R.id.button11);
            Button button8 = (Button) findViewById(R.id.button4);
            button00.setText(null);
            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            TextView x = findViewById(R.id.x);
            TextView o = findViewById(R.id.o);
            xwin= player.getXwin();
            owin = player.getOwin();
            String a = String.valueOf(xwin);
            String b = String.valueOf(owin);
            x.setText(a);
            o.setText(b);
            win=0;
            player.setWin(win);
        }
    }

    public void exit(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }

    public void reset(View view) {
        PlayerStorage player = new PlayerStorage();
        TextView x = findViewById(R.id.x);
        TextView o = findViewById(R.id.o);
        xwin= player.getXwin();
        owin = player.getOwin();
        player.setXwin(0);
        player.setOwin(0);
        x.setText("0");
        o.setText("0");
    }
}



   /*public class TicTacToe extends Activity {
        int[][] gameBoard = new int[3][3];
        Scanner inputScan = new Scanner(System.in);

        String playerX = "X", playerC = "O", currentPlayer = playerX;
        int check = 0;
        int win = 0;
        int row, col;
        int TrueCheck = 0;
        int k = 0;
            final Button button00 = (Button) findViewById(R.id.button);
            button00.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    button00.setText("X");
                    row = 0;
                    col = 0;
                    if (currentPlayer == playerX) {
                        gameBoard[0][0] = 1;
                        button00.setText("X");
                        button00.setTextSize(10);
                    }
                    if (currentPlayer == playerC) {
                        gameBoard[0][0] = 2;
                        button00.setText("0");
                        button00.setTextSize(10);
                    }
                }
            });
            final Button button10 = (Button) findViewById(R.id.button4);
            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    row = 1;
                    col = 0;
                    if (currentPlayer == playerX) {
                        gameBoard[1][0] = 1;
                        button10.setText("X");
                        button10.setTextSize(10);
                    }
                    if (currentPlayer == playerC) {
                        gameBoard[1][0] = 2;
                        button10.setText("0");
                        button10.setTextSize(10);
                    }
                }
            });
            final Button button20 = (Button) findViewById(R.id.button5);
            button20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row = 2;
                    col = 0;
                    if (currentPlayer == playerX) {
                        gameBoard[2][0] = 1;
                        button20.setText("X");
                        button20.setTextSize(10);
                    }
                    if (currentPlayer == playerC) {
                        gameBoard[2][0] = 2;
                        button20.setText("0");
                        button20.setTextSize(10);
                    }
                }
            });
            final Button button01 = (Button) findViewById(R.id.button6);
            button01.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row = 0;
                    col = 1;
                    if (currentPlayer == playerX) {
                        gameBoard[0][1] = 1;
                        button01.setText("X");
                        button01.setTextSize(10);
                    }
                    if (currentPlayer == playerC) {
                        gameBoard[0][1] = 2;
                        button01.setText("0");
                        button01.setTextSize(10);
                    }
                }
            });
            final Button button11 = (Button) findViewById(R.id.button7);
            button11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row = 1;
                    col = 1;
                    if (currentPlayer == playerX) {
                        gameBoard[1][1] = 1;
                        button11.setText("X");
                        button11.setTextSize(10);
                    }
                    if (currentPlayer == playerC) {
                        gameBoard[1][1] = 2;
                        button11.setText("0");
                        button11.setTextSize(10);
                    }
                }
            });
            final Button button21 = (Button) findViewById(R.id.button8);
            button21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row = 2;
                    col = 1;
                    if (currentPlayer == playerX) {
                        gameBoard[2][1] = 1;
                        button21.setText("X");
                        button21.setTextSize(10);
                    }
                    if (currentPlayer == playerC) {
                        gameBoard[2][1] = 2;
                        button21.setText("0");
                        button21.setTextSize(10);
                    }
                }
            });
            final Button button02 = (Button) findViewById(R.id.button9);
            button02.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row = 0;
                    col = 2;
                    if (currentPlayer == playerX) {
                        gameBoard[0][2] = 1;
                        button02.setText("X");
                        button02.setTextSize(10);
                    }
                    if (currentPlayer == playerC) {
                        gameBoard[0][2] = 2;
                        button02.setText("0");
                        button02.setTextSize(10);
                    }
                }
            });
            final Button button12 = (Button) findViewById(R.id.button10);
            button12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row = 1;
                    col = 2;
                    if (currentPlayer == playerX) {
                        gameBoard[1][2] = 1;
                        button12.setText("X");
                        button12.setTextSize(10);
                    }
                    if (currentPlayer == playerC) {
                        gameBoard[1][2] = 2;
                        button12.setText("0");
                        button12.setTextSize(10);
                    }
                }
            });
            final Button button22 = (Button) findViewById(R.id.button11);
            button22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row = 2;
                    col = 2;
                    if (currentPlayer == playerX) {
                        gameBoard[2][2] = 1;
                        button22.setText("X");
                        button22.setTextSize(10);

                    }
                    if (currentPlayer == playerC) {
                        gameBoard[2][2] = 2;
                        button22.setText("0");
                        button22.setTextSize(10);
                    }
                }
            });
        }
    }*/

/*
 public TicTacToe() {

            initGameBoard();

            while (true) {
                System.out.println("Ход игрока " + currentPlayer);
                CheckTrue();
                if (TrueCheck == 0) {
                    CheckSlot();
                    WinCheck();
                    ProgressCheck();
                    if ((check == 0) & (win != 1) & (k != 9)) {
                        gameBoard[row][col] = currentPlayer.equalsIgnoreCase(playerX) ? 1 : 2;

                        currentPlayer = currentPlayer.equals(playerX) ? playerC : playerX;
                    }
                    if (win == 1) {
                        break;
                    }
                    if (k == 9) {
                        System.out.println("Игра окончена");
                        break;
                    }
                }
            }

        }

        private void ProgressCheck() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (gameBoard[i][j] != 0) {
                        k = k + 1;
                    }
                }
            }
            if (k != 9) {
                k = 0;
            }
        }

        private void CheckTrue() {
            if ((row > 2) | (col > 2)) {
                System.out.println("Ошибка");
                TrueCheck = 1;
            } else {
                TrueCheck = 0;
            }
        }

        private void WinCheck() {
            for (int i = 0; i < 3; i++) {
                if ((gameBoard[i][0] == gameBoard[i][1]) & (gameBoard[i][1] == gameBoard[i][2]) & (gameBoard[i][0] != 0)) {
                    System.out.print("Победа ");
                    if (gameBoard[i][1] == 1) {
                        System.out.print("крестиков");
                    }
                    if (gameBoard[i][1] == 2) {
                        System.out.print("ноликов");
                    }
                    win = 1;
                }
                if ((gameBoard[0][i] == gameBoard[1][i]) & (gameBoard[2][i] == gameBoard[0][i]) & (gameBoard[0][i] != 0)) {
                    System.out.print("Победа ");
                    if (gameBoard[1][i] == 1) {
                        System.out.print("крестиков");
                    }
                    if (gameBoard[1][i] == 2) {
                        System.out.print("ноликов");
                    }
                    win = 1;
                }
            }
            if ((gameBoard[0][0] == gameBoard[1][1]) & (gameBoard[1][1] == gameBoard[2][2]) & (gameBoard[0][0] != 0) & (gameBoard[1][1] != 0) & (gameBoard[2][2] != 0)) {
                System.out.print("Победа ");
                if (gameBoard[1][1] == 1) {
                    System.out.print("крестиков");
                }
                if (gameBoard[1][1] == 2) {
                    System.out.print("ноликов");
                }
                win = 1;
            }
            if ((gameBoard[0][2] == gameBoard[1][1]) & (gameBoard[1][1] == gameBoard[2][0]) & (gameBoard[0][0] != 0) & (gameBoard[1][1] != 0) & (gameBoard[2][0] != 0)) {
                System.out.print("Победа ");
                if (gameBoard[1][1] == 1) {
                    System.out.print("крестиков");
                }
                if (gameBoard[1][1] == 2) {
                    System.out.print("ноликов");
                }
                win = 1;
            }
        }

        private void CheckSlot() {
            if (gameBoard[row][col] != 0) {
                System.out.println("Клетка занята");
                check = 1;
            } else {
                check = 0;
            }
        }

        private void initGameBoard() {
            for (int row = 0; row < gameBoard.length; row++) {
                for (int col = 0; col < gameBoard[row].length; col++) {
                    gameBoard[row][col] = 0;
                }
            }
        }


    }*/
