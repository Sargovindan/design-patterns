package pl.finsys.behavioral.visitor;

public interface IVisitable {
    public void accept(IVisitor visitor);
}
