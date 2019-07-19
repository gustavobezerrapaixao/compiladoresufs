/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ATermo3Elemento1 extends PElemento1
{
    private PTermo3 _termo3_;

    public ATermo3Elemento1()
    {
        // Constructor
    }

    public ATermo3Elemento1(
        @SuppressWarnings("hiding") PTermo3 _termo3_)
    {
        // Constructor
        setTermo3(_termo3_);

    }

    @Override
    public Object clone()
    {
        return new ATermo3Elemento1(
            cloneNode(this._termo3_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATermo3Elemento1(this);
    }

    public PTermo3 getTermo3()
    {
        return this._termo3_;
    }

    public void setTermo3(PTermo3 node)
    {
        if(this._termo3_ != null)
        {
            this._termo3_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termo3_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._termo3_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._termo3_ == child)
        {
            this._termo3_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._termo3_ == oldChild)
        {
            setTermo3((PTermo3) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}