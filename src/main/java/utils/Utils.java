package utils;

import org.modelmapper.ModelMapper;

public abstract class Utils {
  public static ModelMapper mapper = new ModelMapper();

  public static boolean isInteger(String s) {
    for (int i = 0; i < s.length(); i++) {
      if (!Character.isDigit(s.charAt(i))) {
        return false;
      }
    }
    return true;
  }
}
