package ru.netology.smarthome;
public class Radio {
    public int currentVolume; // Текущая громкость
    public int currentRadioStation; // Текущая радиостанция


    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 10) {
            currentVolume = 10;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            currentVolume = 0;
        }
    }

    public void nextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > 1) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
    }

}