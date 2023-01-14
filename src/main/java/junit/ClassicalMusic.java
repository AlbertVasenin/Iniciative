package junit;

public class ClassicalMusic implements Music{
  // объект-он же бин, так называются объекты java в Spring
  @Override
  public String getSong() {
    return "классическая музыка";
  }
}
