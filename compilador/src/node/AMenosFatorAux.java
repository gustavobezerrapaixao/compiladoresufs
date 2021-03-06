/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AMenosFatorAux extends PFatorAux
{
    private TMenos _menos_;
    private PFatorAux _fatorAux_;

    public AMenosFatorAux()
    {
        // Constructor
    }

    public AMenosFatorAux(
        @SuppressWarnings("hiding") TMenos _menos_,
        @SuppressWarnings("hiding") PFatorAux _fatorAux_)
    {
        // Constructor
        setMenos(_menos_);

        setFatorAux(_fatorAux_);

    }

    @Override
    public Object clone()
    {
        return new AMenosFatorAux(
            cloneNode(this._menos_),
            cloneNode(this._fatorAux_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMenosFatorAux(this);
    }

    public TMenos getMenos()
    {
        return this._menos_;
    }

    public void setMenos(TMenos node)
    {
        if(this._menos_ != null)
        {
            this._menos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._menos_ = node;
    }

    public PFatorAux getFatorAux()
    {
        return this._fatorAux_;
    }

    public void setFatorAux(PFatorAux node)
    {
        if(this._fatorAux_ != null)
        {
            this._fatorAux_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fatorAux_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._menos_)
            + toString(this._fatorAux_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._menos_ == child)
        {
            this._menos_ = null;
            return;
        }

        if(this._fatorAux_ == child)
        {
            this._fatorAux_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._menos_ == oldChild)
        {
            setMenos((TMenos) newChild);
            return;
        }

        if(this._fatorAux_ == oldChild)
        {
            setFatorAux((PFatorAux) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
