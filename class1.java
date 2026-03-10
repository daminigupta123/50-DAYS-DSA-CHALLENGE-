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
    int traget=68;
    if(list.contains(traget)){
        System.out.println("found");
    } else{
        System.out.println("not found");
    }
    if(list.contains(668)){
        System.out.println("668 found");
    } else{
        System.out.println("668 not found");
    }
    int sum=0;
    for(int num:list){//forrrrrr sum of arraylist
        sum+=num;
    }
    System.out.println("Sum: " + sum);
    //   double avg=(double)sum/list.size();
    //   System.out.println("Average: " + avg);
        // for(int i=list.size()-1;i>=0;i--){
    //   System.out.println(list.get(i));
Collections.sort(list,Collections.reverseOrder());
System.out.println("Sorted in reverse order: " + list);
int temp=list.get(0);
list.set(0,list.get(1));
list.set(1,temp);
System.out.println("After swapping first two elements: " + list);
ArrayList<Integer> List2=new ArrayList<>();
System.out.println("List2: " + List2);
//merge two list
ArrayList<Integer> List3=new ArrayList<>();
list.add(100);
list.add(200);
list.add(300);
List3.addAll(list);
System.out.println("List3 (copy of list): " + List3);   
//duplicate rmeove
HashSet<Integer> set=new HashSet<>(list3);
System.out.println("List with duplicates removed: " + new ArrayList<>(set));





















}
}
