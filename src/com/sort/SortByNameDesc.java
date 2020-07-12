package com.sort;

import java.util.Comparator;
import java.util.List;

public class SortByNameDesc implements Comparator<List<String>> {
    // Used for sorting in descending order of
    // company name
    public int compare(List<String> a, List<String> b)
    {
        return b.get(0).compareTo(a.get(0));
    }
}
