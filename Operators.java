public class Operators{
    public static void main(){
        int a = 7, b = 0, c;
        --a;
        a--;
        ++b;
        c = a ^ b;
        System.out.print(c);

        a = 37;
        b = 4;
        c = a << b; //Formula for right shift : a*(2^b)
        System.out.print(c);

        a = 20;
        b = 2;
        c = a >> b; //Formula for right shift : a/(2^b)
        System.out.print(c);
    }
}