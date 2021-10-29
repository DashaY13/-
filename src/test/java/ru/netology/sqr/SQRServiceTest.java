package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @org.junit.jupiter.api.Test
    void quantitySQR() {
        SQRService Service = new SQRService();
        int expected = 3;
        int actual = Service.quantitySQR(200, 300);
        assertEquals(expected, actual);
    }
}