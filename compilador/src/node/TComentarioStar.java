/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TComentarioStar extends Token
{
    public TComentarioStar()
    {
        super.setText("*");
    }

    public TComentarioStar(int line, int pos)
    {
        super.setText("*");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TComentarioStar(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTComentarioStar(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TComentarioStar text.");
    }
}