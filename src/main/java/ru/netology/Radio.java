package ru.netology;

public class Radio {
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation <= 9) {
            currentStation = newCurrentStation;
        }
    }

    public void nextStation() {
        int target = currentStation + 1;
       setCurrentStation(target);
        if (target > 9) {
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
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }

        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        //  currentVolume = currentVolume + 1;
        //setCurrentVolume(currentVolume);
        //if (currentVolume > 100) {
        //currentVolume = 100;
        //setCurrentVolume(currentVolume);
        //}
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        // currentVolume = currentVolume - 1;
        //setCurrentVolume(currentVolume);
        //if (currentVolume < 0) {
        //  currentVolume = 0;
        //setCurrentVolume(currentVolume);
        //}
        //}
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}