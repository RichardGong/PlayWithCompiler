

public interface TokenReader{
    public Token read();
    public Token peek();
    public void unread();
    public int getPosition();
    public void setPosition(int position);
}