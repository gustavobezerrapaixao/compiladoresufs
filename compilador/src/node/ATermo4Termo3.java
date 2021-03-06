/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ATermo4Termo3 extends PTermo3
{
    private PTermo4 _termo4_;

    public ATermo4Termo3()
    {
        // Constructor
    }

    public ATermo4Termo3(
        @SuppressWarnings("hiding") PTermo4 _termo4_)
    {
        // Constructor
        setTermo4(_termo4_);

    }

    @Override
    public Object clone()
    {
        return new ATermo4Termo3(
            cloneNode(this._termo4_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATermo4Termo3(this);
    }

    public PTermo4 getTermo4()
    {
        return this._termo4_;
    }

    public void setTermo4(PTermo4 node)
    {
        if(this._termo4_ != null)
        {
            this._termo4_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termo4_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._termo4_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._termo4_ == child)
        {
            this._termo4_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._termo4_ == oldChild)
        {
            setTermo4((PTermo4) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
