package ru.netology.smarthome;

public class Radio {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentVolume = 0; // Текущая громкость
    private int currentRadioStation = 0; // Текущая радиостанция

    public Radio(int newMaxRadioStation) {
        this.maxRadioStation = newMaxRadioStation - 1;
    }

    public Radio() {

    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }

    public void nextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
            return;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

}
