package junit;

public class RockMusic implements Music{
  // объект-он же бин, так называются объекты java в Spring
  @Override
  public String getSong() {
    return "рок музыка";
  }
}
