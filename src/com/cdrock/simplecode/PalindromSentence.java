package com.cdrock.simplecode;

/**
 * @author Chandan Sharma
 */
public class PalindromSentence {
    public static void main(String[] args) {
        String str = "Too hot to hoot";
        //String str = "tokkot";
        char[] strChar = new char[str.length()];
        int check=0;
        for (int i=0;i<str.length();i++){
            if (!Character.isWhitespace(str.charAt(i))){
                strChar[i]=str.charAt(i);
                check++;
            }
        }

        boolean flag=false;
        int count=check;
        for (int i = 0; i < count; i++) {
            //System.out.print("="+strChar[i]);
            check--;
            if(strChar[i]==strChar[check]){
              //  System.out.print("-"+strChar[i]);
                flag=true;
            }else{
                //System.out.print(" "+strChar[i]);
                flag=false;
            }

        }
        if(flag){
            System.out.println("This is palindrome");
        }else {
            System.out.println("This is not palindrome");
        }
    }
}
