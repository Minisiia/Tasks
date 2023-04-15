package tasks.set;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("black");
        set.add("white");
        set.add("pink");
        set.add("black");
        System.out.println(set.size());
        for (String s : set) {
            System.out.print(s + " ");
        }

        System.out.println("\n------------------------");
        HashSet<Colors> colorsHashSet = new HashSet<>();
        Colors color1 = new Colors("black");
        Colors color2 = new Colors("white");
        Colors color3 = new Colors("pink");
        Colors color4 = new Colors("black");
        colorsHashSet.add(color1);
        colorsHashSet.add(color2);
        colorsHashSet.add(color3);
        colorsHashSet.add(color4);
        System.out.println(colorsHashSet.size());
        for (Colors s : colorsHashSet) {
            System.out.print(s + " ");
        }
    }
}

class Colors {
    String color;

    public Colors(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
