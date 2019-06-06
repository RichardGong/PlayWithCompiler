package compiler;

import java.io.CharArrayReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SimpleLexer1 {

    public static void main(String args[]) {
        SimpleLexer1 lexer = new SimpleLexer1();
        lexer.tokenize("age>=45");
    }

    private StringBuffer tokenText = null;
    private List<String> tokens = null;

    private boolean isAlpha(int ch) {
        return ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z';
    }

    private boolean isDigit(int ch) {
        return ch >= '0' && ch <= '9';
    }

    private void createToken() {
        System.out.println(tokenText.toString());
        tokens.add(tokenText.toString());
        tokenText = new StringBuffer();
    }

    public List<String> tokenize(String code) {
        tokens = new ArrayList<String>();
        CharArrayReader reader = new CharArrayReader(code.toCharArray());
        tokenText = new StringBuffer();
        int ich = 0;
        char ch = 0;
        int state = 1;
        try {
            while ((ich = reader.read()) != -1) {
                ch = (char)ich;
                switch (state) {
                case 1:
                    if (isAlpha(ch)) {
                        state = 2;
                        tokenText.append(ch);
                    } else if (isDigit(ch)) {
                        state = 4;
                        tokenText.append(ch);
                    } else if (ch == '>') {
                        state = 3;
                        tokenText.append(ch);
                    } else {
                        state = 1;   //skip all unknown patterns
                    }
                    break;
                case 2:
                    if (isAlpha(ch) || isDigit(ch)) {
                        tokenText.append(ch);
                    } else {
                        state = 1;
                        createToken();
                    }
                    break;
                case 3:
                    if (ch == '=') {
                        tokenText.append(ch);
                    } else {
                        state = 1;
                        createToken();
                    }
                    break;
                case 4:
                    if (isDigit(ch)) {
                        tokenText.append(ch);
                    } else {
                        state = 1;
                        createToken();
                    }
                    break;
                }

            }
            //把最后一个token送进去
            if (tokenText.length() >0){
                createToken();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return tokens;
    }

}