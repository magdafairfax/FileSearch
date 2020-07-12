package com;

import com.sort.SortByIdAsc;
import com.sort.SortByIdDesc;
import com.sort.SortByNameAsc;
import com.sort.SortByNameDesc;

import java.text.Collator;
import java.util.*;
import java.util.concurrent.Callable;

/**
 *  Excercise class to order and search through a list of lists (something similar with a table).
 *  We have a list of companies and we want to order them by some criteria given by a parameter.
 *  Structure of the company will be :
 *   - Company name
 *   - Company number
 *   - Company post code
 *   - company telephone
 */
public class SortCompanies {

    /**
     *
     * @param listCompanies  The list of companies to be ordered (it's a list of list of strings)
     * @param sortOrder this parameter define the sorting order
     *                  1 for ascending sorting
     *                  0 for descending sorting
     * @param sortParam  this paramter selects the  column by which to sort
     *                   0 to sort by company name
     *                   1 to sort by company number
     *                   2  to sort by company post code
     *                   3 to sort by company telephone
     * @return the sorted list of companies
     */
    public List<List<String>>  sortCompanies (List<List<String>>listCompanies, int sortOrder,  int sortParam ) {

        if (sortOrder == 1) {
            switch (sortParam) {
                case 0: Collections.sort(listCompanies, new SortByNameAsc());break;
                case 1: Collections.sort(listCompanies, new SortByIdAsc());break;
                case 2: Collections.sort(listCompanies, new Comparator<List<String>>(){
                        @Override
                        public int compare(List<String> a, List<String> b)
                        {
                           return a.get(2).compareTo(b.get(2));
                        }
                    });
                case 3: Collections.sort(listCompanies, new Comparator<List<String>>(){
                    @Override
                    public int compare(List<String> a, List<String> b)
                    {
                        return a.get(3).compareTo(b.get(3));
                    }
                });
            }
        }
        else if (sortOrder == 0) {
            switch (sortParam) {
                case 0: Collections.sort(listCompanies, new SortByNameDesc());break;
                case 1: Collections.sort(listCompanies, new SortByIdDesc()); break;
                case 2: Collections.sort(listCompanies, new Comparator<List<String>>(){
                    @Override
                    public int compare(List<String> a, List<String> b)
                    {
                        return b.get(2).compareTo(a.get(2));
                    }
                });break;
                case 3: Collections.sort(listCompanies, new Comparator<List<String>>(){
                    @Override
                    public int compare(List<String> a, List<String> b)
                    {
                        return b.get(3).compareTo(a.get(3));
                    }
                });break;
            }
        }

        return listCompanies;
    }

    public void diplayListCompanies (List<List<String>> listCompanies) {
        for (List<String> company : listCompanies) {
            System.out.println("_________________________");
            System.out.println("Company name: " + company.get(0));
            System.out.println("Company number: " + company.get(1));
            System.out.println("Company post code: " + company.get(2));
            System.out.println("Company telephone: " + company.get(3));
            System.out.println("_________________________");
        }
    }

    public static void main (String[] args) {
        List<List<String>> listCompaniesTest1 = new ArrayList<>();
        SortCompanies sortCompanies = new SortCompanies();

        listCompaniesTest1.add(Arrays.asList(new String[]{"Cola","4423455554", "Pr4 56T", "222-345-344"}));
        listCompaniesTest1.add(Arrays.asList(new String[]{"Ace", "9834744454", "T4 RT5", "845-4343-844"}));
        listCompaniesTest1.add(Arrays.asList(new String[]{"Bee", "1234325545", "A54 HT5", "99-4343-844"}));
        listCompaniesTest1.add(Arrays.asList(new String[]{"Lee", "9345845444", "454 F5", "123-4343-3244"}));
        listCompaniesTest1.add(Arrays.asList(new String[]{"Art", "9564644544", "T4 G5", "44-3456346-3444"}));

        sortCompanies.sortCompanies(listCompaniesTest1,1,2);
        sortCompanies.diplayListCompanies(listCompaniesTest1);
    }
}
