package com.ua.viktor.mytestjenkins;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class ExampleUnitTest {
    @Test
    public void UserNameTest() {
        User u = new User();

        u.setName("foo");

        Assert.assertEquals("foo", u.getName());
    }
}