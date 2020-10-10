package flyweight;

public class FlyweightEverydayDemo{
    public static void main(String ... args){
        Integer firstInteger = Integer.valueOf(5);
        Integer secondInteger = Integer.valueOf(5);
        Integer thirdInteger = Integer.valueOf(10);

        System.out.println(System.identityHashCode(firstInteger));
        System.out.println(System.identityHashCode(secondInteger));
        System.out.println(System.identityHashCode(thirdInteger));
    }
}
