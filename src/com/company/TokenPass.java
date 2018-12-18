package com.company;

public class TokenPass
{
    private int[] board;
    private int currentPlayer;
    private int playerCount;

    public TokenPass(int playerCount)
    {
        this.playerCount = playerCount;
        board = new int[playerCount];
        for(int a = 0; a <= playerCount; a++)
        {
            board[a] = (int) (Math.random()*playerCount)+1;
        }
        int CurrrentPlayer = (int) (Math.random()*playerCount)+1;
    }

    public void distributeCurrentPlayerTokens()
    {
        int CurrentPlayerTokens = board[CurrentPlayerTokens];
        int holder = CurrentPlayerTokens;
        while(holder>0)
        {
            for(int k = currentPlayer; k<board.length; k++)
            {
                board[k]++;
                holder--;
            }

        }
    }
}
