import App.Narrator.Interface.INarrator;
import App.Narrator.BaseClass.Narrator;

public class App {
    private static INarrator _narrator = new Narrator("Dilan Ormisiar");
    public static void main(String[] args) throws Exception {
        _narrator.Narrate();
    }
}