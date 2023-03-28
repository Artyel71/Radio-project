package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;


class RadioTest {

    @Test
    void shouldSetCurrentStation() {
        Radio radio = new Radio(10, 9, 40, 100);
        int expected = 10;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationUnderMin() {
        Radio radio = new Radio(10, 10, 40, 100);
        int currentStation = -1;
        radio.setCurrentStation(currentStation);
        int expected = 10;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationOverMax() {
        Radio radio = new Radio(10, 10, 40, 100);
        int currentStation = 11;
        radio.setCurrentStation(currentStation);
        int expected = 10;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldChangeOnPrevStationIsMin() {
        Radio radio = new Radio(10, 10, 40, 100);
        int currentStation = 0;
        radio.setCurrentStation(currentStation);
        radio.prevStation();
        int expected = 10;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldNotChangeStationIfStationIsMax() {
        Radio radio = new Radio(10, 10, 40, 100);
        int currentStation = 10;
        radio.setCurrentStation(currentStation);
        radio.nextStation();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldChangePrevStation() {
        Radio radio = new Radio(10, 10, 40, 100);
        int currentStation = 5;
        radio.setCurrentStation(currentStation);
        radio.prevStation();
        int expected = 4;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldChangeNextStation() {
        Radio radio = new Radio(10, 10, 40, 100);
        int currentStation = 4;
        radio.setCurrentStation(currentStation);
        radio.nextStation();
        int expected = 5;
        Assertions.assertEquals(expected, radio.getCurrentStation());

    }

    @Test
    void shouldSetCurrentVolume() {
        Radio radio = new Radio(10, 9, 40, 100);
        int expected = 40;
        Assertions.assertEquals(expected, radio.getVolume());
    }
    @Test
    void shouldSetVolumeIfOverMax() {
        Radio radio = new Radio(10, 10, 100, 100);
        int volume = 101;
        radio.setVolume(volume);
        int expected = 100;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldCSetVolumeIfUnderMin() {
        Radio radio = new Radio(10, 10, 0, 100);
        int volume = -1;
        radio.setVolume(volume);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldNotChangeVolumeIfMax() {
        Radio radio = new Radio(10, 10, 40, 100);
        int volume = 100;
        radio.setVolume(volume);
        radio.increaseVolume();
        int expected = 100;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldNotChangeVolumeIfMin() {
        Radio radio = new Radio(10, 10, 40, 100);
        int volume = 0;
        radio.setVolume(volume);
        radio.decreaseVolume();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio(10, 10, 100, 100);
        int volume = 101;
        radio.setVolume(volume);
        radio.increaseVolume();
        int expected = 100;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio(10, 10, 100, 100);
        int volume = 76;
        radio.setVolume(volume);
        radio.decreaseVolume();
        int expected = 75;
        Assertions.assertEquals(expected, radio.getVolume());
    }
}

