package test;

import com.SortCompanies;
import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.BeforeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SearchCompaniesTest {
    SortCompanies sortCompanies = new SortCompanies();
    List<List<String>> listCompaniesTest1 = new ArrayList<>();
    List<List<String>> listCompaniesTest2 = new ArrayList<>();
    List<List<String>> listCompaniesTest3 = new ArrayList<>();

    @Before
    public void loadTestCases() {

        listCompaniesTest1.add(Arrays.asList(new String[]{"Cola", "423455", "Pr4 56T", "222-345-344"}));
        listCompaniesTest1.add(Arrays.asList(new String[]{"Ace", "983474", "T4 RT5", "845-4343-844"}));
        listCompaniesTest1.add(Arrays.asList(new String[]{"Bee", "123432", "A54 HT5", "99-4343-844"}));
        listCompaniesTest1.add(Arrays.asList(new String[]{"Lee", "93458", "454 F5", "123-4343-3244"}));
        listCompaniesTest1.add(Arrays.asList(new String[]{"Art", "956464", "T4 G5", "44-3456346-3444"}));

        listCompaniesTest2.add(Arrays.asList(new String[]{"aaa", "12345", "", ""}));

        listCompaniesTest3.add(Arrays.asList(new String[]{"", "", "", ""}));
        listCompaniesTest3.add(Arrays.asList(new String[]{"Bee", "123432", "A54 HT5", "99-4343-844"}));
        listCompaniesTest3.add(Arrays.asList(new String[]{"Lee", "93458", "454 F5", "123-4343-3244"}));
        listCompaniesTest3.add(Arrays.asList(new String[]{"Art", "956464", "T4 G5", "44-3456346-3444"}));

    }


    @Test
    public void displayTest() {
        sortCompanies.diplayListCompanies(listCompaniesTest1);

    }

    @Test
    public void sortCompaniesTest1() {

        List<List<String>> sortedComp = sortCompanies.sortCompanies(listCompaniesTest1,1,2);
        assertEquals("Lee" , sortedComp.get(0).get(0));

    }
}
