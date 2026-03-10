import java.util.*;
public class class1 {
    public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    list.add(11);
    list.add(23);
    list.add(68);
    list.add(45);
    list.set(3,67);
    list.get(2);
    list.remove(1);
    System.out.println(list);
    System.out.println(list.size());
    // for(int i=0;i<list.size();i++){
        // System.out.println(list.get(i));
    // }
    for(int num:list){
        System.out.println(num);
    }
}
}