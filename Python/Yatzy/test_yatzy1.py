import pytest
from yatzy import Yatzy

def test_chance():
    assert 15 == Yatzy.chance(5, 3, 2, 1, 4)
    assert 27 == Yatzy.chance(5, 5, 5, 6, 6)
    assert 6 == Yatzy.chance(1,1,1,1,2)

def test_yatzy():
    assert 50 == Yatzy.yatzy(5,5,5,5,5)
    assert 0 == Yatzy.yatzy(2,3,4,5,6)
    assert 0 == Yatzy.yatzy(3,3,1,2,3)
    assert 0 == Yatzy.yatzy(4,1,2,3,4)
    assert 0 == Yatzy.yatzy(1,2,3,5,6)

def test_ones():
    assert 5 == Yatzy.ones(1,1,1,1,1)
    assert 3 == Yatzy.ones(1,2,3,1,1)
    assert 0 == Yatzy.ones(2,3,4,5,6)

def test_twos():
    assert 4 == Yatzy.twos(2,4,6,5,2)
    assert 0 == Yatzy.twos(4,5,6,7,6)
    assert 10 == Yatzy.twos(2,2,2,2,2)

def test_threes():
    assert 9 == Yatzy.threes(3,4,5,3,3)
    assert 0 == Yatzy.threes(1,2,5,4,6)
    assert 12 == Yatzy.threes(3,3,3,3,6)
    
def test_fours():
    dice = Yatzy(1,4,3,4,5)
    assert dice.fours() == 8, "fallo en función fours, primer assert"
    dice = Yatzy(1,4,4,6,4)
    assert dice.fours() == 12, "fallo en función fours, segundo assert"
    dice = Yatzy(1,2,3,5,6)
    assert dice.fours() == 0, "fallo en función fours , tercer assert"

def test_fives():
    dice = Yatzy(1,4,3,4,5)
    assert dice.fives() == 5, "fallo en función fives, primer assert"
    dice = Yatzy(1,4,4,6,4)
    assert dice.fives() == 0, "fallo en función fives, segundo assert"
    dice = Yatzy(5,5,3,5,6)
    assert dice.fives() == 15, "fallo en función fives, tercer assert"

def test_sixes():
    dice = Yatzy(1,6,3,6,5)
    assert dice.sixes() == 12, "fallo en función sixes, primer assert"
    dice = Yatzy(1,4,4,3,4)
    assert dice.sixes() == 0, "fallo en función sixes, segundo assert"
    dice = Yatzy(5,5,3,5,6)
    assert dice.sixes() == 6, "fallo en función sixes, tercer assert"

def test_score_pair():
    assert 8 == Yatzy.score_pair(4,5,6,7,4)
    assert 10 == Yatzy.score_pair(4,3,5,3,5)
    assert 12 == Yatzy.score_pair(6,2,3,4,6)
    assert 0 == Yatzy.score_pair(1,2,3,4,6)

def test_two_pair():
    assert  20 == Yatzy.two_pair(4,4,5,6,6)
    assert  14 == Yatzy.two_pair(5,5,1,2,2)
    assert  18 == Yatzy.two_pair(3,1,3,6,6)

def test_three_of_a_kind():
    assert 9 == Yatzy.three_of_a_kind(3,4,3,5,3)
    assert 18 == Yatzy.three_of_a_kind(2,3,6,6,6)
    assert 0 == Yatzy.three_of_a_kind(6,6,4,3,2)

def test_four_of_a_kind():
    assert 16 == Yatzy.four_of_a_kind(5,4,4,4,4)
    assert 24 == Yatzy.four_of_a_kind(6,3,6,6,6)
    assert 0 == Yatzy.four_of_a_kind(6,6,4,3,2)

def test_smallStraight():
    assert 0 == Yatzy.smallStraight(1,2,3,6,5)
    assert 15 == Yatzy.smallStraight(2,3,4,1,5)
    assert 15 == Yatzy.smallStraight(5,4,3,2,1)

def test_largeStraight():
    assert 20 == Yatzy.largeStraight(6,4,3,5,2)
    assert 20 == Yatzy.largeStraight(5,6,3,4,2)
    assert 0 == Yatzy.largeStraight(4,3,2,1,5)

def test_fullHouse():
    assert 13 == Yatzy.fullHouse(3,3,3,2,2)
    assert 0 == Yatzy.fullHouse(2,3,1,4,5)
    assert 24 == Yatzy.fullHouse(6,6,6,3,3)
    assert 16 == Yatzy.fullHouse(2,2,2,5,5)