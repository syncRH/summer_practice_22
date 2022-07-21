import java.lang.String;


public class Animal {


    public void getTimeOfTheRoute(float metres) {
        System.out.println("\nЖивотное: " + _typeOfAnimal);
        System.out.println("Время за которое " + _typeOfAnimal + ", пройдет по суше, равно = " + metres/_speedOnPlain);
        System.out.println("Время за которое " + _typeOfAnimal + ", пройдет по воде, равно = " + metres/_speedSwimming);
        System.out.println("Животное " + (_isHasTail ? "имеет" : "не имеет") + " хвост.");
        System.out.println("Животное " + (_isOvercomeBarriers ? "умеет" : "не умеет") + " преодолевать преграды.");
        System.out.println("Цвет шерсти " + _typeOfAnimal + " = " + _colorWool + "\n");
    }

    protected float _speedOnPlain;
    protected float _speedSwimming;
    protected boolean _isOvercomeBarriers;
    protected boolean _isHasTail;
    protected String _colorWool;
    protected String _typeOfAnimal;
}
