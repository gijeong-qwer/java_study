package p1;

public class App {
    public static void main(String[] args) {
        Choice choice = new Choice();
        choice.Parce("XML");
        choice.Parce("HMLl");
    }
}

interface Parceable {
    public void parce();
}

class xmlParce implements Parceable {
    xmlParce() {
        System.out.println("XML");
    }

    public void parce() {

    }
}

class HtmlParce implements Parceable {
    HtmlParce() {
        System.out.println("HTML");
    }

    public void parce() {

    }
}

class Choice {

    Parceable Parce(String text) {
        if (text.equals("XML")) {
            return new xmlParce();
        } else {
            return new HtmlParce();
        }

    }
}