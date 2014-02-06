package edu.grinnell.csc207.tsouvict.utils;

import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.List;

//import java.util.Arrays;

public class StringUtils
{
  // Part A
  // Used arrayList ideas from
  // http://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
  public static String[]
    splitAt (String str, char secret)
  {
    List<String> a = new ArrayList<String> ();
      {
        while (str.indexOf (secret) != -1)
          {
            a.add (str.substring (0, str.indexOf (secret)));
            str = str.substring (str.indexOf (secret) + 1);
          }
        a.add (str.substring (0, str.length ()));
      }
    String[] simpleArray = new String[a.size ()];
    a.toArray (simpleArray);
    return simpleArray;
  }// splitAt Procedure

  // PartB
  // Is not complete but unfortunately did not have time to fix it
  public static String[]
    splitCSV (String cString)
  {
    List<String> arList = new ArrayList<String> ();
    int comma = 0;
    int quoteN = 0;
    int i;
    for (i = 0; i < cString.length (); i++)
      {
        if (cString.charAt (i) == ',')
          if (quoteN == 0)
            {
              arList.add (cString.substring (0, i - 1));
              cString = cString.substring (i + 1);
            }
          else
            quoteN++;
        if (cString.charAt (i) == '\"')
          {
            if (comma == 0 && quoteN == 1)
              arList.add (cString.substring (0, i - 1));
            cString = cString.substring (i + 1);
          }
        else
          quoteN++;
      }
    String[] nArray = new String[arList.size ()];
    arList.toArray (nArray);
    return nArray;
  }// SplitCSV Procedure

  // Part C
  // Learned about String Builder Library from
  // http://docs.oracle.com/javase/6/docs/api/java/lang/StringBuilder.html
  // PreConditions: If testing B and N, must have corresponding characters
  // within the middle of the string, such as in "eat banana".
  public static String
    deLeet (String liit)
  {
    StringBuilder newString = new StringBuilder ();
    int i = 0;
    while (i < liit.length ())
      {
        if (liit.charAt (i) == '3')
          newString.append ('e');
        if (liit.charAt (i) == ' ')
          newString.append (' ');
        if (liit.charAt (i) == '@')
          newString.append ('a');
        if (liit.charAt (i) == '1')
          newString.append ('l');
        if (liit.charAt (i) == '+')
          newString.append ('t');
        if (liit.charAt (i) == '0')
          newString.append ('o');

        if (liit.charAt (i) == '|')
          {
            if (liit.charAt (i + 1) == '3')
              {
                newString.append ('b');
                i += 1;
              }
            if (liit.charAt (i + 1) == '\\')
              {
                newString.append ('n');
              }
          }
        i++;
      }
    return newString.toString ();
  }// deLeet Procedure

  // Part D
  // Professor Rebelsky pondered outloud why I hadn't used charAt. (I split it
  // into char array originally).
  public static void
    nameGame (String name)
  {
    PrintWriter pen = new PrintWriter (System.out, true);
    String newName;
    int i = 0;
    while ((name.charAt (i) != 'a') && (name.charAt (i) != 'e')
           && (name.charAt (i) != 'i') && (name.charAt (i) != 'o')
           && (name.charAt (i) != 'u'))
      {
        i = i + 1;
      }
    newName = name.substring (i, name.length ());
    pen.println (name + "!");
    pen.println (name + ", " + name + " bo B" + newName + " Bonana fanna fo F"
                 + newName);
    pen.println ("Fee fy mo M" + newName + ", " + name);
    pen.close ();
  }// nameGame method
}// Class StringUtils

