package ru.netology.smarthome;

public class Radio {
    private int currentVolume = 0; // Текущая громкость
    private int currentRadioStation; // Текущая радиостанция

    private int maxVolume = 10;
    private int minVolume = 0;

    private int maxRadioStation = 9;
    private int minRadioStation = 0;

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
