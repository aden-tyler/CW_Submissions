/** Task 1: cigarParty
* When squirrels get together for a party, they like to have cigars. 
* A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. 
* Unless it is the weekend, in which case there is no upper bound on the number of cigars. 
* Return true if the party with the given values is successful, or false otherwise.
**/
public boolean cigarParty(int cigars, boolean isWeekend) {
if (cigars >= 40)
  {
      if (cigars <= 60)
     {
        if (isWeekend = false)
        {
          return true;
        }
     }
  }
  else 
  {
    return false;
  }
}
/** Task 2: dateFashion
* You and your date are trying to get a table at a restaurant. 
* The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. 
* The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. 
* If either of you is very stylish, 8 or more, then the result is 2 (yes).
* With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
**/
public int dateFashion(int you, int date) {
  if (you <= 2 || date <=2)
  {
    {
      return 0;
    }
    
  }
 else if (you >= 8 || date >= 8)
    {
      {
        return 2;
      }
    }
  else 
  {
    return 1;
  }
}
/** Task 3: squirrelPlay
* The squirrels in Palo Alto spend most of the day playing. 
* In particular, they play if the temperature is between 60 and 90 (inclusive). 
* Unless it is summer, then the upper limit is 100 instead of 90. 
* Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise. 
**/
public boolean squirrelPlay(int temp, boolean isSummer) {
if (isSummer == true)
  { 
    if (temp >= 60 && temp <= 100)
      {
        return true;
      }
    else
    {
      return false;
    }
  }
  else if (temp >= 60 && temp<=90)
  {
     return true;
  }
    return false;
}


/** Task 4: caughtSpeeding
* You are driving a little too fast, and a police officer stops you. 
* Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. 
* If speed is 60 or less, the result is 0. 
* If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. 
* Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
**/
  public int caughtSpeeding(int speed, boolean isBirthday) {

if (isBirthday == true)
{
  if (speed >= 86)
  {
    return 2;
  } 
  else if (speed <= 65)
  {
      return 0;
  }
  return 1;
  
}
  if(speed >= 81)
  {
    return 2;
  }
  else if (speed<=60)
  {
    return 0;
  }
  return 1;  
}

/** Task 5: sortaSum
* Given 2 ints, a and b, return their sum. 
* However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
**/
public int sortaSum(int a, int b) {
  if (a + b >= 10 && a+b <= 19)
  {
    return 20;
  }
  else 
  {
    return a+b;
  }
}
