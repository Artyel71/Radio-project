package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {
    @Test
    public void shouldGetStation() {
        Radio station = new Radio();

        station.setCurrentStation(50);
        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        Radio station = new Radio();

        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldChangeNextStation() {
        Radio station = new Radio();
        station.setCurrentStation(7);

        station.nextStation();

        int expected = 8;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldChangePrevStation() {
        Radio station = new Radio();
        station.setCurrentStation(-6);

        station.prevStation();

        int expected = 9;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(5);
        int expected = 5;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(88);

        volume.increaseVolume();

        int expected = 89;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);

        volume.decreaseVolume();

        int expected = 9;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}


