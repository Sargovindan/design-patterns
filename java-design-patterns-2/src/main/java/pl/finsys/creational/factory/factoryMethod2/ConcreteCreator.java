package pl.finsys.creational.factory.factoryMethod2;

/**
 * (c) 2013 agilecoders.pl
 * User: jarek
 * Date: 03.05.13
 * Time: 11:14
 */
public class ConcreteCreator extends Creator {
    @Override
    protected Product factoryMethod() {
        return new ConcreteProduct();
    }
}
