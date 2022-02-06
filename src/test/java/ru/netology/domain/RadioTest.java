package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

public class RadioTest {

    @Test
    public void setCurrentStationLessMinWhereCountZero() {
        Radio rad = new Radio(0);

        rad.setCurrentStation(-1);

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void setCurrentStationEqualMinWhereCountZero() {
        Radio rad = new Radio(0);

        rad.setCurrentStation(0);

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void setCurrentStationMoreMinWhereCountZero() {
        Radio rad = new Radio(0);

        rad.setCurrentStation(1);

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void setCurrentStationLessMinWhereCountOne() {
        Radio rad = new Radio(1);

        rad.setCurrentStation(-1);

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void setCurrentStationEqualMinWhereCountOne() {
        Radio rad = new Radio(1);

        rad.setCurrentStation(0);

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void setCurrentStationMoreMinWhereCountOne() {
        Radio rad = new Radio(1);

        rad.setCurrentStation(1);

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void nextWhereCountOne() {
        Radio rad = new Radio(1);

        rad.setCurrentStation(0);
        rad.nextStation();

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void prevWhereCountOne() {
        Radio rad = new Radio(1);

        rad.setCurrentStation(0);
        rad.prevStation();

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void setCurrentStationLessMinWhereCountTwo() {
        Radio rad = new Radio(2);

        rad.setCurrentStation(-1);

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void setCurrentStationEqualMinWhereCountTwo() {
        Radio rad = new Radio(2);

        rad.setCurrentStation(0);

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void setCurrentStationEqualMaxWhereCountTwo() {
        Radio rad = new Radio(2);

        rad.setCurrentStation(1);

        assertEquals(1, rad.getCurrentStation());
    }

    @Test
    public void setCurrentStationMoreMaxWhereCountTwo() {
        Radio rad = new Radio(2);

        rad.setCurrentStation(2);

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void nextWhereCurrentStationMinAndCountTwo() {
        Radio rad = new Radio(2);

        rad.setCurrentStation(0);
        rad.nextStation();

        assertEquals(1, rad.getCurrentStation());
    }

    @Test
    public void nextWhereCurrentStationMaxAndCountTwo() {
        Radio rad = new Radio(2);

        rad.setCurrentStation(1);
        rad.nextStation();

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void prevWhereCurrentStationMinAndCountTwo() {
        Radio rad = new Radio(2);

        rad.setCurrentStation(0);
        rad.nextStation();

        assertEquals(1, rad.getCurrentStation());
    }

    @Test
    public void prevWhereCurrentStationMaxAndCountTwo() {
        Radio rad = new Radio(2);

        rad.setCurrentStation(1);
        rad.nextStation();

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void setCountStationFive() {
        Radio rad = new Radio();

        rad.setCountStation(5);

        assertEquals(5, rad.getCountStation());
    }

    @Test
    public void setStationLessMin() {
        Radio rad = new Radio();

        rad.setCurrentStation(-1);

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void setStationEqualMin() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void setStationMoreMin() {
        Radio rad = new Radio();

        rad.setCurrentStation(1);

        assertEquals(1, rad.getCurrentStation());
    }

    @Test
    public void setStationLessMax() {
        Radio rad = new Radio();

        rad.setCurrentStation(8);

        assertEquals(8, rad.getCurrentStation());
    }

    @Test
    public void setStationEqualMax() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);

        assertEquals(9, rad.getCurrentStation());
    }

    @Test
    public void setStationMoreMax() {
        Radio rad = new Radio();

        rad.setCurrentStation(10);

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void nextWhereStationLessMax() {
        Radio rad = new Radio();

        rad.setCurrentStation(8);
        rad.nextStation();

        assertEquals(9, rad.getCurrentStation());
    }

    @Test
    public void nextWhereStationEqualMax() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);
        rad.nextStation();

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void nextWhereStationEqualMin() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);
        rad.nextStation();

        assertEquals(1, rad.getCurrentStation());
    }

    @Test
    public void prevWhereStationEqualMax() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);
        rad.prevStation();

        assertEquals(8, rad.getCurrentStation());
    }

    @Test
    public void prevWhereStationEqualMin() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);
        rad.prevStation();

        assertEquals(9, rad.getCurrentStation());
    }

    @Test
    public void prevWhereStationMoreMin() {
        Radio rad = new Radio();

        rad.setCurrentStation(1);
        rad.prevStation();

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void setVolumeLessMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void setVolumeEqualMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);

        assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void setVolumeMoreMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(1);

        assertEquals(1, rad.getCurrentVolume());
    }

    @Test
    public void setVolumeLessMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(99);

        assertEquals(99, rad.getCurrentVolume());
    }

    @Test
    public void setVolumeEqualMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);

        assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void setVolumeMoreMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(101);

        assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void increaseWhereVolumeMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.increaseVolume();

        assertEquals(1, rad.getCurrentVolume());
    }

    @Test
    public void increaseWhereVolumeLessMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(99);
        rad.increaseVolume();

        assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void increaseWhereVolumeMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.increaseVolume();

        assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void decreaseWhereVolumeMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void decreaseWhereVolumeMoreMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(1);
        rad.decreaseVolume();

        assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void decreaseWhereVolumeMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.decreaseVolume();

        assertEquals(99, rad.getCurrentVolume());
    }

}