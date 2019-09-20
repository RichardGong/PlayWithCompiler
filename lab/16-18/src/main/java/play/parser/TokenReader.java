package play.parser;

import java.util.List;

/**
 * Token流。
 * 可以read或peekToken。
 * 可以通过unread、setPosition()回溯。
 */
public class TokenReader {

    List<Token> tokens = null;

    //当前指针位置。
    int pos = 0;

    public TokenReader(List<Token> tokens) {
        this.tokens = tokens;
    }

    /**
     * 读取一个Token，并移动指针。
     * @return 如果已经读完，则返回null。
     */
    public Token read() {
        if (pos < tokens.size()) {
            return tokens.get(pos++);
        }
        return null;
    }

    /**
     * 预读一个Token。
     * @return 如果已经读完，则返回null。
     */
    public Token peek() {
        if (pos < tokens.size()) {
            return tokens.get(pos);
        }
        return null;
    }

    /**
     * 回溯一个Token。
     */
    public void unread() {
        if (pos > 0) {
            pos--;
        }
    }

    /**
     * 获取当前指针位置。
     * @return
     */
    public int getPosition() {
        return pos;
    }

    /**
     * 设置指针位置。用于回溯。
     * @param position
     */
    public void setPosition(int position) {
        if (position >=0 && position < tokens.size()){
            pos = position;
        }
    }
}
