package com.example.krestikynoliky;

public  class Pole {
    int [][] pole = new int[0][0];
    int turn = 0;
    public Pole(){
        turn = 0 + (int) (Math.random() * 2);
       for(int i = 3;i > 0;i--){
           for(int l = 3;l > 0;l--){
              pole[i][l] = 0;
           }
    }
}
public boolean[] check(int p[][]){
boolean r[] = new boolean[2];
    if((p[0][0] == p[0][1] && p[0][1] == p[0][2]) || (p[2][0] == p[2][1] && p[2][1] == p[2][2]) || (p[1][0] == p[1][1] && p[1][1] == p[1][2])){
     if(p[0][0] == 1){
         r[0] = true;
         r[1] = true;
     }
     else{
         r[0] = true;
         r[1] = false;
     }
    }
    else if((p[0][0] == p[1][1] && p[1][1] == p[2][2]) || (p[0][2] == p[1][1] && p[1][1] == p[3][0])){
        if(p[0][0] == 1){
            r[0] = true;
            r[1] = true;
        }
        else{
            r[0] = true;
            r[1] = false;
        }
    }
    else if((p[0][0] == p[2][0] && p[2][0] == p[3][0]) || (p[1][1] == p[2][1] && p[2][1] == p[3][1]) || (p[0][2] == p[1][2] && p[1][2] == p[2][2])){
        if(p[0][0] == 1){
            r[0] = true;
            r[1] = true;
        }
        else{
            r[0] = true;
            r[1] = false;
        }
    }
    return r;
    }
}
