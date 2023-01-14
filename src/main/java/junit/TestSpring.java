package junit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext.xml");
//    Music music = context.getBean("musicBean", Music.class);
// передаем зависимоть при помощи конструктора
//    MusicPlayer musicPlayer = new MusicPlayer(music);

    MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//    в параметры указываем id и класс из конфиг файла applicationContext.xml
//    <bean id="musicPlayer"
//    class="junit.MusicPlayer"> путь до класса в папке java
//    <constructor-arg ref="musicBean"/>
//    </bean>,
    //таким образом с помощью спринга внедрили зависимость (DI)
    musicPlayer.getMusicList(); // внедрение List
    System.out.println(musicPlayer.getName());
    System.out.println(musicPlayer.getVolume());

    MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
    //создали специально второй бин
    System.out.println(musicPlayer);//сравниваем два бина (в конфиг файле по умолчанию scope singletone)
    System.out.println(secondMusicPlayer);//соответственно указатели бинов будут указывать на один объект в памяти
    //если наш объект изменяемый, то в конфиг файле нужно указать prototype:
    //<bean id="musicPlayer"
    //    class="junit.MusicPlayer"
    //    scope="prototype"/>

    context.close(); //обязательно закрывать
  }
}
