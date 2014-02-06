package edu.grinnell.csc207.tsouvict.utils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Calculator
{
  //Part E
  // This code is not running correctly, but I unfortunately did not have enough time to debug it.
  // Conversion between number types: http://stackoverflow.com/questions/321549/double-to-long-conversion
public static BigInteger
eval0(String store)
{
  int i, j, k, len;
  int init, juice;
  double current=0;
  List<Integer> numArray = new ArrayList<Integer> ();
  List<Character> a = new ArrayList<Character> ();
  for (i=0; i <store.length(); i++){
    if(store.charAt(i)!=' '){
      if((store.charAt(i-1)== '1') || (store.charAt(i-1)== '2')|| (store.charAt(i-1)== '3') || (store.charAt(i-1)== '4') || (store.charAt(i-1)== '5') || (store.charAt(i-1)== '6') || (store.charAt(i-1)== '7') || (store.charAt(i-1)== '8') || (store.charAt(i-1)== '9'))
    numArray.add(Integer.parseInt (store.substring(0,i-1)));
      a.add(store.charAt(i+1));
      store=store.substring (i+2);
    }
    numArray.add (Integer.parseInt(store.substring (0, store.length ())));
  }
    int[] arrayToDo= new int[numArray.size()]; 
    char[] funcsArray= new char[a.size()];
   
    for(j=0, len = numArray.size(); j < len; j++){
      arrayToDo[j] = numArray.get(j);
      }
    for( k=0, len = a.size(); k < len; k++){
      funcsArray[k] = a.get(k);
      }
    
    for (init=1;init<numArray.size (); init++){
      current= current+arrayToDo[init-1];
    if (funcsArray[init]=='+')
      {current= current+arrayToDo[init-1];
      }
    if (funcsArray[init]=='-')
      {current= current-arrayToDo[init-1];
      }
    if (funcsArray[init]=='*')
      {current= current*arrayToDo[init-1];
      }
    if (funcsArray[init]=='^')
      {current= Math.pow(current, arrayToDo[init-1]);
      }
    if (funcsArray[init]=='/')
      {current= current/arrayToDo[init-1];
      }
   }return BigInteger.valueOf ((long) current);
}//Calculator Method
}//Calculator main Class

