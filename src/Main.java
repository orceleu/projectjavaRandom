import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("programe de euler , voici  2 nbre  qui est le plus grand?");

         alea();


    }private static void func(int a){
        System.out.println(a*5);

        ArrayList<Object> list =new ArrayList<>();
        list.add("Meugler");
        list.add("salut");
        list.add(3);
        System.out.println(list.get(2));
    } private static void alea(){
       double x=Math.random()*(100-1);
       int y= (int) Math.round(x);
       System.out.println(y);

        double s=Math.random()*(100-1);
        int t= (int) Math.round(s);
        System.out.println(t);



       System.out.println("choisir une rep: 1-> selection d du premier nbre   2-> selection du deuxieme nbre");
       Scanner scanner=new Scanner(System.in);
       byte sc= scanner.nextByte();

     switch (sc){
         case 1:
         if (t < y) {
             System.out.println("bonne rep");
         }else System.out.println("mauvaise"); break;
         case 2:if (t > y) {
             System.out.println("bonne rep");
         }else System.out.println("mauvaise");break;
    }}
}