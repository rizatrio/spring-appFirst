package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Music music = context.getBean("musicBean", Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer);
        System.out.println(musicPlayer2);

        boolean comparision = musicPlayer == musicPlayer2;
        System.out.println(comparision);
        //musicPlayer.playMusic();

        musicPlayer.setVolume(12);
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer2.getVolume());
        context.close();


    }
}
