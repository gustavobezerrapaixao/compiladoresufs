/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TComentarioBlocoFecha extends Token
{
    public TComentarioBlocoFecha()
    {
        super.setText("*/");
    }

    public TComentarioBlocoFecha(int line, int pos)
    {
        super.setText("*/");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TComentarioBlocoFecha(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTComentarioBlocoFecha(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TComentarioBlocoFecha text.");
    }
}
