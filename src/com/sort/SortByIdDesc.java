package com.sort;

import java.util.Comparator;
import java.util.List;

public class SortByIdDesc implements Comparator<List<String>> {
    // Used for sorting in descending order of id
    public int compare(List<String> a, List<String> b)
    {
        return b.get(1).compareTo(a.get(1));
    }
}
