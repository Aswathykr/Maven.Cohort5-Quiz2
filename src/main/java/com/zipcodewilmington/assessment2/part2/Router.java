package com.zipcodewilmington.assessment2.part2;

import java.lang.reflect.Array;
import java.util.*;

public class Router {
    HashMap<String,String> map;

    public Router() {
        this.map = new HashMap<String, String>();
    }

    public void add(String path, String controller) {
        map.put(path,controller);
    }

    public Integer size() {
        return map.size();
    }

    public String getController(String path) {
        return map.get(path);
    }

    public void update(String path, String studentController) {
        map.remove(path);
        map.put(path, studentController);
    }

    public void remove(String path) {
        map.remove(path);
    }
    public String toString(){
        Set<String> keySet = map.keySet();
        ArrayList<String> sortedList = new ArrayList<>(Arrays.asList(keySet.toArray(new String[keySet.size()])));
        Collections.sort(sortedList);
        String resultStr = "";
        for(String path : sortedList){
             resultStr = resultStr +  path + " -> " + map.get(path) + "\n";
        }
        return resultStr;
    }
}
