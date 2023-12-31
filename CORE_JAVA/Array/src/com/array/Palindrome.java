package com.array;

public class Palindrome {
	public static void main(String[] args) {
		char[] word = {'n','i','t','i','n'};
		System.out.println(Palindrome.istPalindrom(word));
	}
	
	public static boolean istPalindrom(char[] word){
	    int i1 = 0;
	    int i2 = word.length - 1;
	    while (i2 > i1) {
	        if (word[i1] != word[i2]) {
	            return false;
	        }
	        ++i1;
	        --i2;
	    }
	    return true;
	}
}
