package com.sdet.auto;

import com.sdet.auto.TestHelper.TestAssert;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

import java.io.IOException;

public class TestBaseClass {

    public TestAssert testAssert;

    @BeforeClass
    public static void MyClassInitialize() throws IOException {}

    @Before
    public void MyTestInitialize() {
        testAssert = new TestAssert();
    }

    @After
    public void MyTestCleanup(){
        Assert.assertTrue(testAssert.getPass());
    }
}