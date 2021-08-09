package com.atguigu.maven;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloFriendTest {
    @Test
    public void testHelloFriend() {
        HelloFriend helloFriend = new HelloFriend();
        String results = helloFriend.sayHelloToFriend("Maven");
        assertEquals("Hello Maven! I am Idea", results);
    }

}
