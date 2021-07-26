package practice;

import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RadixSort {
    public static void radixSort(int[] arr) {

        String strArr[] = StringUtil.toStringArray(arr);
        StringUtil.lNormalize(strArr, '0');
        ArrayList<String> sourceArr = new ArrayList<>(Arrays.asList(strArr));
        HashMap<Integer, ArrayList<String>> data = new HashMap<>();

        for (int counter = sourceArr.get(0).length() - 1; counter >= 0; counter--) {
            for (String num : sourceArr) {
                char c = num.charAt(counter);
                if(!data.containsKey(Integer.parseInt(String.valueOf(c)))) {
                    ArrayList<String> numbers = new ArrayList<>();
                    numbers.add(num);
                    data.put(Integer.parseInt(String.valueOf(c)), numbers);
                } else {
                    ArrayList<String> numbers = data.get(Integer.parseInt(String.valueOf(c)));
                    numbers.add(num);
                }

            }
            sourceArr.clear();
            for(Map.Entry<Integer, ArrayList<String>> e: data.entrySet()) {
                ArrayList<String> partialArr = e.getValue();
                for (int i = 0; i < partialArr.size(); i++) {
                    sourceArr.add(partialArr.get(i));
                }
            }
            data.clear();
        }
        strArr = sourceArr.toArray(new String[sourceArr.size()]);
        int[] finalArr = StringUtil.toIntArray(strArr);
        for(int i = 0; i < finalArr.length; i++) {
            arr[i] = finalArr[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};

        radixSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? "," : ""));
        }
    }
}
