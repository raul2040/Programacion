class Yatzy:
    
    def __init__(self, d1, d2, d3, d4, d5):
        self.dice = [0]*5
        self.dice[0] = d1
        self.dice[1] = d2
        self.dice[2] = d3
        self.dice[3] = d4
        self.dice[4] = d5 

    @staticmethod
    def chance(*dice):
        return sum(dice)
    
    @staticmethod
    def yatzy(*dice):
        for die in dice:
            if dice.count(die) == 5:
                return 50
            else:
                return 0 
    @staticmethod
    def ones( *dice):
        sum = 0
        for die in dice:
            if die == 1:
                sum +=1
        return sum
    
    @staticmethod
    def twos( *dice):
        sum = 0
        for die in dice:
            if die == 2:
                sum +=2
        return sum
    
    @staticmethod
    def threes( *dice):
        sum = 0
        for die in dice:
            if die == 3:
                sum +=3
        return sum

    def fours(self):
        sum = 0
        for die in range(5):
            if (self.dice[die]) == 4:
                sum +=4
        return sum
    
    def fives(self):
        sum = 0
        for die in range(5):
            if (self.dice[die]) == 5:
                sum +=5
        return sum
    
    def sixes(self):
        sum = 0
        for die in range(5):
            if (self.dice[die]) == 6:
                sum +=6
        return sum
    
    @staticmethod
    def score_pair(*dice):
        for die in dice:
            if dice.count(die) == 2:
                die = die *2
            else:
                die = 0
        return die
   
    @staticmethod
    def two_pair(*dice):
        pareja = []
        for die in dice:
            if dice.count(die) == 2:
                pareja.append(die)
                pareja * 2
            else:
                die = 0 
        return sum(pareja)

    @staticmethod
    def three_of_a_kind(*dice):
        for die in dice:
            if dice.count(die) == 3:
                die = die * 3
            else:
                die = 0
        return die

    @staticmethod
    def four_of_a_kind(*dice):
        for die in dice:
            if dice.count(die) == 4:
                die = die * 4
            else:
                die = 0
        return die
    
    @staticmethod
    def smallStraight(*dice):
        comparador = list(range(1,6))
        score = 0
        if sorted(dice) == comparador:
            score = 15
        else:
            score = 0 
        return score  
    
    @staticmethod
    def largeStraight(*dice):
        comparador = list(range(2,7))
        score = 0
        if sorted(dice) == comparador:
            score = 20
        else:
            score = 0 
        return score
    
    @staticmethod
    def fullHouse(*dice):
        pareja = []
        triple = []
        for die in dice:
            if dice.count(die) == 2:
                pareja.append(die)
                pareja * 2
            if dice.count(die) == 3:
                triple.append(die)
                triple * 2
            else:
                die = 0 
        return sum(pareja) + sum(triple)