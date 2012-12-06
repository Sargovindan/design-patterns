from mocha import Mocha
from espresso import Espresso


espresso = Espresso()
espresso = Mocha(espresso)
espresso = Mocha(espresso)
print "%s: $%.2f" % (espresso.get_description(), espresso.cost())
