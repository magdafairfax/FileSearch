package test;

import org.junit.Test;

import com.SearchFile;
import java.io.File;

import static org.junit.Assert.assertEquals;

public class SearchFileTest {

    @Test
    public void testEmptyDir (){

        assertEquals("",SearchFile.searchFileRecursively(new File("C//Temp"), "test.txt"));
    }

}
