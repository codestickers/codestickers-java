package com.github.codestickers;

public class KeepTheCompilerHappyTest {

  @KeepTheCompilerHappy("Needs to return something when testing")
  public static String usesIsTestVariableForWhateverReason(boolean isTest) {
    if (isTest) {
      return "test";
    } else {
      return "important data";
    }
  }
}


