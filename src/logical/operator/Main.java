package logical.operator;

public class Main {

    public static void main(String[] args) {
	    // логическое И   &&
        boolean a = true;
        boolean b = true;
        boolean result = a && b;// a,b - операнды, && - операция логического “И”
        System.out.println(result);

        boolean a1 = true;
        boolean b1 = false;
        boolean result1 = a1 && b1;
        System.out.println(result1);

        // логический оператор ИЛИ  ||
        boolean a2 = false;
        boolean b2 = true;
        boolean result2 = a2 || b2;
        System.out.println(result2);

        boolean a3 = false;
        boolean b3 = false;
        boolean result3 = a3 || b3;
        System.out.println(result3);

        // логическое отрицание НЕ !
        boolean a4 = false;
        boolean b4 = true;
        System.out.println(!a4);
        System.out.println(!b4);
    }
}
