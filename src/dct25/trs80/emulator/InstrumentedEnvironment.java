package dct25.trs80.emulator;

public class InstrumentedEnvironment implements Environment {

    public InstrumentedEnvironment() {
        screenClearedCount = 0;
    }
    
    private int screenClearedCount;
    
    public int getScreenClearedCount() { return screenClearedCount; }

    public void clearScreen() {
        screenClearedCount += 1;
    }

    
    public String getPrintedOutput() {
        return _printed.toString();
    }
    private StringBuffer _printed = new StringBuffer();
    public void print(String s) {
        _printed.append(s);
        _printed.append("\n");
    }

}
