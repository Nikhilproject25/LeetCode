package src;

import java.util.ArrayList;
import java.util.List;

public class Problem5 {
    public static void main(String [] args){
        Problem5 b=new Problem5();
        b.creatingList();
    }

    public void creatingList(){
        List<Integer> L1 = new ArrayList<>();
        L1.add(1);
        L1.add(1);
        L1.add(2);
        L1.add(3);
        int i,j =0;

        System.out.println(L1);
        System.out.println(L1.size());
        for(i=0;i<L1.size();i++){
            for(j=1;j<L1.size();j++){
                if(L1.get(i)==L1.get(j))
                {
                    L1.remove(j);
                    System.out.println("New After removing"+L1);
                }
            }

        }
        System.out.println(L1);
    }

}
