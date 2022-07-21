import java.lang.String;


public class Animal {


    public void getTimeOfTheRoute(float metres) {
        System.out.println("\n��������: " + _typeOfAnimal);
        System.out.println("����� �� ������� " + _typeOfAnimal + ", ������� �� ����, ����� = " + metres/_speedOnPlain);
        System.out.println("����� �� ������� " + _typeOfAnimal + ", ������� �� ����, ����� = " + metres/_speedSwimming);
        System.out.println("�������� " + (_isHasTail ? "�����" : "�� �����") + " �����.");
        System.out.println("�������� " + (_isOvercomeBarriers ? "�����" : "�� �����") + " ������������ ��������.");
        System.out.println("���� ������ " + _typeOfAnimal + " = " + _colorWool + "\n");
    }

    protected float _speedOnPlain;
    protected float _speedSwimming;
    protected boolean _isOvercomeBarriers;
    protected boolean _isHasTail;
    protected String _colorWool;
    protected String _typeOfAnimal;
}
