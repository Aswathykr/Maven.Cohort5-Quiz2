package com.zipcodewilmington.assessment2.part2;

import org.h2.util.StringUtils;

import java.lang.reflect.Array;
import java.util.*;

public class ListUtility {
    List<Integer> list;

    public ListUtility() {
        this.list = new ArrayList<Integer>();
    }

    public Boolean add(Integer i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {

        Set<Integer> set = new HashSet<Integer>(list);
        return Arrays.asList(set.toArray(new Integer[set.size()]));
    }

    public String join() {
        String returnStr = String.valueOf(list.get(0));
        for(int idx = 1; idx < list.size() ; idx ++){
            returnStr = returnStr + ", " +  list.get(idx);
        }
        return returnStr;
    }

    public Integer mostCommon() {
        ArrayUtility util = new ArrayUtility();

        return util.mostCommon(list.toArray(new Integer[list.size()]));
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
