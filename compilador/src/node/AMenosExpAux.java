/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AMenosExpAux extends PExpAux
{
    private PExpAux _expAux_;

    public AMenosExpAux()
    {
        // Constructor
    }

    public AMenosExpAux(
        @SuppressWarnings("hiding") PExpAux _expAux_)
    {
        // Constructor
        setExpAux(_expAux_);

    }

    @Override
    public Object clone()
    {
        return new AMenosExpAux(
            cloneNode(this._expAux_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMenosExpAux(this);
    }

    public PExpAux getExpAux()
    {
        return this._expAux_;
    }

    public void setExpAux(PExpAux node)
    {
        if(this._expAux_ != null)
        {
            this._expAux_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expAux_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expAux_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expAux_ == child)
        {
            this._expAux_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expAux_ == oldChild)
        {
            setExpAux((PExpAux) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
