/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ANaoTermo5 extends PTermo5
{
    private TNao _nao_;
    private PTermo5 _termo5_;

    public ANaoTermo5()
    {
        // Constructor
    }

    public ANaoTermo5(
        @SuppressWarnings("hiding") TNao _nao_,
        @SuppressWarnings("hiding") PTermo5 _termo5_)
    {
        // Constructor
        setNao(_nao_);

        setTermo5(_termo5_);

    }

    @Override
    public Object clone()
    {
        return new ANaoTermo5(
            cloneNode(this._nao_),
            cloneNode(this._termo5_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANaoTermo5(this);
    }

    public TNao getNao()
    {
        return this._nao_;
    }

    public void setNao(TNao node)
    {
        if(this._nao_ != null)
        {
            this._nao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nao_ = node;
    }

    public PTermo5 getTermo5()
    {
        return this._termo5_;
    }

    public void setTermo5(PTermo5 node)
    {
        if(this._termo5_ != null)
        {
            this._termo5_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termo5_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._nao_)
            + toString(this._termo5_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._nao_ == child)
        {
            this._nao_ = null;
            return;
        }

        if(this._termo5_ == child)
        {
            this._termo5_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._nao_ == oldChild)
        {
            setNao((TNao) newChild);
            return;
        }

        if(this._termo5_ == oldChild)
        {
            setTermo5((PTermo5) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
