package edu.grinnell.csc207.tsouvict.utils;

import java.io.PrintWriter;

public class SplitExpt
{

  /**
   * @param args
   */
  public static void
    main (String[] args)
  {
    PrintWriter pen = new PrintWriter(System.out, true);
    String[] vals = StringUtils.splitAt ("a:b:c", ':');
    for (int i = 0; i < vals.length; i++)
      {
        pen.println("vals[" + i + "] = " + vals[i]);
      } // for i

  } //main
 
} // class SplitExpt
