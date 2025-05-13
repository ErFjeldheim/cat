import org.junit.Test;
import com.example.Cat;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class CatTest {

    //Creates cat ArrayList
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
    }    
}
