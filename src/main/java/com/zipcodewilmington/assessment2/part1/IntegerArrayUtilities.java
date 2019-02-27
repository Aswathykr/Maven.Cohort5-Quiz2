package com.zipcodewilmington.assessment2.part1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {

        if(stop > start) {
            ArrayList<Integer> outResult = new ArrayList<Integer>();

            for (int i = start; i <= stop; i++)
                outResult.add(i);
            return outResult.toArray(new Integer[outResult.size()]);
        }else
            return null;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[0] * array[1];
    }
}
