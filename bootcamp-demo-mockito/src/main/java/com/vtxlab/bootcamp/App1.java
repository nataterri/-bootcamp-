package com.vtxlab.bootcamp;

import java.util.List;

public class App1 {

    private App2 app2;

    // if you want to use @InjectMock, then you have to create this all args constructor
    // public App1(App2 app2) {
    //     this.app2 = app2;
    // }

    // Developer A
    public int add(int x, int y) { // assert ?
        // For UT, we should Mock the external call
        // because, we don't want the test code of add() method will be changed in the future
        // due to the main code change in other methods
        int result = this.app2.provider(x * 2, y); // unit test: isolate app2.provider()

        if (x > 10 && y < 20) //
            return result + 1000;
        return result + 500;
    }

    // Developer A
    public int mulitply(int x, int y) {
        return this.app2.provider(x, y) + this.app2.provider2(x, y);
    }

    public String firstCharacters(List<String> strings) {
        StringBuilder sb = new StringBuilder();
        char encoded;
        for (String s : strings) {
            encoded = this.app2.encode(s.charAt(0));
            sb.append(encoded);
        }
        return sb.toString();
    }

}
