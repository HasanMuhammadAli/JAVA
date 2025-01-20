//This code has errors of scope of variables.

class Scope_Variable {
    public static void main(String[] args){
        int x = 10;
        System.out.println("Scope of x in main, x  = "+x);
        {
            //int x = 20;
         //   System.out.println("scope of x in a block, x = "+x);
            {
                int y = 30 ;
                System.out.println("scope of y in a block, y = "+y);
            }
        //    System.out.println("scope of y in main, y = "+ y);
        }
      //  System.out.println("scope of y in main, y = "+ y);
    }
}
//the comment out code has errors

// error : duplicate local variable x line 6 


// the scope of any variable is upto it's block can't fetch outside block  
//error : cannot be resolves to a variable line 12 and 14