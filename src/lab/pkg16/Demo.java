package lab.pkg16;

public class Demo {

    public void demo1() {
        Gen<Integer> iOb1;
        iOb1 = new Gen<>(88);
        iOb1.showType();
        int v1 = iOb1.getOb();
        System.out.println("Value: " + v1);

        Gen<String> strOb = new Gen<>("Generic text");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("Value: " + str);
        System.out.println();
    }

    public void demo2() {
        NonGen iOb2;
        iOb2 = new NonGen(88);
        iOb2.showType();
        int v2 = (Integer) iOb2.getOb();
        System.out.println("Value: " + v2);

        NonGen strOb = new NonGen("Non generic text");
        strOb.showType();
        String str = (String) strOb.getOb();
        System.out.println("Value: " + str);
        try{
            iOb2 = strOb; /*Переменная экземпляра strOb ссылается на объект, содержащий смвольную строку, а не целое число.
                            Присвоение синтаксически корректно потому, что все ссылки NonGen одинаковы и любая ссылка типа NonGen может
                            указывать на любой другой объект типа NonGen.*/
            v2 = (Integer) iOb2.getOb(); //Ошибка во время выполнения
            }catch (Exception e){
                System.out.println("    The error of assignment iOb2 = strOb2, is transformed to the error noticed at compilation: " + e);
                System.out.println();
        }
    }

    public void demo3() {
        TwoGen<Integer, String> tgOb = new TwoGen<>(88, "Generics");
        tgOb.showTypes();
        int v3 = tgOb.getOb1();
        System.out.println("T Value: " + v3);
        String str = tgOb.getOb2();
        System.out.println("V Value: " + str);
    }
}
