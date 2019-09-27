package com.hz;

public class IntWrapper {

    private ConsoleReader _reader;

    public IntWrapper(ConsoleReader reader) {
        this._reader = reader;
    }

    public int readInt() {

        try {
            String input = _reader.readLine();
            int i = Integer.parseInt(input);

            return i;
        }
        catch(Exception ex) {
            return -1;
        }
    }
}
