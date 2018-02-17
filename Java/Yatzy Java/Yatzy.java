package org.mvpigs.Test;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Yatzy {

    public static int chance(int... dice){
        int score = 0;
        
        for(int x = 0; x < dice.length; x++) {
        	score += dice[x];	
        }
        
		return score;

    }
    public static int yatzy(int... dice)
    {
        int[] counts = new int[6];
        for (int die : dice)
            counts[die-1]++;
        for (int i = 0; i != 6; i++)
            if (counts[i] == 5)
                return 50;
        return 0;
}
	public static int ones(int ... dice){
		int score = 0;
		for(int x = 0; x < dice.length; x++)
			if(dice[x] == 1) {
				score += 1;
			}
		return score;
		
	}
	public static int twos(int ... dice) {
		int score = 0;
		for(int x = 0; x < dice.length; x++)
			if(dice[x] == 2) {
				score += 2;
			}
		return score;
	}
	public static int threes(int ... dice) {
		int score = 0;
		for(int x = 0; x < dice.length; x++)
			if(dice[x] == 3) {
				score += 3;
			}
		return score;
	}
	protected int[] dice;
	public Yatzy(int d1,int d2,int d3,int d4,int d5) {
		dice = new int[5];
		dice[0] = d1;
		dice[1] = d2;
		dice[2] = d3;
		dice[3] = d4;
		dice[4] = d5;
	}
	public int fours() {
		int score = 0;
		for(int x = 0; x < dice.length; x++)
			if(dice[x]== 4) {
				score += 4;
			}
		return score;
		
	}
	public int fives() {
		int score = 0;
		for(int x = 0; x < dice.length ; x++)
			if(dice[x] == 5) {
				score+= 5;
			}
		return score;
	}
	public int sixes() {
		int score = 0;
		for(int x = 0; x < dice.length ; x++)
			if(dice[x] == 6) {
				score+= 6;
			}
		return score;
	}
	 public static int score_pair(int d1, int d2, int d3, int d4, int d5) {
	        int[] counts = new int[6];
	        counts[d1-1]++;
	        counts[d2-1]++;
	        counts[d3-1]++;
	        counts[d4-1]++;
	        counts[d5-1]++;
	        int at;
	        for (at = 0; at != 6; at++)
	            if (counts[6-at-1] >= 2)
	                return (6-at)*2;
	        return 0;
	}
	public static int two_pair(int d1,int d2,int d3,int d4,int d5) {
		int[] counts = new int[6];
		counts[d1-1]++;
		counts[d2-1]++;
		counts[d3-1]++;
		counts[d4-1]++;
		counts[d5-1]++;
		int n = 0;
		int score = 0;
		for (int x = 0; x < 6; x++)
			if (counts[6-x-1] >= 2)
				return (6-x)*2;
		if(n == 2) {
			return score * 2;
		}
		else {
			return 0;
		}
	}
	public static int four_of_kind(int d1, int d2, int d3, int d4, int d5) {
		int[] counts = new int[6];
		counts[d1-1]++;
		counts[d2-1]++;
		counts[d3-1]++;
		counts[d4-1]++;
		counts[d5-1]++;
		for(int x = 0; x < 6; x++)
			if(counts[6-x-1] == 4) {
				return (6-x)*4;	
			}
		return 0;
	}
	
	
	public static int three_of_a_kind(int d1, int d2, int d3, int d4, int d5) {
		int[] counts = new int[6];
		counts[d1-1]++;
		counts[d2-1]++;
		counts[d3-1]++;
		counts[d4-1]++;
		counts[d5-1]++;
		for(int x = 0; x < 6 ; x++){
			if(counts[6-x-1] == 3){
				return (6-x)*3;
				}
			} 
		return 0;
	}
	public static int smallStraight(int... dice) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for (int i = 0; i < dice.length; i++) {
			lista.add(dice[i]);
		}
		
		Collections.sort(lista);
		
		int resultado = 0;   
		int contador = 1;
	    
		for (int i = 0; i < lista.size(); i++) {
	        	if (!(lista.get(i) == contador)) {
	        		return 0;
	        	}
	        	contador += 1;
	        	resultado += lista.get(i);
	        }
		
	        return resultado;
	    }
	public static int largeStraight(int...dice) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for(int i = 0; i < dice.length; i++) {
			lista.add(dice[i]);
		}
		Collections.sort(lista);
		int resultado = 10;
		int contador = 1;
		for (int i = 0; i < lista.size(); i++) {
        	if (!(lista.get(i) == contador)) {
        		return 0;
        	}
        	contador += 1;
        	resultado += lista.get(i);
        }
	
        return resultado;
    }
	public static int fullHouse(int d1, int d2, int d3, int d4, int d5) {
    int[] tallies;
    boolean _2 = false;
    int i;
    int _2_at = 0;
    boolean _3 = false;
    int _3_at = 0;
		
	 tallies = new int[6];
     tallies[d1-1] += 1;
     tallies[d2-1] += 1;
     tallies[d3-1] += 1;
     tallies[d4-1] += 1;
     tallies[d5-1] += 1;

     for (i = 0; i != 6; i += 1)
         if (tallies[i] == 2) {
             _2 = true;
             _2_at = i+1;
         }

     for (i = 0; i != 6; i += 1)
         if (tallies[i] == 3) {
             _3 = true;
             _3_at = i+1;
         }

     if (_2 && _3)
         return _2_at * 2 + _3_at * 3;
     else
         return 0;
 }
}



	
		
    
    
  