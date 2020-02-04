package com.spartaglobal.em.engineering50;

public class IntegerPalindrome {

    public boolean checkIntegerIsPalindrome(int number){
        String numberAsString = Integer.toString(number);
        String spare = Integer.toString(number);
        StringBuilder spareAsStringBuilder = new StringBuilder(spare);
        StringBuilder reversedString = spareAsStringBuilder.reverse();
        if ( numberAsString.equals(reversedString.toString()) ){
            return true;
        }else {
            return false;
        }
    }
}
