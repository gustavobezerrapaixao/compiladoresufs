/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ACaseElse extends PCaseElse
{
    private TSenao _senao_;
    private TDoisPontos _doisPontos_;
    private PCmdSequence _cmdSequence_;

    public ACaseElse()
    {
        // Constructor
    }

    public ACaseElse(
        @SuppressWarnings("hiding") TSenao _senao_,
        @SuppressWarnings("hiding") TDoisPontos _doisPontos_,
        @SuppressWarnings("hiding") PCmdSequence _cmdSequence_)
    {
        // Constructor
        setSenao(_senao_);

        setDoisPontos(_doisPontos_);

        setCmdSequence(_cmdSequence_);

    }

    @Override
    public Object clone()
    {
        return new ACaseElse(
            cloneNode(this._senao_),
            cloneNode(this._doisPontos_),
            cloneNode(this._cmdSequence_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACaseElse(this);
    }

    public TSenao getSenao()
    {
        return this._senao_;
    }

    public void setSenao(TSenao node)
    {
        if(this._senao_ != null)
        {
            this._senao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._senao_ = node;
    }

    public TDoisPontos getDoisPontos()
    {
        return this._doisPontos_;
    }

    public void setDoisPontos(TDoisPontos node)
    {
        if(this._doisPontos_ != null)
        {
            this._doisPontos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._doisPontos_ = node;
    }

    public PCmdSequence getCmdSequence()
    {
        return this._cmdSequence_;
    }

    public void setCmdSequence(PCmdSequence node)
    {
        if(this._cmdSequence_ != null)
        {
            this._cmdSequence_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cmdSequence_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._senao_)
            + toString(this._doisPontos_)
            + toString(this._cmdSequence_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._senao_ == child)
        {
            this._senao_ = null;
            return;
        }

        if(this._doisPontos_ == child)
        {
            this._doisPontos_ = null;
            return;
        }

        if(this._cmdSequence_ == child)
        {
            this._cmdSequence_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._senao_ == oldChild)
        {
            setSenao((TSenao) newChild);
            return;
        }

        if(this._doisPontos_ == oldChild)
        {
            setDoisPontos((TDoisPontos) newChild);
            return;
        }

        if(this._cmdSequence_ == oldChild)
        {
            setCmdSequence((PCmdSequence) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}