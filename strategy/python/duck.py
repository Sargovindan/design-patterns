from behaviors import *


class Duck(object):
    fly_behavior = NotImplemented
    quack_behavior = NotImplemented

    def perform_quack(self):
        self.quack_behavior.quack()

    def perform_fly(self):
        self.fly_behavior.fly()


class MallardDuck(Duck):
    fly_behavior = FlyWithWing()
    quack_behavior = Quack()


class ModelDuck(Duck):
    fly_behavior = FlyNoWay()
    quack_behavior = Quack()


duck = MallardDuck()
duck.perform_quack()
duck.perform_fly()
duck.perform_fly()

model_duck = ModelDuck()
model_duck.perform_fly()
model_duck.fly_behavior = FlyRocketPowered()
model_duck.perform_fly()
