package com.sort;

import java.util.Comparator;
import java.util.List;

public class SortByNameAsc implements Comparator<List<String>> {

    // Used for sorting in ascending order of
    // company name
    public int compare(List<String> a, List<String> b)
    {
        return a.get(0).compareTo(b.get(0));
    }
}
