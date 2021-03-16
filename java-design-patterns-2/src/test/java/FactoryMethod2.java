import pl.finsys.creational.factory.factoryMethod2.ConcreteCreator;
import pl.finsys.creational.factory.factoryMethod2.Creator;
import org.testng.annotations.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * (c) 2013 agilecoders.pl
 * User: jarek
 * Date: 03.05.13
 * Time: 11:20
 */
public class FactoryMethod2 {
    @Test
    public void shouldUseFactoryMethod() {
        Creator creator = new ConcreteCreator();
        String productName = creator.anOperation();


        assertThat(productName).isEqualTo("Concrete Product");
    }
}
