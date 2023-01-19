package ru.netology.smarthome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "5,5",
            "0,0",
            "0,-1",
            "1,1",
            "0,10",
            "9,9",
            "8,8"
    })
    public void shouldSetRadioStationIfBorderValue(int expected, int station) { // Тесты граничных значений при выборе станции вручную
        Radio radio = new Radio();

        radio.setCurrentRadioStation(station);

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    
    @ParameterizedTest
    @CsvSource({
            "6,5",
            "1,0",
            "2,1",
            "9,8",
            "10,9",
            "10,10"
    })
    public void shouldIncreaseVolumeIfBorderValue(int expected, int volume) { // Тесты граничных значений при увеличении звука
        Radio radio = new Radio();

        radio.setCurrentVolume(volume);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "0,1",
            "4,5",
            "9,10",
            "8,9"
    })
    public void shouldDecreaseVolumeIfBorderValue(int expected, int volume) { // Тесты граничных значений при уменьшении звука
        Radio radio = new Radio();

        radio.setCurrentVolume(volume);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "6,5",
            "0,9",
            "9,8",
            "1,0",
            "2,1"
    })
    public void shouldIncreaseRadioStationIfBorderValue(int expected, int station) {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(station);
        ;
        radio.nextRadioStation();

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "4,5",
            "9,0",
            "8,9",
            "0,1",
            "1,2"
    })
    public void shouldDecreaseRadioStationIfBorderValue(int expected, int station) {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(station);
        radio.prevRadioStation();

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetVolumeIfValueMoreMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);
        int expected = 0;

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetVolumeIfValueUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        int expected = 0;

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
