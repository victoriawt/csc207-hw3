package edu.grinnell.csc207.tsouvict.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest
{

  @Test
  public void
    splitAtTest ()
  {
   // assertEquals ("Goodbye", "Goodbye");
    assertArrayEquals (new String[] { "a", "b", "c" },
                      StringUtils.splitAt ("a:b:c", ':'));
    assertArrayEquals (new String[] { "a", "b", "c" },
                       StringUtils.splitAt ("a b c", ' '));
        assertArrayEquals (new String[] { "a:b:c" },
                       StringUtils.splitAt ("a:b:c", ' '));
   assertArrayEquals ("one field", new String[] { "a" },
                       StringUtils.splitAt ("a", ':'));
    assertArrayEquals ("empty inner field", new String[] { "a", "", "c" },
                       StringUtils.splitAt ("a::c", ':'));
    assertArrayEquals ("leading empty field", new String[] { "", "a" },
                       StringUtils.splitAt (":a", ':'));
    assertArrayEquals ("trailing empty field", new String[] { "a", "" },
                       StringUtils.splitAt ("a:", ':'));
  }

  
  @Test
  public void 
  splitCSVTest ()
  {
  assertArrayEquals (new String[] { "a", "b", "c" },
                       StringUtils.splitCSV("a,b,c"));
  assertArrayEquals (new String[] { "a,b", "c" },
                     StringUtils.splitCSV("\"a,b\",c"));
  assertArrayEquals (new String[] { "a", "b,b\"", "c" },
                     StringUtils.splitCSV("a,\"b,b\"\"\",c"));
  }
  
  @Test
  public void
    deLeetTest ()
  {
    assertEquals ("e", StringUtils.deLeet ("3"));
    assertEquals ("l", StringUtils.deLeet ("1"));
    assertEquals ("a", StringUtils.deLeet ("@"));
    assertEquals ("leet", StringUtils.deLeet ("133+"));
    assertEquals ("eat banana", StringUtils.deLeet ("3@+ |3@|\\|@|\\|@"));
  }
}