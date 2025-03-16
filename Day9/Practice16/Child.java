package Day9.Practice16;

import static Day9.Practice16.Base.mandatoryStatic;

public class Child extends Base{
    
   @Override
    protected void optionalMethod() {

        System.out.println("[Child:optionalMethod] EXTRA Stuff Here");
        super.optionalMethod();
    }

    // @Override
    //    public void recommendedMethod() {
    
    //        System.out.println("[Child:recommendedMethod]: I'll do things my way");
    //        optionalMethod();
    //    }
    
    private void mandatoryMethod() {
        System.out.println("[Child:mandatoryMethod]: My own important stuff");
    }


    
    public static void optionalStatic() {
        System.out.println("[BaseClass.optionalStatic]: Optional");
    }
    public static void recommendedStatic() {

        System.out.println("[ChildClass.recommendedStatic] BEST Way to Do it");
        optionalStatic();
        // mandatoryStatic();
    }

}
