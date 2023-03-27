package ru.netology;

public class Radio {
    private int currentStation;


    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public void nextStation() {

        currentStation = currentStation + 1;
        setCurrentStation(currentStation);
        if (currentStation > 9) {
            currentStation = 0;
            setCurrentStation(currentStation);
        }
    }

    public void prevStation() {
        currentStation = currentStation - 1;
        setCurrentStation(currentStation);
        if (currentStation < 0) {
            currentStation = 9;
            setCurrentStation(currentStation);
        }

    }


    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {

        currentVolume = currentVolume + 1;
        setCurrentVolume(currentVolume);
        if (currentVolume > 100) {
            currentVolume = 100;
            setCurrentVolume(currentVolume);
        }
    }

    public void decreaseVolume() {

        currentVolume = currentVolume - 1;
        setCurrentVolume(currentVolume);
        if (currentVolume < 0) {
            currentVolume = 0;
            setCurrentVolume(currentVolume);
        }
    }
}
