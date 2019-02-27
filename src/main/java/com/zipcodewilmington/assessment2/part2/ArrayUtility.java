package com.zipcodewilmington.assessment2.part2;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int toCopy : array1){
            newArray.add(toCopy);
        }
        for(int toCopy : array2){
            newArray.add(toCopy);
        }
        return newArray.toArray(new Integer[newArray.size()]);
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int idxToCopy = index; idxToCopy < array.length ; idxToCopy++){
            newArray.add(array[idxToCopy]);
        }
        for(int idxToCopy = 0; idxToCopy < index ; idxToCopy++){
            newArray.add(array[idxToCopy]);
        }
        return newArray.toArray(new Integer[newArray.size()]);
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        List asListArray1 = Arrays.asList(array1);
        List asListArray2 = Arrays.asList(array2);
        int sum = Collections.frequency(asListArray1,valueToEvaluate) +
                Collections.frequency(asListArray2,valueToEvaluate);
        return sum;
    }

    public Integer mostCommon(Integer[] array) {
        List asList = Arrays.asList(array);
        Set<Integer> set = new HashSet<Integer>(asList);
        int highFrequency = Integer.MIN_VALUE;
        Integer frequentValue = 0;
        for(Integer value: set){

            int thisFrequency = Collections.frequency(asList,value);
            if(thisFrequency > highFrequency) {
                frequentValue = value;
                highFrequency = thisFrequency;
            }


        }
        return frequentValue;
    }
}
