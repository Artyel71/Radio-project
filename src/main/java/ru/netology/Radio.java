package ru.netology;

public class Radio {
    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {

        currentStation = newCurrentStation;
    }

    public void nextStation() {
        int target = currentStation + 1;
        setCurrentStation(target);
        if (currentStation > 9) {
            currentStation = 0;
            setCurrentStation(currentStation);
        }

    }

    public void prevStation() {
        int target = currentStation - 1;
        setCurrentStation(target);
        if (currentStation < 0) {
            currentStation = 9;
            setCurrentStation(currentStation);
        }
    }

    public int currentVolume;

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


