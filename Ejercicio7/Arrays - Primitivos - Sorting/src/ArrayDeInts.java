import jdk.internal.org.objectweb.asm.tree.InnerClassNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class ArrayDeInts{
    public static void arrayInt(){
        Integer[] nums = new Integer[]{1,6,3,900,2,7,11,45,67,4};
        for(int i  : nums){
            System.out.println(i);
        }
        Arrays.sort(nums);
       /* for(int i : nums){
            System.out.println(i);
        }*/
        List<Integer> myList = new ArrayList<>(Arrays.asList(nums));
        System.out.println(myList);
    }
    public static void arrayIntList(){
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(6);
        num.add(3);
        num.add(64);
        num.add(2);
        num.add(900);
        num.add(11);
        num.add(45);
        num.add(67);
        num.add(11);

        System.out.println(num);
        Collections.sort(num);
        Integer[] a = new Integer[5];
        Integer[] b =  num.toArray(a);
        for(Integer i : b){
            System.out.println(i);
        }
    }
}
