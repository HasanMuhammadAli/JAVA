
class ConstantsVar{
    //any static varaible with final keyword are reffered as constants.
    public static final double PI = 3.14;
    //public static final String NAME;
    //We must assign some value if we use final keyword
    
    
    //It is good practice to make constants in uppercase so they can be distinguish from normal variables
}


class Constants {
    public static void main(String[] args) {
        System.out.println("Value of PI: "+ ConstantsVar.PI);
        //ConstantsVar.PI = 2.20; 
        // Error:The final field ConstantsVar.PI cannot be assigned
        //System.out.println("Value of PI: "+ ConstantsVar.PI);

        //ConstantsVar.NAME = "Ali"; 
        // Error:The final field ConstantsVar.NAME cannot be assigned
        //System.out.println("Value of PI: "+ ConstantsVar.NAME);
    }
    
}
