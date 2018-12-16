package com.example.user.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;

public class PlayerStorage extends MainActivity {
    static String currentPlayer="X";
    public void setCurrentPlayer(String currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public String getCurrentPlayer() {
        return currentPlayer;
    }
    static String c00,c01,c02,c10,c11,c12,c20,c21,c22;
    static int win;
    static String winner;

    public int getXwin() {
        return xwin;
    }

    public void setXwin(int xwin) {
        this.xwin = xwin;
    }

    public int getOwin() {
        return owin;
    }

    public void setOwin(int owin) {
        this.owin = owin;
    }

    static int xwin;
    static int owin;

    public String getWinner() {
        winCheck();
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public int getWin() {
        winCheck();
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public void winCheck(){
        if((c00==c01)&(c01==c02)&(c00!=null)){
        win =1;
        if(c00=="X"){
        winner="X";

        }
        if(c00=="O"){
            winner="O";
        }
        }

        if((c10==c11)&(c11==c12)&(c10!=null)){
            win =1;
            if(c10=="X"){
                winner="X";
            }
            if(c10=="O"){
                winner="O";
            }
        }
        if((c20==c21)&(c21==c22)&(c20!=null)){
            win =1;
            if(c20=="X"){
                winner="X";
            }
            if(c20=="O"){
                winner="O";
            }
        }

        if((c00==c10)&(c10==c20)&(c00!=null)){
            win =1;
            if(c00=="X"){
                winner="X";
            }
            if(c00=="O"){
                winner="O";
            }
        }

        if((c01==c11)&(c11==c21)&(c01!=null)){
            win =1;
            if(c01=="X"){
                winner="X";
            }
            if(c01=="O"){
                winner="O";
            }
        }

        if((c02==c12)&(c12==c22)&(c02!=null)){
            win =1;
            if(c02=="X"){
                winner="X";
            }
            if(c02=="O"){
                winner="O";
            }
        }
        if((c00==c11)&(c11==c22)&(c00!=null)){
            win =1;
            if(c00=="X"){
                winner="X";
            }
            if(c00=="O"){
                winner="O";
            }
        }
        if((c02==c11)&(c11==c20)&(c02!=null)){
            win =1;
            if(c02=="X"){
                winner="X";
            }
            if(c02=="O"){
                winner="O";
            }
        }
        if((c00!=null)&(c01!=null)&(c02!=null)&(c10!=null)&(c11!=null)&(c12!=null)&(c22!=null)&(c21!=null)&(c20!=null)&(win!=1)){
          win =1;
          winner="none";
        }
        if(win==1){
            c00=null;
            c01=null;
            c02=null;
            c10=null;
            c11=null;
            c12=null;
            c20=null;
            c21=null;
            c22=null;

        }
    }

    public String getC00() {
        return c00;
    }

    public void setC00(String c00) {
        this.c00 = c00;
    }

    public String getC01() {
        return c01;
    }

    public void setC01(String c01) {
        this.c01 = c01;
    }

    public String getC02() {
        return c02;
    }

    public void setC02(String c02) {
        this.c02 = c02;
    }

    public String getC10() {
        return c10;
    }

    public void setC10(String c10) {
        this.c10 = c10;
    }

    public String getC11() {
        return c11;
    }

    public void setC11(String c11) {
        this.c11 = c11;
    }

    public String getC12() {
        return c12;
    }

    public void setC12(String c12) {
        this.c12 = c12;
    }

    public String getC20() {
        return c20;
    }

    public void setC20(String c20) {
        this.c20 = c20;
    }

    public String getC21() {
        return c21;
    }

    public void setC21(String c21) {
        this.c21 = c21;
    }

    public String getC22() {
        return c22;
    }

    public void setC22(String c22) {
        this.c22 = c22;
    }
}
