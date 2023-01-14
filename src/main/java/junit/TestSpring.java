package junit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext.xml");
//    Music music = context.getBean("musicBean", Music.class);
// передаем зависимоть при помощи конструктора
//    MusicPlayer musicPlayer = new MusicPlayer(music);

    MusicPlayer musicPlayer = context.getBean("musicPlayer",
        MusicPlayer.class);
    //в параметры указываем id и класс из конфиг файла applicationContext.xml
//    <bean id="musicPlayer"
//    class="junit.MusicPlayer"> путь до класса в папке java
//    <constructor-arg ref="musicBean"/>
//    </bean>,
    //таким образом с помощью спринга внедрили зависимость (DI)
    musicPlayer.getMusicList(); // внедрение List
    System.out.println(musicPlayer.getName());
    System.out.println(musicPlayer.getVolume());
    context.close(); //обязательно закрывать
  }
}
