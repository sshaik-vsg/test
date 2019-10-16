/* Sample code*/
package com.abc.def;

import com.packageName1.pack.ClassName;
import com.packageName1.pack.ClassName2;
import com.packageName1.pack.ClassName3;

/**
* Class description
* 
* @author authorName
* @version 1.0.0
*/
public class SampleClass extends ParentClass implements AnInterface, AnotherInterface {
        
     //group all constants together
     private final int MAX_VALUE=123456;
        
    // one new line to separate fields by accessor type
    @Annotation
    private int fieldOne;//all fields grouped by accessor type
    private String stringOne;

    protected boolean status;

    static{
        static block;
    }

    /*
    * Method description
    *
    * @param    args command line parameters
    * @return   void
    * @exceptin java.lang.Exception
    **/
    public static void main(String[] args) throws Exception{
        int intVar = 5;//one space before and after operators
        /* 
        * switch case
        * case is indented by 1 tab
        * case code is indented by another tab
        */
        switch(var) {
            case 1:
                break;
            case 2:
                break;
            default:
        }// closing braces must always at the same indentation
        
        if(condition) {
            code with one indentation;
        } else if(cond2) { //if condition must be on the same line as else
            elseif code;
        } else {
            else code;
        }
        
        /*
        * Not adding braces to if
        * ***Bad coding practice***
        * if, else, while, do-while must always have braces
        */
        if(cond)
            do this; // skipping braces {} is valid but bad coding practice
        
        
        while(condition){
            one tab indentation;
        }
        
        //do-while
        do{
            doCode;
        }while(condition);
        // semi-colon must immediately follow while paranthesis without spaces
        
        
        try {
            code;
        } catch(IOException e) {
            exception handler;
        } catch(Exception e){
            handle exception;
        } finally{
            finallycode block;
        }
        
        /* avoid short-hand if-then-else expression
        *  as it creates problems during debugging
        */
        boolean isGreater = a>b?true:false;
               
        return;
    }
    
    /*
    * Method description
    *
    * @param     param1  this is int paramerter 1
    * @param     param2  this is paramerter 2
    * @param     param3  some description
    * @return    int     returns the result of method
    * @exception java.lang.Exception
    **/
    @Annotation1
    @Annotation2(some=params)//Each annotation must be on a separate line
    private int helperMethod(int param1, float param2, String param3){
        some code
        return -1;
    }
}
