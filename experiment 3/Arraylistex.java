import java.util.ArrayList;

public class Arraylistex {
    public static void main(String[] args) {
        ArrayList<Integer> intArrL = new ArrayList<Integer>();
        intArrL.add(345);
        intArrL.add(999);
        for (int i=1;i<10;i++)
            intArrL.add(i*i);
        /*for(Integer e:intArrL)
            System.out.println(e); */
        intArrL.forEach(e->System.err.println(e)); // arrow notation 
        // use e for the expression ahead of arrow
        intArrL.forEach(e->{int r = e*e; System.out.println(r);});
        System.out.println("Size of ArrayList: " + intArrL.size());

        System.out.println("Index of 999: " + intArrL.indexOf(999));
        intArrL.add(1);
        System.out.println("First index of 1: " +intArrL.indexOf(1));
        System.out.println("Last index of 1: " + intArrL.lastIndexOf(1));
        intArrL.remove(Integer.valueOf(1));

        ArrayList<Integer> newArrL = new ArrayList<Integer>();
        newArrL.add(3);
        newArrL.add(6);
        newArrL.add(9);
        intArrL.addAll(newArrL);
        intArrL.forEach(e->System.out.println(e));

        ArrayList<String> wordList = new ArrayList<String>(5);
        wordList.add("Cat");
        wordList.add("Dog");
        wordList.add("Cow");
        wordList.add("Pig");
        wordList.add("Buffalo");
        wordList.add("Horse");
        wordList.forEach(w->{if(w.startsWith("C"))System.out.println(w);});
        wordList.remove("Pig");
        wordList.remove(4);
        wordList.forEach(e->System.out.println(e));
    }
}
