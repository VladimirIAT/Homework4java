import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Sem4 {
    public static void main(String[] args) {
        double begin1 = System.currentTimeMillis();

        Scanner scan = new Scanner(System.in);
        ArrayList<String>list_f = new ArrayList<>();
        ArrayList<String>list_n = new ArrayList<>();
        ArrayList<String>list_sn = new ArrayList<>();
        ArrayList<Integer>list_age = new ArrayList<>();
        ArrayList<String>list_gender = new ArrayList<>();
        ArrayList<Integer> list_id = new ArrayList<Integer>();

        String in = scan.nextLine();
        int id = 0;

        while (!in.equals("q")) {
            String [] st = new String[5];
            st = in.split(" ");
            list_f.add(st[0]);
            list_n.add(st[1]);
            list_sn.add(st[2]);
            list_age.add(Integer.parseInt(st[3]));
            list_gender.add(st[4]);
            list_id.add(id);
            in = scan.nextLine();

            id ++;
        }

        int temp = 0;
        boolean flag = true;
        while(flag) {
            for (int g = 0; g < list_age.size() - 1; g++) {
                flag = false;
                if (list_age.get(g) >= list_age.get(g+1)) {
                    temp = list_age.get(g);
                    list_age.set(g, list_age.get(g+1));
                    list_age.set(g+1, temp);
                    temp = list_id.get(g);
                    list_id.set(g, list_id.get(g+1));
                    list_id.set(g+1, temp);
                    flag = true;
                }
            }
        }

        for (int x = 0; x < list_id.size(); x++) {
            System.out.println(list_f.get(x) + " " +
                    list_n.get(x).toUpperCase().charAt(0) + "." +
                    list_sn.get(x).toUpperCase().charAt(0) + ". " +
                    list_age.get(x) + " " +
                    list_gender.get(x));
        }
        double end1 = System.currentTimeMillis();
        System.out.println("Время: " + (end1 - begin1));
    }
}
