package PAZ_A;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void exe_2_Partition_F_min()
    {
    	String result = App.NumToChar(1);
    	String expected_result = "F";
    	assertEquals(result, expected_result);
    }
}
