package eu.senla.task1;

public class Main {

    public static void main (String[] args){
        byte a1 = 12;
        short b1 = 32767;
        int c1 = 2147483647;
        long d1 = 775808;
        float e1 = 3.14856937f;
        double f1 = 123.456;
        char g1 = 'a';
        boolean h1 = true;

        Byte a2 = 3;
        Short b2 = 500;
        Integer c2 = 1000000;
        Long d2 = 775808L;
        Float e2 = 3.6377F;
        Double f2 = 8174781D;
        Character g2 = 'G';
        Boolean h2  = false;

        // Для примитивов
        Number number = new Number ();
        number.setA((byte) 127);
        System.out.println(number.getA());

        number.setB((short) 12007);
        System.out.println(number.getB());

        number.setC((int) 61231231);
        System.out.println(number.getC());

        number.setD((long) 7367677867213l);
        System.out.println(number.getD());

        number.setE((float) 12.72867123f);
        System.out.println(number.getE());

        number.setF((double) 786348632346d);
        System.out.println(number.getF());

        number.setG((char) 'A');
        System.out.println(number.getG());

        number.setH((boolean) false);
        System.out.println(number.getH());

        // Для ссылок

        number.setaByte((byte) 128);
        System.out.println(number.getaByte()); // Слишком большое число для byte, выходит за пределы

        number.setcInteger((int) 12.5);
        System.out.println(number.getcInteger()); // Потеря точности при переходе с типа float в int

        number.setdLong((long) 0.5);
        System.out.println(number.getdLong()); // Потеря точности при переходе с типа float в int

        number.seteFloat((float) 12.7762867123f);
        System.out.println(number.geteFloat());

        number.setfDouble((double) 12.7762867123);
        System.out.println(number.getfDouble());

        //number.setgCharacter((char) 'tata');  String не может быть приведен к char
        //System.out.println(number.getgCharacter());

        number.sethBoolean((boolean) true);
        System.out.println(number.gethBoolean());
    }
}
