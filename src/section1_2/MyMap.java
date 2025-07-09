package section1_2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyMap {
    //đếm giá trị xuất hiện trong Map
    public int countOccurrencesMap(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,1);
        }
        return map.size();
    }

    //đếm tần suất xuất hiện của từng giá trị trong Map
    public Map<Integer, Integer> countFrequencyMap(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        return frequencyMap;
    }

    //LinkHashMap
    public LinkedHashMap<Integer, Integer> countFrequencyLinkHashMap(int[] arr) {
        LinkedHashMap<Integer, Integer> frequencyMap = new LinkedHashMap<>();
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        for(int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        return frequencyMap;
    }

    //treMap
    public TreeMap<Integer, Integer> countFrequencyTreeMap(int[] arr) {
        TreeMap<Integer, Integer> frequencyMap = new TreeMap<>();
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        for(int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        MyMap myMap = new MyMap();
        int[] sampleArray = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4,5,7,2,1,5,76,8,5,4,6,7};

        System.out.println("Count Occurrences: " + myMap.countOccurrencesMap(sampleArray));

        Map<Integer, Integer> frequencyMap = myMap.countFrequencyMap(sampleArray);
        System.out.println("Frequency Map: " + frequencyMap);

        LinkedHashMap<Integer, Integer> linkedHashMap = myMap.countFrequencyLinkHashMap(sampleArray);
        System.out.println("LinkedHashMap Frequency: " + linkedHashMap);

        TreeMap<Integer, Integer> treeMap = myMap.countFrequencyTreeMap(sampleArray);
        System.out.println("TreeMap Frequency: " + treeMap);
    }

}
