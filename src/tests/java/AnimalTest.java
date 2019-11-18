import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import project.*;

public class AnimalTest {

    private Animal cat;
    private Animal dog;

    @Before
    public void intValues() {
        this.cat = new Cat("Kitty", 7);
        this.dog = new Dog("Doggy", 7);
    }

    @Test
    public void constructor_ShouldSetSuccessfullyValues() {

        String expectedName = "Kitty";
        int expectedCapacity = 7;

        String actualName = this.cat.getName();
        double actualCapacity = this.cat.getKilos();

        Assert.assertTrue(expectedCapacity == actualCapacity);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test(expected = NullPointerException.class)
    public void constructor_ShouldThrowArgumentNullExceptionForInvalidName() {
        new Cat(null, 10);
    }

    @Test(expected = NullPointerException.class)
    public void constructor_ShouldThrowExceptionFordNameLessThanThreeLetters() {
        new Cat("As", 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_ShouldThrowExceptionFordNameWithDigits() {
        new Cat("As4", 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_ShouldThrowArgumentExceptionForInvalidKilos() {
        new Cat("Kitty", -10);
    }

    @Test
    public void addMethod_ShouldAddSuccessfully() {
        FamilyImpl family = new FamilyImpl(600);

        family.add(this.cat);

        Assert.assertEquals(1, family.count());
    }

    @Test(expected = IllegalArgumentException.class)
    public void addMethod_ShouldThrowsExceptionForInvalidSalary() {
        Family family = new FamilyImpl(0);

        family.add(this.dog);
    }


    @Test
    public void calculateHowMuchAreTheDrinkExpensesForCat() {
        Assert.assertTrue(this.cat.getDrinkExpenses() == 5.0);
    }

    @Test
    public void calculateHowMuchAreTheDrinkExpensesForDog() {
        Assert.assertTrue(this.dog.getDrinkExpenses() == 10.0);
    }
}
