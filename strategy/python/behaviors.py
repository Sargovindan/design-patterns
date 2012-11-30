from abc import ABCMeta, abstractmethod

__all__ = ('FlyWithWing', 'FlyNoWay', 'FlyRocketPowered', 'Quack',
           'MuteQuack', 'Squeak')


class FlyBehavior(object):
    __metaclass__ = ABCMeta

    @abstractmethod
    def fly(self):
        pass


class QuackBehavior(object):
    __metaclass__ = ABCMeta

    @abstractmethod
    def quack(self):
        pass


class FlyWithWing(FlyBehavior):
    def fly(self):
        print 'I fly with my wings'


class FlyNoWay(FlyBehavior):
    def fly(self):
        print 'I can\'t fly'


class FlyRocketPowered(FlyBehavior):
    def fly(self):
        print 'I\'m flying with a rocket!'


class Quack(QuackBehavior):
    def quack(self):
        print 'I quack as a duck quacks'


class MuteQuack(QuackBehavior):
    def quack(self):
        print '<< Silence >>'


class Squeak(QuackBehavior):
    def quack(self):
        print 'Squeak~'
