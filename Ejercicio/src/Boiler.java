public class Boiler {
    private static Boiler instance;

    private boolean empty;
    private boolean resistanceOn;
    private Boiler() {
        empty = true;
        resistanceOn = false;
    }
    public static Boiler getInstance() {
        if (instance == null) {
            instance = new Boiler();
        }
        return instance;
    }
    public void fill(){
        if (empty && !resistanceOn) {
            empty = false;
            System.out.println("boiler lleno");
        }else{
            System.out.println("no se puede llenar si la resistencia esta encendida");
        }
    }
    public void mix(){
        if(!empty && !resistanceOn){
            resistanceOn = true;
            System.out.println("mezclando");
        }else {
            System.out.println("el boiler no esta lleno, o la resistencia esra encendida");
        }
    }
    public void drain(){
        if (!empty && resistanceOn) {
            empty = true;
            resistanceOn = false;
            System.out.println("boiler vacio");
        }else {
            System.out.println("no se puede vaciar, la resistencia esta apagada");
        }

    }
    public boolean isEmpty() {
        return empty;
    }
    public boolean isResistanceOn() {
        return resistanceOn;
    }
}
