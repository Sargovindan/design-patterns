from abc import ABCMeta, abstractmethod


class Beverage(object):
    __metaclass__ = ABCMeta
    description = 'Unknown Beverage'

    def get_description(self):
        return self.description

    @abstractmethod
    def cost(self):
        pass
