package junit;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

//  private Music music;
  private List<Music> musicList = new ArrayList<>();

  public void getMusicList() {
    for (Music music : musicList) {
      System.out.println("играет: "+ music.getSong());
    }
  }

  public void setMusicList(List<Music> musicList) {
    this.musicList = musicList;
  }

  private String name;
  private int volume;
  //IoC(инверсия контроля)
//  public MusicPlayer(Music music) {
//    this.music = music;} передаем все классы имплементирующие интерфейс Music в конструктор

//  public MusicPlayer() {} так как до этого был создан конструктор с параметрами создадим пустой конструктор,
// он нужен для настройки конфиг файла applicationContext.xml для того, чтобы использовать сеттер

//  public void playMusic() {System.out.println("Играет " + music.getSong());}

//  public void setMusic(Music music) { //создали сеттер для конф файла,
// спринг ищет название сеттера с маленькой буквы после слова set
// (он в курсе про правило в java CamelCase и знает слово set), поэтому в в конфигурационном файле
// мы указываем так:
// <bean id="musicPlayer"
//   class="junit.MusicPlayer">
//   <property name="music" ref="musicBean"/>
// </bean>  таким образом внедрили зависимость при помощи сеттера
//    this.music = music;}

// настройка конфиг файла для созданных ниже геттеров и сеттеров
  //<bean id="musicPlayer"
  //    class="junit.MusicPlayer">
  //    <property name="music" ref="musicBean"/>
  //    <property name="name" value="Some name"/>
  //    <property name="volume" value="50"/>
  //  </bean>
  // внедрение файла musicPlayer.properties в конфиг файле applicationContext
  //  <context:property-placeholder location="classpath:musicPlayer.properties"/>

  //как вызывать в конфиг файле:
  // <property name="name" value="${musicPlayer.name}"/>
  // <property name="volume" value="${musicPlayer.volume}"/>
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }
}
