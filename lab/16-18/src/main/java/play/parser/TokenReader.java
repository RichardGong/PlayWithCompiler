package play.parser;

import java.util.List;

/**
 * Token流。
 * 可以read或peekToken。
 * 可以通过unread、setPosition()回溯。
 */
public class TokenReader {

    List<Token> tokens = null;
    int pos = 0;

    public TokenReader(List<Token> tokens) {
        this.tokens = tokens;
    }

    public Token read() {
        if (pos < tokens.size()) {
            return tokens.get(pos++);
        }
        return null;
    }

    public Token peek() {
        if (pos < tokens.size()) {
            return tokens.get(pos);
        }
        return null;
    }

    public void unread() {
        if (pos > 0) {
            pos--;
        }
    }

    public int getPosition() {
        return pos;
    }

    public void setPosition(int position) {
        if (position >=0 && position < tokens.size()){
            pos = position;
        }
    }
}
