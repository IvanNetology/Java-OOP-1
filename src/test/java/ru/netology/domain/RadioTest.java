package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

public class RadioTest {

    @Test
    public void setStationLessMin() {
        Radio rad = new Radio();

        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setStationEqualMin() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setStationMoreMin() {
        Radio rad = new Radio();

        rad.setCurrentStation(1);

        int expected = 1;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setStationLessMax() {
        Radio rad = new Radio();

        rad.setCurrentStation(8);

        int expected = 8;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setStationEqualMax() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);

        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setStationMoreMax() {
        Radio rad = new Radio();

        rad.setCurrentStation(10);

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextWhereStationLessMax() {
        Radio rad = new Radio();

        rad.setCurrentStation(8);
        rad.nextStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextWhereStationEqualMax() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);
        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextWhereStationEqualMin() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);
        rad.nextStation();

        int expected = 1;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevWhereStationEqualMax() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);
        rad.prevStation();

        int expected = 8;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevWhereStationEqualMin() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);
        rad.prevStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevWhereStationMoreMin() {
        Radio rad = new Radio();

        rad.setCurrentStation(1);
        rad.prevStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeLessMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void setVolumeEqualMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void setVolumeMoreMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(1);

        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void setVolumeLessMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(9);

        int expected = 9;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void setVolumeEqualMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);

        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void setVolumeMoreMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(11);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseWhereVolumeMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseWhereVolumeLessMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(9);
        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseWhereVolumeMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseWhereVolumeMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseWhereVolumeMoreMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(1);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseWhereVolumeMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.decreaseVolume();

        int expected = 9;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

}