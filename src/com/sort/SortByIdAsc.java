package com.sort;

import java.util.Comparator;
import java.util.List;

public class SortByIdAsc implements Comparator<List<String>> {
    // Used for sorting in ascending order of id
    public int compare(List<String> a, List<String> b)
    {

        return a.get(1).compareTo(b.get(1));
    }
}
