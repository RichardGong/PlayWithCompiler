package play.parser;

/**
 * 一个简单的Token。
 * 具有文本值、类型、在字符串中的位置等属性。
 */
public class Token {

    //token的类型
    private String type = null;

    //token的文本值
    private String text = null;

    //token在整个字符流中的起止位置
    private int startPos = 0;
    private int endPos = 0;

    //token所在的行列位置
    private int lineNumber = 0;
    private int startColumn = 0;
    private int endColumn = 0;

    //程序结束符号
    protected static Token EOF = new Token("$");

    public Token(String type){
        this.type = type;
    }

    public Token(String type, String text){
        this.type = type;
        this.text = text;
    }

    /**
     * Token的类型
     * @return
     */
    public String getType(){
        return type;
    }

    protected void setType(String type){
        this.type = type;
    }


    public String getText() {
        return text;
    }

    protected void setText(String text) {
        this.text = text;
    }

    public int getStartPos() {
        return startPos;
    }

    protected void setStartPos(int startPos) {
        this.startPos = startPos;
    }

    public int getEndPos() {
        return endPos;
    }

    protected void setEndPos(int endPos) {
        this.endPos = endPos;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    protected void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getStartColumn() {
        return startColumn;
    }

    protected void setStartColumn(int startColumn) {
        this.startColumn = startColumn;
    }

    public int getEndColumn() {
        return endColumn;
    }

    protected void setEndColumn(int endColumn) {
        this.endColumn = endColumn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        Token token = (Token)obj;
        if (!type.equals(token.type)){
            return false;
        }

        if (text== null){
            if (token.text != null){
                return false;
            }
        }
        else{
            if (!text.equals(token.text)){
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString(){
        String rtn = type;

        rtn += ":";
        if(text != null){
             rtn += text;
        }

        return rtn;
    }
}