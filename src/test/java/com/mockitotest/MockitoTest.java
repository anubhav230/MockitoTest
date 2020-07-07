package com.mockitotest;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class MockitoTest {
    @Mock
    MyDataBase dataBaseMock;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void testQuery() {
        ClassToTest classToTest = new ClassToTest(dataBaseMock);
        when(dataBaseMock.query("Anubhav singh")).thenReturn(true);
        boolean check = classToTest.query("Anubhav singh");
        Assert.assertTrue(check);
    }
}
