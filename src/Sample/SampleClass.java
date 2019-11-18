package Sample;

import Rough.TestA;

public class SampleClass extends TestA{

    public static void main(String[] args) {

        SampleClass obj = new SampleClass();

        System.out.println(obj.publicVariable);
        System.out.println(obj.protectedVariable);
        
    }
}
