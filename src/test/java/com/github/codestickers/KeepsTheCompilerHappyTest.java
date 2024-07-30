package com.github.codestickers;

public class KeepsTheCompilerHappyTest {

  @KeepsTheCompilerHappy("Needs to return something when testing")
  public static String usesIsTestVariableForWhateverReason(boolean isTest) {
    if (isTest) {
      return "test";
    } else {
      return "important data";
    }
  }
}


