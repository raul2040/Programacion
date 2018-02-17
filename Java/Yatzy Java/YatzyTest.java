package org.mvpigs.Test;

import static org.junit.Assert.assertEquals;

import org.junit.*;
public class YatzyTest {

    @Test
    public void chance_scores_sum_of_all_dice() {
        int expected = 15;
        int actual = Yatzy.chance(2,3,4,5,1);
        assertEquals(expected, actual);
        assertEquals(16, Yatzy.chance(3,4,5,3,1));
}
   @Test
   	public void yatzy() {
	   int expected = 50;
	   int actual = Yatzy.yatzy(5,5,5,5,5);
	   assertEquals(expected, actual);
	   assertEquals(0, Yatzy.yatzy(4,4,3,4,4));
	   assertEquals(0, Yatzy.yatzy(1,2,3,4,5));
	   assertEquals(expected, Yatzy.yatzy(2,2,2,2,2));
   }
   
   @Test
   	public void sum_of_ones() {
	  int expected = 5;
	  int actual = Yatzy.ones(1,1,1,1,1);
	  assertEquals(expected, actual);
	  assertEquals(2, Yatzy.ones(2,1,4,4,1));
	  assertEquals(0, Yatzy.ones(2,3,4,5,6));
	  
   }
   @Test
   public void sum_of_twos() {
	  int expected = 6;
	  int actual = Yatzy.twos(2,2,5,6,2);
	  assertEquals(expected, actual);
	  assertEquals(8, Yatzy.twos(2,2,5,2,2));
   }
   @Test
   public void sum_of_threes() {
	  int expected = 6;
	  int actual = Yatzy.threes(3,2,5,6,3);
	  assertEquals(expected, actual);
	  assertEquals(9, Yatzy.threes(3,2,3,2,3));
   }
   @Test
   public void sum_of_fours() {
	  int expected = 8;
	  int actual = new Yatzy(4,3,4,5,6).fours();
	  assertEquals(expected, actual);
	  assertEquals(12, new Yatzy(4,4,3,4,3).fours());
   }
   @Test
   public void sum_of_fives() {
	  int expected = 10;
	  int actual = new Yatzy(5,3,4,5,3).fives();
	  assertEquals(expected, actual);
	  assertEquals(15, new Yatzy(5,5,3,5,3).fives());
   }
   @Test
   public void sum_of_sixes() {
	  int expected = 12;
	  int actual = new Yatzy(6,3,4,6,3).sixes();
	  assertEquals(expected, actual);
	  assertEquals(18, new Yatzy(6,6,6,4,3).sixes());
   }
   @Test
   public void sum_pair() { 
	  int expected = 8;
	  int actual = Yatzy.score_pair(2,3,4,4,5);
	  assertEquals(expected, actual);
	  assertEquals(4, Yatzy.score_pair(1,4,2,2,5));
	  
   }
   @Test
   public void sum_two_pair() {
	  assertEquals(8, Yatzy.two_pair(5, 6, 4, 1, 4));
	  assertEquals(12, Yatzy.two_pair(5, 6, 5, 3, 6));
   }
   @Test
   public void four_kind() {
	 assertEquals(24, Yatzy.four_of_kind(6, 5, 6, 6, 6));
	 assertEquals(12, Yatzy.four_of_kind(3, 2, 3, 3, 3));
   }
   @Test
   public void three_of_kind() {
	 assertEquals(9, Yatzy.three_of_a_kind(3, 4, 3, 2, 3));
	 assertEquals(6, Yatzy.three_of_a_kind(2, 3, 2, 2, 4));
   }
   @Test
   public void smallStraight() {
	assertEquals(15, Yatzy.smallStraight(1,2,3,4,5));
	assertEquals(15, Yatzy.smallStraight(2,3,4,1,5));
	assertEquals(0, Yatzy.smallStraight(1,4,5,6,3));
   }
   @Test
   public void largeStraight() {
	assertEquals(25, Yatzy.largeStraight(1,2,3,4,5));
	assertEquals(25, Yatzy.largeStraight(2,3,4,1,5));
	assertEquals(0, Yatzy.largeStraight(1,4,5,6,3));
}

   @Test
   public void fullHouse() {
	assertEquals(13, Yatzy.fullHouse(2,2,3,3,3));
	assertEquals(17, Yatzy.fullHouse(5,5,5,1,1));
	assertEquals(7, Yatzy.fullHouse(1,2,1,2,1));
}
}