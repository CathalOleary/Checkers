package CheckersGame;
/*
 **Created by Cathal O'Leary
 */

import java.util.*;
import java.awt.*;

public class CheckersBoard {
    public static final int Rows=8;
    public static final int Columns=8;
    private Tiles[][] GameBoard;

    public void Board(){
        GameBoard = new Tiles[Rows][Columns];
        boolean Color=false;
        int i=0,x=0;

        for(;i<Rows;i++){

            for(;x<Columns;x++){
                if(Color){
                    GameBoard[i][x] = new Tiles(Tiles.BackgroundColor.DARK,i,x);
                }
                else {
                    GameBoard[i][x] = new Tiles(Tiles.BackgroundColor.LIGHT,i,x);
                }
            }
        }

    }

}
