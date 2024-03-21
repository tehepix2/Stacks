public class Brace {
    private char state;
    private char type;
    private char close;
    private int index;
    
    public Brace(char state, char type, int index, char close) {
        this.state = state;
        this.type = type;
        this.index = index;
        this.close = close;
    }

    public char getState() {
        return state;
    }

    public char getType() {
        return type;
    }

    public int getIndex() {
        return index;
    }

    public char getClose() {
        return close;
    }
    public void changeState() {
        if (state == 'o') {
            state = 'c';
        }
        else if (state == 'c') {
            state = 'o';
        }
    }


}
