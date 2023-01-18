package ru.netology.smarthome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetRadioStationIfUnderNull() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetRadioStationIfMoreRange() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(11);

        int expected = 0;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.currentVolume = 5;
        radio.increaseVolume();

        int expected = 6;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStation() {
        Radio radio = new Radio();

        radio.currentRadioStation = 3;
        radio.nextRadioStation();

        int expected = 4;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStation() {
        Radio radio = new Radio();

        radio.currentRadioStation = 5;
        radio.prevRadioStation();

        int expected = 4;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.currentVolume = 5;
        radio.decreaseVolume();

        int expected = 4;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationIfNotNext() {
        Radio radio = new Radio();

        radio.currentRadioStation = 9;
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationIfNotPrev() {
        Radio radio = new Radio();

        radio.currentRadioStation = 0;
        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldDecreaseVolumeIfMinVolume() {
        Radio radio = new Radio();

        radio.currentVolume = 0;
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void notShouldIncreaseVolumeIfMaxVolume() {
        Radio radio = new Radio();

        radio.currentVolume = 10;
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }



}
