import org.junit.Assert;
import org.junit.Test;

public class AnimalTest
{
    public void animalTest(){
        Animal ani = new Animal("doggo", 12);
        Assert.assertEquals("Getbreed is incorrect", "doggo", ani.getBreed());
        Assert.assertEquals("Getage is incorrect" , 12, ani.getAge());
        Assert.assertEquals("toString is incorrect", "A 12-year old doggo.", ani.toString());
    }
}
