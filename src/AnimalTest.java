import org.junit.Assert;
import org.junit.*;

public class AnimalTest
{
    @Test
    public void animalTest(){
        Animal ani = new Animal("doggo", 12);
        Animal ani1 = new Animal("doggy", 12);
        Assert.assertEquals("Getbreed is incorrect", "doggo", ani.getBreed());
        Assert.assertEquals("Getage is incorrect" , 12, ani.getAge());
        Assert.assertEquals("toString is incorrect", "A 12-year old doggo.", ani.toString());
        Assert.assertEquals("CompareTo is incorrect", 0, ani.compareTo(ani1));
    }
}
