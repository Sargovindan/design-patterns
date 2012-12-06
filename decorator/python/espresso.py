import beverage


class Espresso(beverage.Beverage):
    description = 'Espresso'

    def cost(self):
        return 1.99
