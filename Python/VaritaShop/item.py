class Item:
    def __init__(self, name, sellIn, quality):
        self.name = name
        self.sellIn = sellIn
        self.quality = quality

    def __repr__(self):
        return "{0}, {1}, {2}".format(self.name, self.sellIn, self.quality)

class Interfaz():
    def update_quality(self):
        pass
    
class normalItem(Item, Interfaz):
    def _init_ (self, name, sellIn, quality):
        Item._init_(self,name,sellIn, quality)
    
    def tiempoDeVenta(self):
        self.sellIn -= 1
    
    
        
        


if __name__ == "__main__":
    Item = normalItem("Elixir of the Mongoose",5, 7)
    print(Item)

    

 
        
