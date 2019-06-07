package compiler;

public interface TokenReader{
    public Token read();
    public Token peek();
    // public void unread();
}