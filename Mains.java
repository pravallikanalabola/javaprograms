/*public class Mains {
    static void method(String fname, int age) {
        System.out.println("age of" + fname +  "is" + age);
    }

    public static void main(String[] args) {
        method("virat", 35);
    }
}
public class Mains{
    static void checkage(int age){
        if(age>18){
            System.out.println("eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }
    public static void main(String[] args){
        checkage(7);
    }

}
public class Mains{
    static int add(int x){
        return 10+x;
    }
    public static void main(String[] args){
        System.out.println(add(7));
    }
}
public class Mains{
    static int add(int x, int y){
        return x+y;
    }
    static float add(float x,float y){
        return x+y;
    }
    public static void main(String[] args){
        System.out.println(add(5,8));
    }
}*/
public class Mains{
    public static void main(String[] args){
        int res=sum(10);
        System.out.println(res);
    }
    public static int sum(int k){
        if(k>0){
            return k+sum(k-1);
        }
        else{
            return 0;
        }
    }
}






















