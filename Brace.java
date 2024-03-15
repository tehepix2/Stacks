public class Brace {
    private char state;
    private char type;
    
    public Brace(char state, char type) {
        this.state = state;
        this.type = type;
    }

    public char getState() {
        return state;
    }

    public char getType() {
        return type;
    }

    public void changeState() {
        if (state == 'c') {
            state = 'o';
        }
        else if (state == 'o') {
            state = 'c';
        }
    }


}
