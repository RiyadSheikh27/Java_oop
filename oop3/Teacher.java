
package oop3;


public class Teacher {
     String name,gender;
        int number;
        
        void SetInformation(String n,String m, int ph){
        gender =n;
        name = m;
        number = ph;
        
        }
        
        void DisplayrInformation(){
                
        System.out.println("Gender = "+gender);
        System.out.println("Name= "+name);
        System.out.println("Number = "+number);
            System.out.println();
        }
}
