package Lambda;
interface MyAdd{
    int add(int a,int b);
}
interface MySub{
    int sub(int a,int b);
}
interface MyMultiple{
    int multiple(int a,int b);
}
interface MyDivision{
    int division(int a,int b);
}
public class ArthOper {
    public static void main(String[] args){

        MyAdd addFunction=(int a,int b)->a+b;
        System.out.println(addFunction.add(2,5));
        MySub subFunction=(int a,int b)->a-b;
        System.out.println(subFunction.sub(2,5));
        MyMultiple mulFunction=(int a,int b)->a*b;
        System.out.println(mulFunction.multiple(2,5));
        MyDivision divFunction=(int a,int b)->a/b;
        System.out.println(divFunction.division(2,5));
    }
}
