import org.junit.Test;
import com.example.Cat;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;

public class CatTest {

    ArrayList<Cat> catArrayTestList = new ArrayList<Cat>();
    
    @Test
    public void testCatNames(){
        catArrayTestList.add(new Cat("Lars", 2));
        catArrayTestList.add(new Cat("Geir", 5));
        catArrayTestList.add(new Cat("Solveig", 8));
        catArrayTestList.add(new Cat("Olga", 4));
        assertEquals(catArrayTestList.get(0).getName(),"Lars");
        assertEquals(catArrayTestList.get(1).getName(),"Geir");
        assertEquals(catArrayTestList.get(2).getName(),"Solveig");
        assertEquals(catArrayTestList.get(3).getName(),"Olga");

        assertThrows(IllegalArgumentException.class, () -> {
            new Cat("Q", 15);
        });
        assertFalse(new Cat("Leif", 3).getName().matches(".*[0-9].*"));
    }

    @Test
    public void testCatAges(){
        catArrayTestList.add(new Cat("Lars", 2));
        catArrayTestList.add(new Cat("Geir", 5));
        catArrayTestList.add(new Cat("Solveig", 8));
        catArrayTestList.add(new Cat("Olga", 4));
        assertEquals(catArrayTestList.get(0).getAge(),2);
        assertEquals(catArrayTestList.get(1).getAge(),5);
        assertEquals(catArrayTestList.get(2).getAge(),8);
        assertEquals(catArrayTestList.get(3).getAge(),4);
        
        assertThrows(IllegalArgumentException.class, () -> {
            new Cat("Petter", -10);
        });
    }

    @Test
    public void testSetCatName(){
        Cat testCat = new Cat("Test", 10);
        testCat.setName("Tested");
        assertEquals(testCat.getName(), "Tested");
        assertThrows(IllegalArgumentException.class, () -> {
            testCat.setName("Olga420");
        });
    }

    @Test
    public void testSetCatAge(){
        Cat testCat = new Cat("Test", 5);
        testCat.setAge(10);
        assertEquals(testCat.getAge(),10);
        assertThrows(IllegalArgumentException.class, () -> {
            testCat.setAge(-5);
        });
    }
}
