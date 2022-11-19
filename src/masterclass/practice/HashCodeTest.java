package masterclass.practice;

public class HashCodeTest {
        public static void main(String[] args) {

                String s1="prabhat";
                System.out.println(s1.hashCode());
                System.out.println(s1.hashCode());
                System.out.println(s1.hashCode());
                System.out.println("=============");
                String s2="deepa";
                System.out.println(s2.hashCode());
                System.out.println("=============");
                Integer i=new Integer(95461621);
                System.out.println(i.hashCode());

                System.out.println("=============");
                String s3=new String("prabhat");
                System.out.println(s1.equals(s3));//true
                System.out.println(s3.hashCode());

                Dog dog1=new Dog("tommy",10,"red");
                Dog dog2=new Dog("tommy",10,"red");
                System.out.println(dog1.equals(dog2));//true as equals() is overridden
                System.out.println(dog1.hashCode() +"  "+dog2.hashCode());



        }
}
