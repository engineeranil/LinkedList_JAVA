import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> liste = new LinkedList<>();
        liste.add("AYI BOGAN RECO24");
        liste.add("RESUL24");
        liste.add("YAHYA24");

        System.out.println(liste.contains("RESUL"));
        Iterator<String> ıtr = liste.iterator();
        while (ıtr.hasNext()){
            System.out.println(ıtr.next());
        }

        for(String stu:liste){
            System.out.println(stu);
        }
    }
}
