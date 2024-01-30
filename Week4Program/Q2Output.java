import java.util.*;

public class Q2Output {
    public static void main(String args[]) {
        ArrayList<String> myArrList = new ArrayList<String>();
        String sb1 = new String("Jan");
        String sb2 = new String("Feb");
        myArrList.add(sb1);
        myArrList.add(sb2);
        myArrList.add(sb2);
        ArrayList<String> assignedArrList = myArrList;
        ArrayList<String> clonedArrList = (ArrayList<String>) myArrList.clone();
        System.out.println(myArrList == assignedArrList);
        System.out.println(myArrList == clonedArrList);
        String myArrVal = myArrList.get(0);
        String assignedArrVal = assignedArrList.get(0);
        String clonedArrVal = clonedArrList.get(0);
        System.out.println(myArrVal == assignedArrVal);
        System.out.println(myArrVal == clonedArrVal);
    }
}