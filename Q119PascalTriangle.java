import java.util.ArrayList;
import java.util.List;

public class Q119PascalTriangle {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        if(rowIndex==0){return l1;}
        l1.add(1);
        if(rowIndex==1){return l1;}

        List<List<Integer>>ll=new ArrayList<>();
        ll.add(l1);

        for(int i=0;i<rowIndex;i++){
            List<Integer> lk=ll.get(i);
            List<Integer> ad=new ArrayList<>();
            ad.add(1);
            for(int j=1;j<lk.size();j++){
                ad.add(lk.get(j)+lk.get(j-1));
            }
            ad.add(1);
            ll.add(ad);
        }
        return ll.get(rowIndex-1);
    }
    public static void main(String[]args){
        System.out.println(getRow(5));
    }
}
