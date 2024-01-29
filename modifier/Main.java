
package modifier;

public class Main {
    
    public static void main(String[] args) {
        
    
     Person mPerson = new Person();
    mPerson.setName("Mikey");
    
     Modifier mModifier = new Modifier();
     mModifier.setName("Repuky");

System.out.println("Person Name: " + mPerson.getName()); 
        System.out.println("Modifier Name : " + mModifier.getName());
    }
}
