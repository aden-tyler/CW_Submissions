/** Task 1: makeOutWord
* Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". 
* Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
**/
public String makeOutWord(String out, String word) {
  String putInside = (out.substring(0,2) + word + out.substring(2,out.length()));
  return putInside;
}

/** Task 2: extraEnd
* Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
* The string length will be at least 2.
**/
public String extraEnd(String str) {
  String lastTwo = str.substring(str.length()-2);
  return lastTwo + lastTwo +lastTwo;
}

/** Task 3: firstTWo
  
* Given a string, return the string made of its first two chars, so the String "Hello" yields "He". 
* If the string is shorter than length 2, return whatever there is, so "X" yields "X", 
* and the empty string "" yields the empty string "". 
* Note that str.length() returns the length of a string.
**/
public String firstTwo(String str) {
  if (str.length() < 2)
  {
    return str;
  }
  else
  {
    return str.substring(0,2);
  }
}
/** Task 4: withoutEnd
* Given a string, return a version without the first and last char, so "Hello" yields "ell". 
* The string length will be at least 2.
**/
public String withoutEnd(String str) {
    String withoutEnd = str.substring(1,str.length()-1);
    return withoutEnd;
}
