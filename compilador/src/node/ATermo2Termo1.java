/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ATermo2Termo1 extends PTermo1
{
    private PTermo2 _termo2_;

    public ATermo2Termo1()
    {
        // Constructor
    }

    public ATermo2Termo1(
        @SuppressWarnings("hiding") PTermo2 _termo2_)
    {
        // Constructor
        setTermo2(_termo2_);

    }

    @Override
    public Object clone()
    {
        return new ATermo2Termo1(
            cloneNode(this._termo2_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATermo2Termo1(this);
    }

    public PTermo2 getTermo2()
    {
        return this._termo2_;
    }

    public void setTermo2(PTermo2 node)
    {
        if(this._termo2_ != null)
        {
            this._termo2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termo2_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._termo2_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._termo2_ == child)
        {
            this._termo2_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._termo2_ == oldChild)
        {
            setTermo2((PTermo2) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
